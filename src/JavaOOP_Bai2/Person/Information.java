package JavaOOP_Bai2.Person;

public class Information {

    public static void main(String[] args) {
        Person person = new Person("Phương",20,"Nữ","HCM","123456");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhone());
    }
}
