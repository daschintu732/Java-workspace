package exception;

import java.io.File;
import java.io.FileReader;

public class Try_Resources {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader(new File("F:\\Java-workspace\\Java\\abc.txt"))) 
		{
			int read = fr.read();
			System.out.println(read);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
