package co.com.training.techandsolve.models;

public class User {

    private String password_login;
    private String email_login;

    public User(String password, String email) {
        this.password_login = password;
        this.email_login = email;
    }

    public String getPassword_login() {
        return password_login;
    }

    public String getEmail_login() {
        return email_login;
    }

}
