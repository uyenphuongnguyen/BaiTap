package JavaBasic_Bai4;

public class ForLoop {

    public static void main(String[] args) {

        //Khởi tạo mảng số chẵn
        int evenNumbers[] = new int[26];
        int index = 0;

        //Tạo vòng lặp FOR để in ra các số chẵn và thêm vào mảng
        for (int i = 0; i <= 50; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
                evenNumbers[index] = i;
                index++;
            }
        }

        //Duyệt mảng để in ra kết quả
        System.out.println("\n========================");
        for (int num = 0; num < evenNumbers.length; num++) {
            System.out.print(evenNumbers[num] + " ");
        }

    }
}
