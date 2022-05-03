package banks.main;

public class UserInformation {
    private String firstName;
    private String lastName;
    private String age;
    private String money;

    public UserInformation(String firstName, String lastName, String age, String money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.money = money;
    }

    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public String getAge() {
        return age;
    }
    public String getMoney() {
        return money;
    }

}
