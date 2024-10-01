package Ex_20042024;

public class Lab064 {
    public static void main(String[] args) {
        String password = "123ABC";
        String passu= password.toLowerCase();
        System.out.println(passu==password);
        System.out.println(passu.equals(password));
        System.out.println(passu.equalsIgnoreCase(password));

        System.out.println(password.substring(0,3)); ///value from 0-2
        System.out.println(password.indexOf("A"));

    }
}
