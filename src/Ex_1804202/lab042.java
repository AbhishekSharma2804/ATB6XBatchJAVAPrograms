package Ex_1804202;

public class lab042 {
    public static void main(String[] args) {
        int a1=300;
        byte b1= (byte)a1; //explicit casting
        System.out.println(b1); // ans is 44 - data loss

        // 300 → 32 bits  ----- 1 00101100
        // byte - 8 bits   ----- 00101100 ---converted to 44
    }
}
