package lt.lhu.unit04.main;

import java.math.BigInteger;

public class Task6_2 {
	public static void main(String[] args) {
		String str1 = "111215116165";
		String str2 = "9911215186140";
		BigInteger a= new BigInteger(str1);
		BigInteger b = new BigInteger(str2);

		BigInteger result = a.add(b);
		
		System.out.print(result.toString());
	}
	

}
