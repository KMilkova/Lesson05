package lt.lhu.unit04.main;

public class Task4 {
	public static void main(String[] args) {
		int[] D = new int[] {2,3,5,1,6,7};
		for (int i = 0; i<=D.length-1; i++) {
			System.out.print(D[i]+" ");
		}
		System.out.print("\n");
		System.out.println("D[1] + D[2] + D[3] = " + sum (D[0], D[1], D[2]));
		System.out.println("D[3] + D[4] + D[5] = " + sum (D[2], D[3], D[4]));
		System.out.println("D[4] + D[5] + D[6] = " + sum (D[3], D[4], D[5]));

	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
}
