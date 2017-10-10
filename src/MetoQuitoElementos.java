
public class MetoQuitoElementos
{
	static int n1=6;
	public static void main(String[] args)
	{
		int array[]= {2,7,9,14,16,23,41};		
		
		int p=14;
		borrarElemento(array,p);
		muestraArray(array);
	}
	private static void borrarElemento(int[] array, int p)
	{
		int pos=-1;
		//Encontrar el elemento del array
		for (int i = 0; i < n1-1; i++)
		{
			if(array[i]==p)
			{
				pos=i;
				array[i]=array[i+1];
			}
		}
		if(pos==-1)
		{
			System.out.println("No esta en el array");
		}
		else
		{
			for (int i = pos; i < n1-1; i++)
			{
				array[i]=array[i+1];
			}
			array[n1]=-1;
		}
	}
		private static void muestraArray(int[] array)
		{
			for (int j = 0; j < array.length; j++)
			{
				System.out.println(array[j]+" ");
			}			
		}
}
