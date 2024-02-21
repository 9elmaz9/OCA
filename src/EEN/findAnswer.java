package EEN;

public class findAnswer {

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
       // System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

}
/*
This code defines a method named findAnswer that takes a boolean parameter named check. Here's a breakdown of the code:

Variable Declarations:

int answer;: Declares an integer variable named answer.
int onlyOneBranch;: Declares another integer variable named onlyOneBranch.
Conditional Statement (if-else):

The code checks the value of the check parameter.
If check is true, it enters the if block:
onlyOneBranch is assigned the value 1.
answer is also assigned the value 1.
If check is false, it enters the else block:
answer is assigned the value 2.
Print Statements:

System.out.println(answer);: Prints the value of the answer variable.
System.out.println(onlyOneBranch); // DOES NOT COMPILE: Attempts to print the value of the onlyOneBranch variable.
Compilation Error:

The code attempts to print the value of onlyOneBranch outside the if block, but there is a compilation error.
The reason is that onlyOneBranch might not have been initialized if the check condition is false.
The compiler detects this and raises an error indicating that the variable might not have been initialized.
Error Comment:

The comment // DOES NOT COMPILE is added to indicate that the line attempting to print onlyOneBranch will result in a compilation error.

 */




//Инициализируя onlyOneBranch перед оператором if,
//вы гарантируете, что у нее всегда есть значение, даже если блок if не выполняется.
class findAnswer2 {
    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch = 0; // Initialize to a default value

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
        System.out.println(onlyOneBranch);
    }
}
