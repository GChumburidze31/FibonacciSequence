import java.util.Scanner;
/*
Create a program that generates the Fibonacci sequence up to a number n provided by the user.
 */


public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number, and we will generate a Fibonacci sequence based on it: ");

        int num = sc.nextInt();
        int currentNum = 0;
        int followNum = 1;
        int newN = 0;
        for (int i = 1; i != num; i++){
            System.out.print(currentNum + " ");
            newN = currentNum + followNum;
            currentNum = followNum;
            followNum = newN;
        }
    }
}