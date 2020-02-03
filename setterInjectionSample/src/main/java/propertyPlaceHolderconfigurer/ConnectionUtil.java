package propertyPlaceHolderconfigurer;

public class ConnectionUtil {

    private String driverClass;
    private String url;
    private String userName;
    private String passWord;

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void getConnection() {
        System.out.println(driverClass);
        System.out.println(url);
        System.out.println(userName);
        System.out.println(passWord);
    }
}
