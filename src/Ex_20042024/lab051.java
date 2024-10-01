package Ex_20042024;

public class lab051 {
    public static void main(String[] args) {
        int a=87;
        long b= 91;
        String s1="kk";
        String s2 = "vv";
        System.out.println(s1+s2+a+b); //normal concatenation
        System.out.println(s1+s2+(a+b)); // concatenate the outer values with the sum inside - BODMAS

    }
}
