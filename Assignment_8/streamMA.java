import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
class streamMA{
  public static void main(String[] args){
      File file = new File("crFile.txt");
    try(
      FileReader fileReader = new FileReader(file);
  
      BufferedReader buffRe = new BufferedReader(fileReader)){
      String s;
      s = buffRe.readLine(); // this will read only one line 
      out.print(s);
      /*while((
      s = buffRe.readLine()) != null){ // it will read until it find null or last line
        out.println(s);}*/
      
      try{
        out.println("Going to close buffer ");
        buffRe.close();}catch(IOException e){}
    }catch(IOException e){
      out.println("Error ");
      e.printStackTrace();
      
    }
  }
}
