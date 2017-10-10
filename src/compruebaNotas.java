
public class compruebaNotas
{
	public static void main(String[] args)
	{
		/*Realiza un programa que cree un array con la nota de 10 alumnos y despues
		 muestre las notas por pantalla, indicando cuál es la nota media,
		 el numero de aprobados y el de suspensos*/
		float [] notas={4,7,6,5,7,8.5f,6,3,1,10};
		float media=0; 
		int aprobado = 0,suspenso = 0;
		
		for(int i=0; i<notas.length;i++)
		{
			media+=notas[i];
			if(notas[i]>4)
			{
				aprobado ++;
			}
			else
				suspenso ++;
		}		
		
		System.out.println("Num Aprobados "+aprobado+" Num suspensos "+suspenso);
		System.out.println("Media de notas "+media/notas.length);
		muestraArray(notas);
	}
	public static void muestraArray(float []array)//array es el nombre que quiero poner.
	{
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);			
		}
	}
}