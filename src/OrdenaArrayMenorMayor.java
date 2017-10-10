import java.util.Scanner;

public class OrdenaArrayMenorMayor
{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		/* Crear un programa que pida por pantalla 10 posiciones de un array y
		 * las ordene automáticamente de mayor a menor */
		int[] array = new int[5];
		rellenaArray(array);
		ordenaArray(array);
		muestraArray(array);
	}
	private static void muestraArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	private static void rellenaArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Introduzca número: ");
			array[i] = sc.nextInt();
		}
	}
	private static void ordenaArray(int[] array)
	{
		for (int i = 0; i < (array.length - 1); i++)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[i] > array[j])
				{
					// Intercambiamos valores
					int variableauxiliar = array[i];
					array[i] = array[j];
					array[j] = variableauxiliar;
				}
			}
		}
	}
}