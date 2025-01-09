public class Person {
    private String name;
    private String email;
    private String phone;
    public Person(String nameIn, String emailIn, String phoneIn) {
        name = nameIn;
        email = emailIn;
        phone = phoneIn;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
}