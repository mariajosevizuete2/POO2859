import java.util.Scanner;
public class Ejer4 {
	public static void main(String[] args) {
		Scanner ingreso=new Scanner(System.in);
		System.out.println("Ingrese la letra que quiere saber la posicion");
		//char longitud =ingreso.next();
		
		char letras[]=new char[25]; 
		char p =64;
		for (int i=0;i<letras.length;i++) {
			p=(char) ((char)p+1);
			System.out.println(letras[i]=p);
		}
		
	}
}
