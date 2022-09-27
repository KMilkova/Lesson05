package lt.lhu.unit04.main;

//Написать метод(методы), определяющий, в каком из данных двух чисел
//больше цифр.

public class Task3 {
	public static void main(String[] args) {
		int a =254080;
		int b = 36799;
		if (cnt(a)>cnt(b)) {
			System.out.print("В числе a больше цифр");
		}else {
			System.out.print("В числе b больше цифр");
		}

	}
	
	public static int cnt(int x) {
		int count = 0;
		while (x!=0) {
			x = x/10;
			count++;
		}
		return count;
	}
}
