package JavaBasic_Bai5;

import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {

        //Khởi tạo ArrayList số chẵn
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        //Tạo vòng lặp FOR để in ra các số chẵn và thêm vào mảng
        for (int i = 0; i <= 50; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
                evenNumbers.add(i);
            }
        }

        //Duyệt mảng để in ra kết quả
        System.out.println("\n========================");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        //Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
        ArrayList<String> nhanVien = new ArrayList<String>();
        nhanVien.add("Vũ Kim An");
        nhanVien.add("18/08/1998");
        nhanVien.add("TP.HCM");
        nhanVien.add("QC Engineer");

        //in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
        System.out.println("\n========================");
        for (int i = 0; i < nhanVien.size();i++) {
            System.out.println(nhanVien.get(i));
        }
    }
}
