package exce;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//file input stream is compile time exception or checked exception
//for compile time exception ,handling code is necessary
public class ReadandWritehandle {

	void readFile() throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("d:/abc.txt");}
	
}
	
class Testthrows{
public static void main(String[] args) throws FileNotFoundException {
	// TODO Auto-generated method stub
	try
	{
		ReadandWrite re=new ReadandWrite();
	
	re.readFile();}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("HELLO WORLD");

}
}
