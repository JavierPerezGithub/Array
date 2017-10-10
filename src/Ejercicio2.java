import java.util.Scanner;

public class Ejercicio2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		/*Realiza un programa que pregunte por pantalla cuantos productos vamos a comprar
		 * y después vayamos introduciendo el nombre y precio de esos productos.
		 * Al terminar debe mostrarlos por pantalla y calcular el total de la compra*/		
		String[] arrayProductos;
		float [] arrayPrecios;
		
		int n;
		System.out.println("Cuantos productos? ");
		n=sc.nextInt();
		
		arrayProductos = new String[n];
		arrayPrecios = new float [n];
		
		introducirDatos(arrayProductos, arrayPrecios);
		mostrarTotales(arrayProductos,arrayPrecios);
	}
	private static void mostrarTotales(String[] aProd, float[] aPre)
	{
		float total=0;
		for (int i = 0; i < aProd.length; i++)
		{
			System.out.println(aProd[i]+" -> "+aPre[i]);
			total+= aPre[i];
		}
		System.out.println("Total: "+total);
		
	}
	private static void introducirDatos(String[] aProd, float[] aPre)
	{
		for (int i = 0; i < aProd.length; i++)
		{
			sc.nextLine();
			System.out.println("Nombre Producto: ");
			aProd[i]=sc.nextLine();
			System.out.println("Precio del Producto: ");
			aPre[i]=sc.nextFloat();			
		}		
	}
}