import java.io.*;
import java.util.*;
import static java.lang.System.out;
class overload{
	overload(){
		out.println("Without any argument ");
	}
	overload(int am){
		out.println("Passed one argument and the value is "+am);
	}
}	
class ConstructOverloading{
	public static void main(String[] args){
		overload obj1 = new overload();
		overload obj2 = new overload(20);
	}
}