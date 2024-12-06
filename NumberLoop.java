// Module 4 Critical Thinking Option 1 - Wyeth Abel
import java.util.Scanner;

public class NumberLoop {
    public static void main(String[] args) {
        floatProcessor();
    }
    public static void floatProcessor() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        int index = 0;
        System.out.println("Please input 5 floats: ");
        while (index < 5) {
            numbers[index] = scanner.nextDouble();
            index++;
        }
        double total = 0.0;
        double maximum = numbers[0];
        double minimum = numbers[0];
        for (double i : numbers) {
            total += i;
            if (i > maximum) maximum = i;
            if (i < minimum) minimum = i;
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / numbers.length);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("20% interest: " + total * 0.20);
    }
}
