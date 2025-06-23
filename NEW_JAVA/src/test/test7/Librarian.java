package test.test7;

public class Librarian {
    public int id;
    public String name;
    public String contact_number;

    public Librarian(int id, String contact_number, String name) {
        this.id = id;
        this.contact_number = contact_number;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact_number='" + contact_number + '\'' +
                '}';
    }

    public void showLibrarianDetails() {
        System.out.println("id: " + id + ", name: " + name + ", contact number: " + contact_number);
    }
}

