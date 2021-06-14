package day52_inheritance.discordusers;

public class Admin extends User {

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
