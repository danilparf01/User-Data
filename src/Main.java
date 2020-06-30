import Users.User;
import Users.UserExp;

public class Main {
    public static void main(String[] args) {
        UserExp user1 = new UserExp();
        user1.setFirstName("ASDFGH");
        user1.setLastName("asdfgh");
        user1.setEmail("asdгsd");
        user1.setMobilePhone(1234);
        user1.setWorkPhone(5678);
        user1.setPassword("123567891234567");
        user1.setExperience(6);
        user1.setSalary(1000);
        System.out.println("First Name : " + user1.getFirstName());
        System.out.println("Last Name : " + user1.getLastName());
        System.out.println("Email : " + user1.getEmail());
        System.out.println("Mobile Phone : " + user1.getMobilePhone());
        System.out.println("Work Phone : " + user1.getWorkPhone());
        System.out.println("Password : " + user1.getPassword());
        System.out.println("Salary : " + user1.getSalary());
        System.out.println("Experience : " + user1.getExperience());

    }

}

