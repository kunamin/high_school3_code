import java.util.Scanner;

public class errer_catch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name[]=new String[5];
		
		System.out.print("5개의 이름을 입력해주세요.");
		try {
		for(int i=0; i<=name.length; i++)
			name[i]=sc.next();
		
		for(int i=0; i<=name.length; i++)
			System.out.print(name[i]+" ");
	} catch (java.lang.ArrayIndexOutOfBoundsException e)
		{ 
		System.out.println("index 오류군요...");
		System.out.println("index 값 :"+e.getMessage());
		}
		
}
}
