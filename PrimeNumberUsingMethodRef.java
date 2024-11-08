package basics;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberUsingMethodRef {

	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(10,13,17,20,25,29);
		list.forEach(PrimeNumberUsingMethodRef::getPrimeNum);
		
		

	}
	public static void getPrimeNum(int i) {
		int count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count+=1;
			}
		}
		if(count==0) {
			System.out.println(i);
		}
	}
}
