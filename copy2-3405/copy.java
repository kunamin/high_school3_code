package copy3405;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {

	public static void main(String[] args) {
		File f =new File("./image/dongsin.glb");
		File f1 = new File("./image/dongsin1.glb");
		int c=0;
		int i=0;
		try {
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(f1);
			System.out.println("버퍼 이용안함");
			System.out.println("복사 시작합니다.");
			long b= System.currentTimeMillis();
			while(true) {
				int a= fis.read();
				if(a==-1) break;
				fos.write(a);
				c++;
			}
			long d=System.currentTimeMillis();
			System.out.println("복사 완료했습니다");
			System.out.println(c+"바이트 복사함");
			System.out.println((d-b)+"밀리초 걸림");
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f1));
			System.out.println("버퍼 이용함");
			System.out.println("복사 시작합니다.");
			long g= System.currentTimeMillis();
			while(true) {
				int j= bis.read();
				if(j==-1) break;
				bos.write(j);
				i++;
			}
			long h= System.currentTimeMillis();
			System.out.println("복사 완료했습니다");
			System.out.println(i+"바이트 복사함");
			System.out.println((h-g)+"밀리초 걸림");
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
