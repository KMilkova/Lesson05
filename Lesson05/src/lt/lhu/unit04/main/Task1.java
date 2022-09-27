package lt.lhu.unit04.main;

//Написать метод(методы) для нахождения наибольшего общего делителя и
//наименьшего общего кратного двух натуральных чисел:

public class Task1 {
	public static void main(String[] args) {
		int a = 24;
		int b = 18;
		int nok = findNok(proizv(a,b),findNod(a,b));
		System.out.print(nok);

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
	
	public static int proizv(int a, int b) {
		return a*b;
	}
	
	public static int findNok(int x, int y) {
		return x/y;
	}
}
