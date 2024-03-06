//package TEST1.process;
//
//import java.util.ArrayList;
//
//interface Process {
//    //Это функциональный интерфейс с единственным методом process, который принимает два целых числа в
//    // качестве параметров.
//    public void process(int a,int b);
//
//}
//
//
//public class Data{
//    int value ;     //This class has an integer field value and a constructor to initialize it.
//    Data(int value){
//        this.value=value;
//    }
//
//
//public void processList(ArrayList<Data> dataList,Process p){
//    for (Data d:dataList) {
//        p.process(d.value,d.value);
//
//    //}
//
//
////ArrayList<Data> al =new ArrayList<Data>();
// //   al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
//    //An ArrayList named al is created and initialized with three Data objects having values 1, 2, and 3.
//
//   // processList(al,(int a,int b)->System.out.println(a*b));
//
//    /*
//    * This line calls the processList method, passing the ArrayList al and a lambda expression as arguments.
//    *  The lambda expression implements the process method of the Process interface, printing the product of a and b.
//
//In summary, the code demonstrates the use of an interface (Process) with a single method, a class (Data) with
//* a method (processList) that takes an ArrayList and a functional interface as parameters, and then it initializes
//* an ArrayList of Data objects and applies the processList method using a lambda expression to print the product of
//*  value for each Data object in the list.*/