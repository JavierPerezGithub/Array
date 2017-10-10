import java.util.Scanner;

public class TemperaturaPorHora
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		/* Realiza un programa que pida las 
		temperaturas por hora de un dia y despues las muestre.*/
		float temp []= new float [24];
		int i;
		for(i=0; i<temp.length; i++) //bucle escritura
		{
			System.out.println("Introducir temperatura: ");
			temp[i]=sc.nextFloat();
		}
		for (i=0; i<temp.length; i++) //bucle lectura
		{
			System.out.println("posicion "+i+" tiene "+ temp[i]+"º");
		}
	}
}