package monster3405;

import java.util.Random;
import java.util.Scanner;

public class MonsterMain {

	public static void main(String[] args) {
		monster[] m=new monster[5];
		Random r=new Random();
		for (int i=0; i<5; i++) {
			int ad=r.nextInt(100);
			int hp=r.nextInt(300);
			m[i]= new monster(ad, hp);
		}
		for (int i=0; i<5; i++) {
		m[i].show();
		}
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("몇 번 몬스터를 얼마만큼 공격하겠습니까?");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==6) {
				System.out.println("게임 끝!");
				break;
			}
			else {
			m[a-1].hit(b);
			m[a-1].show();
			}
			
		}
	}

}
