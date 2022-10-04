package lt.lhu.unit04.main;

public class Task6_3 {
	public static void main(String[] args) {
		int k = 407;
		
		for( int i = 0; i<=k;i++) {
			if (isArmstr(i)) {
				System.out.print(i+ " ");
			}
		}

		

	}
	
	public static int cnt(int x) {
		int n = 0;
		while (x!=0) {
			x = x/10;
			n++;		
		}
		return n;
	}
	
	public static boolean isArmstr(int x) {
		int sum = 0;
		int p = x;
		int n = cnt(x);
		
		while (p!=0) {
			sum+=Math.pow(p%10, n);
			p = p/10;
		}
		if(sum == x) {
			return true;
		}else {
			return false;
		}
	}
}
