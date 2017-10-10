import java.util.Scanner;
public class IntercalaArrays
{
	static Scanner sc=new Scanner(System.in);		
	public static void main(String[] args)
	{
		/*Crea dos arrays de 5 elementos y rellénalos por teclado por separado. Después
		llama a un método mostrarArrays() que reciba dos arrays y los muestre por pantalla
		intercalados.*/		
		
		int[]array1=new int[5];
		int[]array2=new int[5];
		int[]array3=new int[10];
		int n=1;
		rellenaArray(array1,n);
		n++;
		rellenaArray(array2,n);
		System.arraycopy(array1, 0, array3, 0, 5);
		System.arraycopy(array2, 0, array3, 5, 5);
		muestraArray2(array3);
		//muestraArray(array1,array2);
	}
	private static void rellenaArray(int[] array,int n)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Introduzca número para array: "+n+" ");
			array[i]=sc.nextInt();
		}		
	}	
//	private static void muestraArray(int[] array,int[] array2)
//	{
//		for (int i =0; i < array.length; i++)
//		{
//			System.out.print(array[i]+" ");
//			System.out.print(array2[i]+" ");
//		}
//	}
	private static void muestraArray2(int[] array)
	{
		for (int i =0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}