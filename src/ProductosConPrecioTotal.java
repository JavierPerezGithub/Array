import java.util.Scanner;
public class ProductosConPrecioTotal
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		/*Realiza un programa que pregunte por pantalla cuantos productos vamos a comprar
		 * y después vayamos introduciendo el nombre y precio de esos productos.
		 * Al terminar debe mostrarlos por pantalla y calcular el total de la compra*/		
		int n;
		
		System.out.println("Cuantos productos va a comprar? ");
		n=sc.nextInt();
		
		float []precio=new float[n];
		String[]producto=new String[n];			
		
		rellenaArray(precio,producto);
		muestraArray(producto,precio);
	}

	private static void muestraArray(String[] producto, float[] precio)
	{
		int total=0;
		for (int i = 0; i < precio.length; i++)
		{
			System.out.println("Producto: "+producto[i]+" \nPrecio: "+precio[i]);
			total+=precio[i];
		}		
		System.out.println("El total es: "+total);
	}

	private static void rellenaArray(float[] precio, String[] producto)
	{
		for (int i = 0; i < producto.length; i++)
		{
			sc.nextLine();
			System.out.print("Introduzca nombre del producto: ");
			producto[i]=sc.nextLine();
			
			System.out.print("Introduzca precio del producto: ");
			precio[i]=sc.nextInt();	
		}	
	}
}

		
		
		
		
		
		
		
//		String [][] productos=new String[n][1];
//		
//		String prod="";
//		String precio;
//		for (int i = 0; i < 1; i++)
//		{
//			sc.nextLine();
//			System.out.println("Introduzca producto");
//			prod=sc.nextLine();
//			
//			
////			rellenaArray(productos,prod);
//		}	
//		System.out.println(prod);
//	}
//
//	private static void rellenaArray(String[][] productos,String prod)
//	{
//		for (int i = 0, j=0; i < productos.length; i++,j++)
//		{
//			System.out.println(productos[i][j]);
//			productos[i][j]=prod;
//		}
//		
//	}
//}