import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeMap {

	public static void main(String[] args) {
		Map<String, Integer> HM=new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("이름과 점수를 입력해주세요.");
		while(true) {
			String a=sc.next();
			if(a.equals("끝")) break;
			int b=sc.nextInt();
			HM.put(a, b);
		}
		
		System.out.println("찾는 사람을 입력하세요 >");
		String a=sc.next();
		System.out.println(a+"의 몸무게는 "+HM.get(a));
		sc.close();
		

	}

}
