public class User {
    String id;
    String password;
    String identificationNumber;
    String mobilePhoneNumber;

    public User() {
    }

    public User(String id, String password, String identificationNumber, String mobilePhoneNumber) {
        this.id = id;
        this.password = password;
        this.identificationNumber = identificationNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
}
