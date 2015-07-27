
package simple;

 public class Simple {
 public int myMethod(int num1, int num2)
   { 
       System.out.println("First myMethod of class Demo");
       return num1+num2;
   }
   public int myMethod(double num1, double num2)
   {
       System.out.println("Second myMethod of class Demo");
       return num1+num2;
   }
  public static void main(String args[])
   {
       Simple obj1= new Simple();
       obj1.myMethod(10,10);
       obj1.myMethod(20,12);
   }
}

    
    

