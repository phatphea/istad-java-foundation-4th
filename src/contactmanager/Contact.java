package contactmanager;

public class Contact {

    private static Long nextId = 1L; //declare auto generate id

    private Long id = null;
    private String name;
    private String phone;
    private String email;

    public Contact(){
        this("No name", "Null", "Null");

    }

    public Contact(String name, String phone, String email) {
        this.id = nextId++;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
