package EEN;

public class EX6 {



   // What will be the result of attempting to compile and run the following class?

        public static void main(String args[ ] ){
            int i, j, k;
            i = j = k = 9;
            System.out.println(i);
        }
    }


/* Here's the breakdown of the code:

i = j = k = 9;: This line initializes variables i, j, and k with the value 9. This is a chained assignment, where k is assigned 9, then j is assigned the value of k (which is 9), and finally, i is assigned the value of j (which is also 9).

System.out.println(i);: This line prints the value of variable i, which is 9.

As a result, when you run the program, it will output:

9*/
