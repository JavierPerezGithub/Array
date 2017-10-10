import java.util.Scanner;

public class BuscaElemento
{
	public static void main(String[] args)
	{
		/*Realiza un programa que contenga un método BuscarElemento, que reciba
		 * un array y un entero. Nos debe devolver un verdadero si el número se
		 * encuentra en el array y un falso si no. En el main debes crear el
		 * array y pedir por pantalla el número que queremos buscar. Despues
		 * de la llamada al método debemos sacar una frase "El número n(no) se
		 * encuentra en el array" según el resultado.*/
		Scanner sc=new Scanner(System.in);
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int num;
		System.out.println("Introduzca número a comprobar: ");
		num=sc.nextInt();		
		BuscarElemento(array,num);
		if(BuscarElemento(array,num)==true)
		{
			System.out.println("El número "+num+ " se encuentra en el array");	
		}
		else
		{
			System.out.println("El número "+num+ " no se encuentra en el array");	
		}		
	}
	private static boolean BuscarElemento(int[] array, int num)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (num == array[i])
			{
				return true;
			}			
		}
		return false;
	}
}