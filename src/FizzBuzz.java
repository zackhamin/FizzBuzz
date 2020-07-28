import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case inputNumber % 3 == 0 && inputNumber % 5 == 0:
                System.out.println("Fizzbuzz");
                break;
            case inputNumber % 3 == 0:
                System.out.println("Fizz");
                break;
            case inputNumber % 5 == 0:
                System.out.println("Buzz");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + inputNumber);
        }
        }
    }

