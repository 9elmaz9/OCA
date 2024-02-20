package EEN;

 // Given:
 //      String mStr = "123";
 //      long m = // 1
 //      Which of the following options when put at //1 will assign 123 to m?


public class EX {

    public static void main(String[] args) {


        String mStr = "123";
        long m = Long.parseLong(mStr); // 1
        System.out.println(m);
    }
}


/* To convert the String value "123" to a long, you can use the Long.parseLong() method. Here's the correct option:

String mStr = "123";
long m = Long.parseLong(mStr); // 1


So, the correct option at //1 is Long.parseLong(mStr). This will parse the string "123" and assign the long value to the variable m.


*/