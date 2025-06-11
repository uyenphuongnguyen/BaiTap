package JavaBasic_Bai3;

public class ToanTuVaDieuKien {

    //Hàm điều kiện
    public static void soSanhSo (int n) {
        int number = 100;
        if (n == number) {
            System.out.println("n bằng number");
        }
        else if (n < number) {
            System.out.println("n nhỏ hơn number");
        }
        else {
            System.out.println("n lớn hơn number");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        // Toán tử so sánh
        System.out.println("a > b: " + (a > b));     // false
        System.out.println("a < b: " + (a < b));     // true
        System.out.println("a == c: " + (a == c));   // false

        // Toán tử logic && (AND)
        System.out.println("(a < b) && (a == c): " + ((a < b) && (a == c)));  // false

        // Toán tử logic || (OR)
        System.out.println("(a > b) || (a == c): " + ((a < b) || (a == c)));  // true

        //In ra màn hình của hàm điều kiện
        soSanhSo(101);

    }



}
