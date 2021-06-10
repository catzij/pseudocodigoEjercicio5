import java.util.*;
public class Ejercicio5 {
	public static void main (String args[]){

		Scanner read = new Scanner(System.in);

		int H;
		int M;

		int mayor=0;
		int menor=0;

		int hombre;
		int mujer;

		System.out.println("Cantidad de datos para hombres : ");
		H = read.nextInt();
		System.out.println("Cantidad de datos para mujeres : ");
		M = read.nextInt();

		for (int i = 0 ;i<H ;i ++ ) {
		System.out.print("Ingrese dato hombre "+(i+1)+": ");
		hombre = read.nextInt();
			if (hombre<18) {
				menor++;				
			}
					
		}
		for (int i = 0 ;i<M ;i ++ ) {
		System.out.print("Ingrese dato mujer "+(i+1)+": ");
		mujer = read.nextInt();
			if (mujer>18) {
				mayor++;				
			}
					
		}
		System.out.println("mujeres mayores de edad: "+mayor);
		System.out.println("hombres menores de edad: "+menor);
			

	}

}