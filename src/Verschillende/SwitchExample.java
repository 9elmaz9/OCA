package Verschillende;

public class SwitchExample {

    public static void main(String[] args) {

        int num=20;
        final int num2=20;

        switch (num){
            default:
                System.out.println("default");
            case num2:
                System.out.println(4);

                break;
        }
    }
}
