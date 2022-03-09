package innerclasses;

public class Inner{


			 private String msg="Welcome to Java"; 
			 
			 class inner{  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
			 }  


			public static void main(String[] args) {

				Inner obj=new Inner();
				Inner.inner in=obj.new inner();  
				in.hello();  
			}
		}







	
