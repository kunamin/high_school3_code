
public class sumCLass extends Thread  {
	
	private int a;
	private int b;
	private long sum;

	public sumCLass(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void run() {
		for(int i=a; i<=b; i++) {
			sum=sum+i;
		}
		
	}
	public long getsum() {
		return sum;
	}

}
