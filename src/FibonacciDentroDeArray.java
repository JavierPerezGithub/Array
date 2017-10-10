import java.util.Scanner;

public class FibonacciDentroDeArray
{
	public static void main(String[] args)
	{
		/*Programa que pida por pantalla la longitud del fibonacci a mostrar y
		 * lo saque por pantalla*/
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.print("Introduzca longitud del fibonacci: ");
		n=sc.nextInt();
		
		int [] array=new int[n];
		
		rellenaArray(array);
		muestraArray(array);
	}
	private static void muestraArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}		
	}
	private static void rellenaArray(int[] array)
	{
		int aux=0,fibo1=0,fibo2=1;
		for (int i = 0; i < array.length; i++)
		{
			array[i]=aux;
			fibo1=fibo2;
			fibo2=aux;
			aux=fibo1+fibo2;			
		}		
	}	
}