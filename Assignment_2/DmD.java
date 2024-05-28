import java.io.*;
import java.io.IOException;
class A{
	void show(){
	  System.out.println("Inside A :");
	}
}
class B extends A{
  void show(){
    System.out.println("Inside B :");
  }
}
class DmD{
	public static void main(String[] args){
	  A ref;
	  A a = new A();
	  B b = new B();
	  ref = b;
	  ref.show();
	}
}
