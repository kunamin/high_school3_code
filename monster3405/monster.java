package monster3405;

public class monster {
	static int id;
	int ad;
	int hp;
	int rid;
	int hit;
	
	public monster(int ad, int hp) {
		this.ad=ad; // this.�ƹ����� Ŭ���� �ؿ��ٰ� �����.
		this.hp=hp;
		id=id+1;
		rid=id;
		System.out.println(id+"�� ���Ͱ� ����������ϴ�.");
	}
	public void show() {
		System.out.println(rid+"�� ����");
		System.out.println("���ݷ� : "+ad);
		if (hp<=0) System.out.println("�׾����ϴ�.");
		else System.out.println("ü�� : "+hp);
	}
	public void hit(int x) {
		hp=hp-x;
	}
}

