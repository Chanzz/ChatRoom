package xyz.chanjiji.ChatRoom.bean;

public class User {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uNickname;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public User() {
    }

    public User(Integer uId, String uName, String uPassword, String uNickname) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uNickname = uNickname;
    }
}