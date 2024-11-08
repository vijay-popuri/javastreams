package basics;

import java.util.Arrays;
import java.util.List;

public class MethodReference
{

	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,2,3,45);
		list.forEach(System.out::println);
	}

}
