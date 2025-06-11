package JavaBasic_Bai2;

public class Calculator {

    public static int cong2SoNguyen (int a, int b) {
        return a + b;
    }

    public static float nhan2SoThuc (float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(cong2SoNguyen(1,2));
        System.out.println(nhan2SoThuc(1.1F,2.2F));
    }
}
