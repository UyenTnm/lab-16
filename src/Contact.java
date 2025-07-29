// import java.lang.reflect.Constructor;

public class Contact {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;

    public Contact(int id, String name, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddresss(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("ID " + id + ", name " + name + ", phone " + phone + ", email " + email
                + ", address " + address);
    }
}
