import static java.lang.System.out;
import java.io.File;
import java.util.*;
import java.io.IOException;
class File_Re{
  public static void main(String[] args){
    try{
      File robj = new File("rwandst.txt");
      Scanner st = new Scanner(robj); // passing the file object for reading the objects / file content 
      while(st.hasNextLine()){
        String data = st.nextLine(); // passing scanner object content to a string object for printing as a string .
        out.println(data);
      }
      st.close();
    }catch (IOException e){
    //catch(FileNotFoundException e){ // this can be used when as a whole io is imported .
      e.printStackTrace();
    }
  }
}

