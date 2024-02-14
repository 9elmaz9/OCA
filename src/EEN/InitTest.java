package EEN;


//What will the following program print?
public class InitTest{
    public InitTest(){
        s1 = sM1("1"); // 5
    }
    static String s1 = sM1("a"); // 1
    String s3 = sM1("2"); //4
    static{
        s1 = sM1("b");  //2
    }
    static String s2 = sM1("c"); // 3
    String s4 = sM1("4"); //5
    public static void main(String args[]){
        InitTest it = new InitTest();
    }
    private static String sM1(String s){
        System.out.println(s);  return s;
    }
}

/*The corrected explanations for each step are:

Step 1: static String s1 = sM1("a"); - Static variable initialization. Prints "a".
Step 2: static{ s1 = sM1("b"); } - Static block. Executes after static variable initializations. Prints "b".
Step 3: static String s2 = sM1("c"); - Another static variable initialization. Prints "c".
Step 4: s1 = sM1("1"); - Assigns the result of sM1("1") to the static variable s1. Prints "1".
Step 5: String s3 = sM1("2"); - Assigns the result of sM1("2") to the instance variable s3. Prints "2".
Step 6: String s4 = sM1("4"); - Assigns the result of sM1("4") to the instance variable s4. Prints "4".*/