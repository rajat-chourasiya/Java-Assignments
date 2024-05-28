import java.io.File;
public class FileInfo{
	public static void main(String[] args){
		File myObj = new File("/home/abhijeet-karmakar/AM.txt");
		if (myObj.exists()){
		  System.out.println("File name is "+myObj.getName());
		  
		  System.out.println("File Absolute path is "+myObj.getAbsolutePath());
		  System.out.println("Writeable "+myObj.canWrite());
		  System.out.println("Readable "+myObj.canRead());
		  System.out.println("File size in byte "+myObj.length());
		}
		else{
		  System.out.println("File does not Exists ");
		}
	}
}
