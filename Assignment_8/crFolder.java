import java.io.File;
import static java.lang.System.out;
import  java.io.IOException;
class crFolder{
  public static void main(String[] args){
    try{
      File crF = new File("M:\\Programing\\Java\\2nd_sem_OOP's_with Java\\assignment\\assignment8\\crFile.txt"); 
// file path is mandatory for creation a file
      if (crF.createNewFile()){
        out.println("File created "+crF.getName());
        out.println("Absolute path "+crF.getAbsolutePath());
      }
      else{
        out.println("File already exists ");
      }
    }catch(IOException e){
      out.println("An error occurred .");
      e.printStackTrace();
    }
  }
}
