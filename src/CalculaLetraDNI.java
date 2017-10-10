import java.util.Scanner;

public class CalculaLetraDNI
{
	public static void main(String[] args)
	{
		/*Crear un programa que te diga que letra del DNI tienes
		 a partir del resto del DNI / 23*/
		Scanner sc=new Scanner(System.in);
		int n;
		char []array={'T','R','W','A','G','M','Y',
				'F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("Introduzca DNI: ");
		n=sc.nextInt();
		int letra=n%23;		
		System.out.println("La letra de tu DNI "+ n +  " es: "+array[letra]);
	}
}