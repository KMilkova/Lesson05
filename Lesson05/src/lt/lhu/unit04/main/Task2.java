package lt.lhu.unit04.main;

//Написать метод(методы) для нахождения суммы большего и меньшего из
//трех чисел.

public class Task2 {
	public static void main(String[] args) {
		int a = 9;
		int b = 19;
		int c = 21;
		
		int max = findMax(a,b,c);
		int min = findMin(a,b,c);
		int sum = findSum(findMax(a,b,c), findMin(a,b,c));
		
		System.out.println("[min] "+min+" + [max] "+max +" = "+sum);
	}
	
	public static int findMax(int a1, int b1, int c1 ) {
		int max = a1;
		if (max<b1) {
			max = b1;
		}
		if (max<c1) {
			max = c1;
		}
		
		return max;
	}
	
	public static int findMin(int a1, int b1, int c1) {
		int min = a1;
		
		if (min>b1) {
			min = b1;
		}
		
		if (min>c1) {
			min = c1;
		}
		
		return min;
	}
	
	public static int findSum(int min,int max) {
		return min+max;
	}
}
