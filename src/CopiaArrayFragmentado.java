public class CopiaArrayFragmentado
{
	public static void main(String[] args)
	{
		/*Crea un array de 10 elementos (lo puedes crear directamente, no hace falta que
	se metan los números por teclado) y copia sus 5 primeros elementos en un array y
	los 5 últimos en otro array. Muestra por pantalla estos dos arrays para comprobar
	que la copia se ha hecho correctamente*/
		int []array={1,2,3,4,5,6,7,8,9,10};
		int[] array2=new int[5];
		int[] array3=new int[5];		
		copiaArray(array,array2,array3);
		//arrayCopy(array,array2,array3);
		System.out.print("Array2: ");muestraArray(array2);
		System.out.println("");
		System.out.print("Array3: ");muestraArray(array3);		
	}
	private static void muestraArray(int[] array)
	{
		for (int i =0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
//	private static void arrayCopy(int [] array, int []array2, int []array3)
//	{
//		System.arraycopy(array, 0, array2, 0, array2.length);
//		System.arraycopy(array, 5, array3, 0, array3.length);
//		//			(origen,posIni,destino,posIni,tamaño a copiar)
//	}	
	private static void copiaArray(int[] array, int[] array2, int[] array3)
	{
//		for (int i = 0,j=0,k=4,l=9; i < array.length/2; i++,j++,k--,l--)
//		{
//			array2[j]=array[i];
//			array3[k]=array[l];
//		}		
		for (int i = 0,j=0; i < array.length; i++)
		{
			if(i<5){
				array2[i]=array[i];
			}
			else{
				array3[j]=array[i];
				j++;
			}
		}
	}		
}