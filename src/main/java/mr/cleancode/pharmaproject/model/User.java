package mr.cleancode.pharmaproject.model;

import java.util.Date;

public class User {
    private String username;
    private String name;
    private String firstname;
    private String email;
    private String tel;
    private Date birthdate;

    public User(String usr, String fn, String n, String em, String tel, Date bd){
        this.username = usr;
        this.name = n;
        this.firstname = fn;
        this.email = em;
        this.tel = tel;
        this.birthdate = bd;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
