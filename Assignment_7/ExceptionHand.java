import java.io.*;
import java.io.IOException;
class exchand{
  public void ex(int am,int st){

    try{
      int exp = am / st;
      System.out.println("The division is successful value is "+exp);
    }
    catch(ArithmeticException e){
      System.out.println("The no is not divisible by 0 so it is illegal for computation ");
    }
  }
}
class ExceptionHand{
	public static void main(String[] args){
	  exchand obj = new exchand();
	  obj.ex(12,0);
	}
}
