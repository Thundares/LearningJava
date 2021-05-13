package br.com.RKDeveloper.GradleFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleFirstProjectApplication.class, args);
		
		// Functional and Lambda training
		// trying a functional way to add numbers
		MathFunctions add = (firstNNumber, secondNumber) -> firstNNumber + secondNumber;
		System.out.println("Th sum of 5 and 6 is " + add.twoNumbers(5,6).toString());	// 11
		System.out.println("Th sum of 1 and 3 is " + add.twoNumbers(1,3).toString());	// 4

		// a functional way to multiply
		MathFunctions mult = (firstNNumber, secondNumber) -> firstNNumber * secondNumber;
		System.out.println("Th sum of 5 and 6 is " + mult.twoNumbers(5,6).toString());	//30
		System.out.println("Th sum of 2 and 8 is " + mult.twoNumbers(2,8).toString());	//16
	}
	
}

@FunctionalInterface
interface MathFunctions {
	Integer twoNumbers(int firstNumber, int secondNumber);
} 