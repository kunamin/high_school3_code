import java.util.Scanner;

public class Thread_Test_3405 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է����ּ���");
		int n=sc.nextInt();
		long sum=0;
		long st1=System.currentTimeMillis();
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		long et1=System.currentTimeMillis();
		System.out.println("����"+sum);
		System.out.println("�ɸ��ð�"+(et1-st1)+"ms");
		
		System.out.println("-----Multi_Thread-----");
		sumCLass sc1=new sumCLass(1, n/2);
		sumCLass sc2=new sumCLass(n/2+1, n);
		long st2=System.currentTimeMillis();
		sc1.start();
		sc2.start();
		try {
			sc1.join();
			sc2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long et2=System.currentTimeMillis();
		System.out.println("���� ��� : "+(sc1.getsum()+sc2.getsum()));
		System.out.println("�ɸ��ð�"+(et2-st2)+"ms");

	}

}
