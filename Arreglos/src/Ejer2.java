
import java.util.Scanner;

public class Ejer2 {
	int valor;

	
	public Ejer2(){

	valor=50;

	}

	public void sumar(){

	int suma=0;

	while(valor>0){

	suma=suma+valor%10;

	valor=valor/10;

	}

	System.out.println(suma);

	}

	}