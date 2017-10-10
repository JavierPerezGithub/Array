
public class CopiaInversa
{
	public static void main(String[] args)
	{
		/*Realiza un programa que cree un array de 8 enteros y los copie
		 de forma inversa en otro array. Después debe mostrar los dos arrays*/
		int [] array1={1,2,3,4,5,6,7,8};
		int []array2= new int[array1.length];	//Tantas posiciones como tiene array1
		for (int i =0; i<array1.length;i++)
		{
			array2[array1.length-1-i] =array1[i]; /*Con [array1.length-1-i] va restando desde el maximo
			del array hasta 0*/
		}		
		muestraArray(array1);
		System.out.println("");
		muestraArray(array2);
	}
	private static void muestraArray(int[] array)
	{
		for (int i =0; i < array.length; i++)
		{
		System.out.print(array[i]+" ");
		}
	}	
}