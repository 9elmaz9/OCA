package Verschillende;

public class PriorityExample2 {

    public static void main(String[] args) {

        int x = 1;
        int y = 0;


        // x++ , znachit 1+1=x=2 + esli X perviy  to eto chifra  x++ bydet 1 + 1 , esli ++ pervoe to eto 1 ,
        // tipo ++=1 dalshe  ++y=1+0=1
        if(x++>++y) {
            System.out.println("Hello");
        }else{
            System.out.println("Welcome");

        }
        System.out.println("Log"+ x+":"+y);
    }
}
