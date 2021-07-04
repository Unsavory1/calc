import java.util.*;
public class calculator {
	public static void main(String [] args) {
	// simple calculator
		Scanner sc = new Scanner (System.in);
		char op;
		Double num1; 
		Double num2;
		Double sum;
		Double product; 
		Double q;
		Double subtract;
		System.out.println("enter number 1:");
		num1 = sc.nextDouble();
		System.out.println("Enter number 2: ");
		num2 = sc.nextDouble();
		System.out.println("Enter an opertor: +, -. /, *:");
		op = sc.next().charAt(0); 
	switch (op) {
		case '+':
			sum = num1 + num2; 
				System.out.println(sum);
		break;
		case '-':   if (num1>num2) { 
			System.out.println(num1 - num2);
		}
		else {
			System.out.print(num2-num1);
		}
					break;
		case '*': product = num1*num2;
			System.out.println(product);
			break; 
		case '/': if (num1>num2) {
			System.out.println(num2/num1);
		}
		else {
			System.out.println(num1/num1); 
		}
		break;
		default: 
			System.out.println("Invalid input");
	}
	} 
} 
 

		
	  

				
		

