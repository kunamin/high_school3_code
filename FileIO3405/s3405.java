import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class s3405 {

	public static void main(String[] args) {
		File f1 = new File("Jumsu.txt");
		File f2 = new File("result.txt");
		try {
			Scanner sc=new Scanner(f1);
			try {
				FileWriter fw = new FileWriter(f2);
				fw.write("성명");
				fw.write(9);
				fw.write("국어");
				fw.write(9);
				fw.write("영어");
				fw.write(9);
				fw.write("수학");
				fw.write(9);
				fw.write("총점");
				fw.write(9);
				fw.write("평균");
				fw.write(9);
				fw.write(13);
				fw.write(10);
				while(sc.hasNext()) 
				{
				String a=sc.next();
				fw.write(a);
				fw.write(9);
				int b=sc.nextInt();
				fw.write(""+b);
				fw.write(9);
				int c=sc.nextInt();
				fw.write(""+c);
				fw.write(9);
				int d=sc.nextInt();
				fw.write(""+d);
				fw.write(9);
				
				int e=b+c+d;
				fw.write(""+e);
				fw.write(9);
				double g=e/3.0;
				String h=String.format("%.2f",g);
				fw.write(h);
				fw.write(13);
				fw.write(10);
				}
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	}

		
		
	


