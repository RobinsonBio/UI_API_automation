package co.com.training.techandsolve.models;

public class NewUser {


    private String name;
    private String lastname;
    private String password;
    private String email;

    public NewUser(String name, String lastname, String password, String email) {
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


}
