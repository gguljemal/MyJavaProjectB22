package day48_constructors_static;

public class Customer {

    private String name;
    private int id;

    public Customer() {
        System.out.println("No-args constructor");
        name = "new costumer";
        id = -1;
    }

    public Customer(String newName, int newId) {
        System.out.println("2-args constructor");
        setName(newName); // or --> this.name = newName;
        setId(newId);  //    or --> this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
