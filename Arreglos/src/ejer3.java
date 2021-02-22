import java.util.Scanner;

public class ejer3 {
	//numeros aletorios entre 0 y 10

	public static void main(String[] args) {
		Scanner ingreso=new Scanner(System.in);
		System.out.println("Ingrese la longitud");
		int longitud =ingreso.nextInt();
		
		int numeros[]=new int[longitud];
		
		for(int i=0;i<numeros.length;i++) {
			int numeroAdivinar = (int)Math.floor(Math.random()*(10)+1);
			numeros[i]=numeroAdivinar;
			System.out.println(numeros[i]);
		}
		
	}
}
