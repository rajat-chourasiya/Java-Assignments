import static java.lang.System.out;
import java.io.*;
import java.util.*;
class sum{
	
	
	sum(int ts){
		Scanner st = new Scanner(System.in);
		int[] am = new int[ts];
		try{
			for (int i=0; i< am.length; i++){
				out.println("Enter the array Numbers ");
				am[i] = st.nextInt();
			}
			
// creating an arraylist to store the triplets 
			List<List<Integer>> triplets = new ArrayList<>();

			for (int i=0; i< am.length; i++){
				for (int j=i+1; j< am.length; j++){
					for(int k=j+1; k<am.length; k++){
						if ( am[i]+am[j]+am[k]==0){
							//out.println(i+","+j+","+k);
							//out.println(am[i]+","+am[j]+","+am[k]);
							List<Integer> triplet = Arrays.asList(am[i], am[j], am[k]);
                        				if (!triplets.contains(triplet)) {
                            					triplets.add(triplet);
                        				}
							
						}
					}
				}
				
			}
			out.println("Triplets that sum is 0 \n"+triplets);
		}catch(Exception e){}
		
	
	}
}
class ThreeSuM{
	public static void main(String[] args){
		Scanner ts = new Scanner(System.in);
		int am;
		out.println("Enter the size of the array ");
		am = ts.nextInt();
		sum ob = new sum(am);
	}
}