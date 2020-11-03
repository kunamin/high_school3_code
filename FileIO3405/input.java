import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class input {

	public static void main(String[] args) {
		File f = new File("input.txt");
		try {
			FileReader fr = new FileReader(f);
			while(true) {
			int a=fr.read();
			if(a==-1) break;
			System.out.printf("%c",a);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
