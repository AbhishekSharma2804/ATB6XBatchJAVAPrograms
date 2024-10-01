package Ex_20042024;

public class lab058 {
    public static void main(String[] args) {
        String s1= "hello" ;
        String s2= " guys" ;
        String s3= "hello guys" ;
        //3 strings will be created

        String s4=s1.concat(" "+s2);//4th string will be created

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //Strings are immutable in nature
        //if u want to change the values , don't use string class
        //rather use string builder,string buffer. - API, web automation
    }
}
