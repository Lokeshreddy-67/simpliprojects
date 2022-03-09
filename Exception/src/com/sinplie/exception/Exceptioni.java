package com.sinplie.exception;

public class Exceptioni extends Exception{
		String str1;
		   Exceptioni(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("Exceptioni Occurred: "+str1) ;
		   }
		}
		class Example1{
		   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new Exceptioni("This is My error Message");
			}
			catch(Exceptioni exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }


}
