import java.util.Arrays;

public class OrdenarArrayConSort
{
	public static void main(String[] args)
	{
		int[] array ={9,3,5,6,1,4,7,8,2};
		muestraArray(array);
		Arrays.sort(array);
		System.out.println(" ");
		muestraArray(array);
	}
	private static void muestraArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}