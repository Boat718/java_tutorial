import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		File file = new File("C:\\Users\\kittikawinpaw\\Desktop\\test.txt");
		
		if(file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getPath());
			System.out.println(file.isFile());
		}else {
			System.out.println("It doesn't exists");
		}
		*/
		
		
		try {
			FileWriter writer = new FileWriter("C:\\\\Users\\\\kittikawinpaw\\\\Desktop\\\\test.txt");
			writer.write("Hello \n World");
			writer.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
