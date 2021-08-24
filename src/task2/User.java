package task2;

public class User {
    private int iD=0;

    public void setiD(int iD) {
        this.iD = iD;
    }

    private String login;
    private String password;
    private String name;
    private boolean deleted = false;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getiD() {
        return iD;
    }

    @Override
    public String toString() {
        return "User{" +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", deleted=" + deleted +
                " , id "+ iD+
                '}';
    }

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.deleted = false;
    }
}
