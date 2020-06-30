package Users;

public class User {
    private String firstName;
    private String lastName;
    private int workPhone;
    private int mobilePhone;
    private String email;
    private String password;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getWorkPhone()
    {
        return workPhone;
    }

    public void setWorkPhone(int workPhone)
    {
        this.workPhone = workPhone;
    }

    public int getMobilePhone()
    {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone)
    {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail()
    {
        return emailCheck() ? email : "Please enter your email address in format: example@example ";
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return passCheck() ? password : "Password should be at least 8 up to 16 characters";
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    private boolean emailCheck()
    {
        return email.contains("@");
    }

    private boolean passCheck()
    {
        return password.length() >= 8 & password.length() <= 16;
    }


}