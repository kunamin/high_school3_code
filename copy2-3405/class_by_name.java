package copy3405;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class class_by_name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("복사할 파일명을 입력하시오.");
		String s =sc.nextLine();
		File f =new File("./image/"+s);
		int a=s.indexOf(".");
		String s1=s.substring(0, a);
		String s2=s.substring(a+1, s.length());
		File f1 = new File("./image/"+s1+"-copy."+s2);
		int b=0;
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f1));
			while(true) {
				int i= bis.read();
				if(i==-1) break;
				bos.write(i);
				b++;
			}
			System.out.println("복사 완료했습니다");
			System.out.println("용량 : "+b);
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
