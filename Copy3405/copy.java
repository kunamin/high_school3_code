import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class copy {

	public static void main(String[] args) {
		File f =new File("picture.jpg");
		File f1 = new File("picture2.jpg");
		int c=0;
		try {
			FileInputStream sc=new FileInputStream(f);
			FileOutputStream fw = new FileOutputStream(f1);
			while(true) {
				int a= sc.read();
				if(a==-1) break;
				fw.write(a);
				c++;
				
			}
			sc.close();
			fw.close();
			System.out.println(c+"바이트 복사함");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
