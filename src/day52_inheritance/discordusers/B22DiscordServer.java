package day52_inheritance.discordusers;

public class B22DiscordServer {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Ali");
        user.setId(1234);
        user.setRole("Student");
        System.out.println(user);


        Admin admin = new Admin();
        admin.setId(1147);
        admin.setName("Burak");
        admin.setRole("Admin");
        System.out.println(admin);

    }
}
