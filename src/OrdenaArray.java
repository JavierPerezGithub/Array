import java.util.Arrays;
import java.util.Scanner;
public class OrdenaArray
{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		/*las ordene automáticamente de  menor a mayor*/
		int[] array ={9,3,5,6,1,4,7,8,2};
		muestraArray(array);
		System.out.println(" ");
		//ordenaArray(array);
		Arrays.sort(array);
		muestraArray(array);
		System.out.println(" ");
		muestraArray2(array);
		
	}
	private static void muestraArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	private static void muestraArray2(int[] array)
	{
		for (int i = array.length-1; i >=0; i--)
		{
			System.out.print(array[i]+" ");
		}
	}
	private static void ordenaArray(int[] array)
	{
		for (int j = 0; j < array.length-1; j++)
		{			
			for ( int i = 0; i < (array.length - 1 -j); i++)
			{
				if (array[i] > array[i+1])
				{
					// Intercambiamos valores
					int variableauxiliar = array[i];
					array[i] = array[i+1];
					array[i+1] = variableauxiliar;
				}				
			}
		}
	}
}