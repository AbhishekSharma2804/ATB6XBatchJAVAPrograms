package Ex_20042024;

public class lab056 {
    public static void main(String[] args) {
        String name= "TTA";
        String name1= "TTA";// One string created pointing to TTA
        //However if we change TTA to TTa 2 strings will be created

        String name2 = new String("TTA");//Heap Area (OA)
        // 2 strings will be created now
    }
}
