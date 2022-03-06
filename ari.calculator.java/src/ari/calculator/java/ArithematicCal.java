package ari.calculator.java;
import java.util.Scanner;

public class ArithematicCal {

	public static void main(String[] args) {
		
double num1;
double num2;
char op;
double result;
Scanner reader=new Scanner(System.in);
System.out.println("Enter two numbers");
num1=reader.nextDouble();
num2=reader.nextDouble();
System.out.println("Enter operators:(+,-,*,/):");
op=reader.next().charAt(0);
switch(op) {
case'+':
	result=num1+num2;
	break;
case'-':
	result=num1-num2;
	break;
case'*':
	result=num1*num2;
	break;
case'/':
	result=num1/num2;
	break;
default:
	System.out.println("Invalid operation");
	return;
	
	
}
System.out.println("The result is:");
System.out.println(num1+""+op+""+num2+"="+result);
	
}

}
