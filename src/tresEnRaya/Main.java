package tresEnRaya;
import java.util.Scanner;
public class Main {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			
			MostrarMenu();
			
			opcion=sc.nextInt();
			
			if(opcion==1) {
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}else if(opcion==2){
				Mostrarinstrucciones();
			}else if(opcion<1||opcion>3) {
				System.err.println("Opción inválida");
			}
			
	
			
		}while (opcion!=3);
		
		
		
		
		
	}
	public static void MostrarMenu () {
		System.out.println("Opciones: 1) Jugar, 2)Mostrar instrucciones, 3)Salir");
		
	}
	
	public static void Mostrarinstrucciones() {
		System.out.println("Instrucciones del tres en raya");
		
	}
	
	public static void Inicializartablero () {
		
		
	}
	
	public static void mostrarTablero() {
		
	}
	
	public static void hayGanador() {
		
	}
	
	public static void tableroLleno () {
		
	}
	
}
