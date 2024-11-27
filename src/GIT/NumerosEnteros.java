package GIT;

import java.util.Scanner;

public class NumerosEnteros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros deben de ser distintos.");
            return;
        }

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
        }
        
        System.out.println("Introduce un tercer numero:");
        int num3 = scanner.nextInt();

        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
            if (i == num3) {
                System.out.println("Third number: " + num3);

            }

        }

	}
}