import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileOut {

	public static void main(String[] args) {
		File f = new File("out.txt");
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter(f);
			System.out.println("�����ϴ� ������� ���극�͸� ������ ���� ������ ���ּ���.");
			while(true) {
			String L=sc.nextLine();
			if(L.equals("��")) break;
			fw.write(L);
			fw.write(13);
			fw.write(10);
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
