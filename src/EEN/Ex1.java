package EEN;
//Consider the following code for the main() method:
public class Ex1 {
    public static void main(String[] args) throws Exception{
        int i = 1, j = 10;
        do {
            if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}
//What will be the output when the above code is executed?




/*Initial values: i=1, j=10.
Iteration 1: i++ > --j is false (1 > 9 is false), so the continue statement is not executed. Increment i and decrement j.
New values: i=2, j=9.
Iteration 2: i++ > --j is false (2 > 8 is false), so the continue statement is not executed. Increment i and decrement j.
New values: i=3, j=8.
Iteration 3: i++ > --j is false (3 > 7 is false), so the continue statement is not executed. Increment i and decrement j.
New values: i=4, j=7.
Iteration 4: i++ > --j is false (4 > 6 is false), so the continue statement is not executed. Increment i and decrement j.
New values: i=5, j=6.
Loop condition (i < 5) is false, exit the loop.
Finally, the System.out.println("i=" + i + " j=" + j); statement prints "i=5 j=6*/