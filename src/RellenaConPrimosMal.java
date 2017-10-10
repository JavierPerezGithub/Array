import java.util.Scanner;
public class RellenaConPrimosMal
{
	public static void main(String[] args)
	{
		/*Realiza un programa que pida por pantalla el tamaño del array.
		 Después debe rellenar el array con los primeros n números primos.
		 del 1 en adelante*/
		Scanner sc=new Scanner(System.in);		
		int i;		
		System.out.println("Introduzca posiciones del array: ");
		i=sc.nextInt();
		int [] array1=new int[i];
		rellenaArrayPrimos(array1);	
		muestraArray(array1);
	}
	private static int[] rellenaArrayPrimos(int []array)
	{
		for (int i = 0,j=2; i < array.length;j++)
		{			
			if(j%2!=0 && j%3!=0 && j%5!=0 && j%7!=0||
				    j==2 || j==3 ||j==5 ||j==7)
			{
				array[i]=j;
				i++;
			}	
		}
		return array;		
	}
	private static void muestraArray(int[] array)
	{
		for (int i =0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}