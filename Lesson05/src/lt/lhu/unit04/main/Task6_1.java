package lt.lhu.unit04.main;

public class Task6_1 {
	public static void main(String[] args) {
		int a = 84;
		int b = 102;
		int c = 42;
		
		int nod = findNod(a,b);
		int nd = findNod(nod,c);
		
		if (nd == 1) {
			System.out.print("Числа взаимно протые");
		}else {
			System.out.print("Числа не взаимно протые");
		}


	}
	
	public static int findNod(int a, int b){
		int nd = 1;
	    for (int i = 1; i <= a && i <= b; i++) {
	        if (a % i == 0 && b % i == 0) {
	            nd = i;
	        }
	    }
	    return nd;
	}
}
