public class User {
    private int id;
    private String fname, lname, email,password,contact, userName;

    public User() {}

    public User(String fname, String lname, String userName, String email, String password, String contact) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.contact = contact;
    }

    public User(int id, String fname, String lname, String email, String password, String contact) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String name) {
        this.fname = name;
    }
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

}

