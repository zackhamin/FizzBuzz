import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber %3 == 0 && inputNumber % 5 == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (inputNumber % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (inputNumber % 5 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(inputNumber);
        }
    }

