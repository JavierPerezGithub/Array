import java.util.Arrays;
import java.util.Collections;

public class OrdenarArrayMenorMayorSortReverseOrder
{
public static void main(String[] args)
	{
		Integer[] array ={9,3,5,6,1,4,7,8,2};
		muestraArray(array);
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println(" ");
		muestraArray(array);
	}
	private static void muestraArray(Integer[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}