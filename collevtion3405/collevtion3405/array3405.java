package collevtion3405;

import java.util.ArrayList;
import java.util.Scanner;

public class array3405 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("이름을 입력해주세요. (end:끝)");
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String a=sc.next();
			name.add(a);
			if(a.equals("끝")) break;
		}
		
		System.out.println("점수을 입력해주세요. (end:-1)");
		
		while(true) {
			int a=sc.nextInt();
			number.add(a);
			if(a==-1) break;
		}
		
		for(int i=0; i<name.size()-1; i++) {
			System.out.println((i+1)+"번쨰 이름:"+name.get(i)+" 점수:"+number.get(i));
		}
		
		for(String n: name) {
			System.out.print(n+" ");
		}
		
		
		sc.close();
	}

}
