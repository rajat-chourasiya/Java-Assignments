import static java.lang.System.out;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class file_W_ST{
	public static void main(String[] args){
	  try{
	    File Fobj = new File("rwandst.txt");
	      if (Fobj.createNewFile()){
	        out.println("File created : "+Fobj.getName());
	        out.println("Absolute path " + Fobj.getAbsolutePath());
	      }
	      else{out.println("File already exists. "); }
	      
	  }catch(IOException e){
	    out.println("An error occurred . ");
	    e.printStackTrace(); // for getting what type of error is this in the working program 
	  }
	  try{
	        FileWriter Fwri = new FileWriter("rwandst.txt");
	        Fwri.write("Hello first file is created than i am putting into it some text : \n hello i am doing a read write and save into a new file ");
	        Fwri.close();
	        out.println("File content is successfully wrote after creating a file ");
      }catch(IOException e){
        out.println("An error occurred ");
        e.printStackTrace();
      }
	}
}
