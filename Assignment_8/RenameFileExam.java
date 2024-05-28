import java.io.File;
import static java.lang.System.out;
import java.io.IOException;
class RenameFileExam{
	public static void main(String[] args){
		try{
			File oldFile = new File("M:\\Programing\\Java\\2nd_sem_OOP's_with Java\\assignment\\assignment8\\crFile.txt");
			File newFile = new File("M:\\Programing\\Java\\2nd_sem_OOP's_with Java\\assignment\\assignment8\\renameFile.txt");
			if (oldFile.renameTo(newFile)){
				out.println("File created ");
			}
			else{
				out.println("Rename failed ");
			}
		}
		catch (SecurityException e) {
    			out.println("Error occurred: " + e.getMessage());
    			e.printStackTrace(); 		
		}
	}
}