public class InvertirArrays
{
	public static void main(String[] args)
	{
		/*Realiza un programa que cree un array de 8 enteros y lo invierta
		 * en su propio array. Haz mostrarArray antes y después de la inversion
		 * para demostrar el cambio*/
		int [] array1={1,2,3,4,5,6,7,8};		
		mostrarArray(array1);
		invertir(array1);
		System.out.println("");
		mostrarArray(array1);
	}
	private static void invertir(int[] array)
	{
		int contenedor;		
		for (int i =0, j=array.length-1; i < array.length/2; i++,j--)
		{
			contenedor=array[i];
			array[i]=array[j];
			array[j]=contenedor;
//		for (int i =0; i < array.length/2; i++)
//			{
//			contenedor=array[i]; //Otra forma
//			array[i]=array[array.length-1 -i];
//			array[array.length-1 -i]=contenedor;
//			}
		}		
	}
	private static void mostrarArray(int[] array)
	{
		for (int i =0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}