package JavaBasic_Bai1;

public class SinhVien {

    public String name = "Nguyễn Văn A"; //Biến toàn cục (Biến instance)
    public static String shoolName = "Đại học Công nghệ thông tin"; //Biến static

    public void getAge () {
        int age = 20; //Biến cục bộ (Biến local)
    }

    public static void main(String[] args) {
        //In biến static
        System.out.println(shoolName);

        //In biến local
        SinhVien sinhvien = new SinhVien();
        System.out.println(sinhvien.name);

        //Khôn in được biến local
        //System.out.println(sinhvien.age);

        //In ra màn hình biến static của class ThongTin
        System.out.println(ThongTin.hoVaTen);
        System.out.println(ThongTin.ngaySinh);
        System.out.println(ThongTin.gioiTinh);
    }

}
