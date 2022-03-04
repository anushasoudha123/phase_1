public class OuterClass 
{
	
	  class InnerClass
	  {  
		  void display()
		  {
			  System.out.println("display() is in inner class called from outer class"); 
	      }  
		
      } 
	  
	  public static void main(String args[])
	 {  
			  OuterClass outerClass=new OuterClass();  
			  InnerClass innerClass=outerClass.new InnerClass();  
			  innerClass.display();
	 }  
}