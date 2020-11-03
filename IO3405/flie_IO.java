import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class flie_IO {

	public static void main(String[] args) {
		File f=new File("input.txt");
		System.out.println("이름	국어	물리	수학	총점	평균");
		try {
			Scanner sc=new Scanner(f);
			while(sc.hasNext()) 
			{
			String a=sc.next();
			System.out.print(a+"	");
			int b=sc.nextInt();
			System.out.print(b+"  	");
			int c=sc.nextInt();
			System.out.print(c+"	");
			int d=sc.nextInt();
			System.out.print(d+"	");
			
			int e=b+c+d;
			System.out.print(e+"	");
			double g=e/3.0;
			System.out.print(g+"	");
			System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
