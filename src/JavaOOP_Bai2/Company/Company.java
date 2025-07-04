package JavaOOP_Bai2.Company;

import JavaOOP_Bai2.Person.Person;

public class Company {

    public static void main(String[] args) {
        Person person = new Person("Phương",20,"Nữ","HCM","123456");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
