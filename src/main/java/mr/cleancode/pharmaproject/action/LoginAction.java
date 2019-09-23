package mr.cleancode.pharmaproject.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {
    private String username;
    private String psw;
    private Map<String, Object> sessionMap;
    private static final Logger LOG = LoggerFactory.getLogger(LoginAction.class);

    @Override
    public void validate(){
        if (username == null || username.equals("") || psw==null || psw.length()==0) {
            addActionError(getText("error.enter.data"));
            return;
        }

        if(username.length() < 3 || username.length() > 15)
            addActionError(getText("error.enter.correct.username"));

    }

    public String checkConnexion() throws Exception {
        if(sessionMap.containsKey("username"))
            return ActionSupport.ERROR;
        return ActionSupport.SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        if(sessionMap != null && sessionMap.containsKey("username")) {
            username = (String)sessionMap.get("username");
            return ActionSupport.SUCCESS;
        }

        validate();
        String password = "admin"; // registred password

        // recupérer le mot de passe de la base de donnée

        if(username.equals("admin" ) && psw.equals(password)){
            sessionMap.put("username", username);
            return ActionSupport.SUCCESS;
        }

        addActionError(getText("error.enter.correct.password"));

        return ActionSupport.ERROR;
    }

    public String logout() {
        if (sessionMap.containsKey("userName")) {
            sessionMap.remove("userName");
        }
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }
}
