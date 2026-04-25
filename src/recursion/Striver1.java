//Print Name N times using Recursion

//Problem Description: Given an integer N, write a program to print your name N times.
public class Striver1 {
    public static void printname(String name,int n,int count) {
       // Base condition: stop when count reaches n
        if (count == n) {
            return;  
        }
        System.out.println(name);

        printname(name, n, count+1);
    }
    public static void main(String[] args) {
        printname("Asish", 5, 0);
        
    }
}
