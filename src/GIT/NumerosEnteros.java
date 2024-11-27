package GIT;

import java.util.Scanner;

public class NumerosEnteros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two distinct numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Numbers must be distinct.");
            return;
        }

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
        }

	}

}
