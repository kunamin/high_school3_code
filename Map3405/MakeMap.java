import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeMap {

	public static void main(String[] args) {
		Map<String, Integer> HM=new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("�̸��� ������ �Է����ּ���.");
		while(true) {
			String a=sc.next();
			if(a.equals("��")) break;
			int b=sc.nextInt();
			HM.put(a, b);
		}
		
		System.out.println("ã�� ����� �Է��ϼ��� >");
		String a=sc.next();
		System.out.println(a+"�� �����Դ� "+HM.get(a));
		sc.close();
		

	}

}
