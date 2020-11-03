package monster3405;

public class monster {
	static int id;
	int ad;
	int hp;
	int rid;
	int hit;
	
	public monster(int ad, int hp) {
		this.ad=ad; // this.아무개는 클래스 밑에다가 만든거.
		this.hp=hp;
		id=id+1;
		rid=id;
		System.out.println(id+"번 몬스터가 만들어졌습니다.");
	}
	public void show() {
		System.out.println(rid+"번 몬스터");
		System.out.println("공격력 : "+ad);
		if (hp<=0) System.out.println("죽었습니다.");
		else System.out.println("체력 : "+hp);
	}
	public void hit(int x) {
		hp=hp-x;
	}
}

