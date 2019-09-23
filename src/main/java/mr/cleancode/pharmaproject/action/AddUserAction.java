package mr.cleancode.pharmaproject.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import mr.cleancode.pharmaproject.model.User;
import org.apache.struts2.interceptor.SessionAware;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class AddUserAction extends ActionSupport implements SessionAware {
    private String username;
    private String name;
    private String firstname;
    private String email;
    private String tel;
    private String birthdate;

    private Map<String, Object> sessionMap;
    private static final Logger LOG = LoggerFactory.getLogger(LoginAction.class);

    @Override
    public String execute() throws Exception{
        validate();
        try{
            Date bd = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
            User user = new User(username, firstname, name, email, tel, bd);
            // TODO verify object doesnt exist
            /// TODO persist object user

            addActionMessage("l'utilisateur " + username + " a été ajouté avec succès.");
        }
        catch(Exception e){
            LOG.error(e.getMessage());
            System.out.println(e.getMessage());
        }

        return ActionSupport.SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sessionMap = map;
    }

    @Override
    public void validate(){
        LOG.info(username + " " + firstname + " " + name + " " + tel + " "+ email + " " + birthdate);
        if(username == null || firstname == null || name== null || email == null || tel == null || birthdate == null ||
                username.isEmpty() || firstname.isEmpty() || name.isEmpty() || email.isEmpty() || tel.isEmpty()){
            addActionError(getText("error.enter.correct.data"));
        }
        try{
            new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
        }catch(Exception e){
            addActionError(getText("error.enter.correct.data"));
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
