package collevtion3405;

import java.util.ArrayList;
import java.util.Scanner;

public class array3405 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("�̸��� �Է����ּ���. (end:��)");
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String a=sc.next();
			name.add(a);
			if(a.equals("��")) break;
		}
		
		System.out.println("������ �Է����ּ���. (end:-1)");
		
		while(true) {
			int a=sc.nextInt();
			number.add(a);
			if(a==-1) break;
		}
		
		for(int i=0; i<name.size()-1; i++) {
			System.out.println((i+1)+"���� �̸�:"+name.get(i)+" ����:"+number.get(i));
		}
		
		for(String n: name) {
			System.out.print(n+" ");
		}
		
		
		sc.close();
	}

}
