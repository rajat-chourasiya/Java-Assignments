import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
class FileInp{
  public static void main(String[] args){
    Scanner reder = null ;
    FileWriter wri = null;
    String inputText;
    try{
      reder = new Scanner(System.in);
      wri = new FileWriter("crFile.txt");
      while (true){
        inputText = reder.nextLine();
        if (inputText.equals("EXIT")){
          break;
        }
        wri.write(inputText);
        wri.write("\n");
      }
    }catch(IOException e){
      out.println("A input exception occurred !");
    }finally{
      //out.println("Working completed ");
      if (reder != null){
        reder.close(); // checking if reader is not null than close mean if something to read it will false
      }
      try{
        if (wri != null){
          wri.close(); // checking if writer is not null than writer is close
        }
      }catch(IOException e){
        out.println("Closing was not successful . ");
      }  
    }
    try{
      File robj = new File("crFile.txt");
      Scanner st = new Scanner(robj); // passing the file object for reading the objects / file content 
      while(st.hasNextLine()){
        String data = st.nextLine(); // passing scanner object content to a string object for printing as a string .
        out.println("Reading the file ");
        out.println(data);
      }
      st.close();
    }catch (IOException e){
    //catch(FileNotFoundException e){ // this can be used when as a whole io is imported .
      e.printStackTrace();
    }
    }
}
