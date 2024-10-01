package Ex_20042024;

public class lab059 {
    public static void main(String[] args) {
        String name= "TTA"; //SCP - String Constant Pool
        String name1= "TTA";// SCP - String Constant Pool

        String name2 = new String("TTA");//Heap Area (Object Area)

        System.out.println(name==name1);//Check the references - boolean
        System.out.println(name.equals(name1));

        System.out.println(name==name2);//Check the references - boolean
        System.out.println(name.equals(name2));
    }
}
