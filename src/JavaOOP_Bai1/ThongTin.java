package JavaOOP_Bai1;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanvien1 = new NhanVien("Phương",25,"11/1/2000","Nữ");
        NhanVien nhanvien2 = new NhanVien("Hương",24,"20/02/2001","Nữ");

        System.out.println(nhanvien1.fullName);
        System.out.println(nhanvien1.age);
        System.out.println(nhanvien1.birthDate);
        System.out.println(nhanvien1.gender);
        nhanvien1.createEmployee();
        nhanvien1.updateEmployee();
        nhanvien1.deleteEmployee();

    }
}
