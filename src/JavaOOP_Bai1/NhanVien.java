package JavaOOP_Bai1;

public class NhanVien {

    public String fullName;
    public int age;
    public String birthDate;
    public String gender;

    public NhanVien(String fullName, int age, String birthDate, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public void createEmployee() {
        System.out.println("Create Employee Success!");
    }

    public void updateEmployee() {
        System.out.println("Update Employee Success!");
    }

    public void deleteEmployee() {
        System.out.println("Delete Employee Success!");
    }

}
