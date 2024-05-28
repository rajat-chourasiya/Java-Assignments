import static java.lang.System.out;
import java.io.*;
import java.util.*;
class sum{
	Scanner st = new Scanner(System.in);
	int[] am = new int[4];
	sum(int target){
		try{
		for (int i=0; i< am.length; i++){
			out.println("Enter the array Numbers ");
			am[i] = st.nextInt();
		}
		for (int j = 0; j< am.length; j++){
			for (int k = 0; k<= am.length; k++){
				if (am[j] + am[k] == target & j != k){
					out.println(j +" "+ k);
				}
			}
		}
		}catch(Exception e){}
	}
	

}
class TwoSuM{
	public static void main(String[] args){
		sum ob = new sum(9);
	}
}