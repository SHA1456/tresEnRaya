package tresEnRaya;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				
				int opcion;
				
				do {
					
					MostrarMenu();
					
					opcion=sc.nextInt();
					
					if(opcion==1) {
						
						char[][] tablero =Inicializartablero();
						mostrarTablero(tablero);
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
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
			
			public static char [] [] Inicializartablero () {
				
				char [][] tablero = new char [3][3];
				
				for(int i=0;i<3;i++) {
					
					for(int j=0;j<3;j++) {
					
						tablero[i][j]=' ';
					}
					
				}
				return tablero;
				
				
			}
			
			public static void mostrarTablero(char [][] tablero) {
				
				System.out.println("    0   1   2");
				System.out.println("  ------------");
				
				for (int i = 0; i < 3; i++) {
					System.out.print(i + " | ");
					
					for (int j = 0; j < 3; j++) {
						
						System.out.print(tablero[i][j] + " | ");
					}
					
					System.out.println();
					System.out.println("  -----------");
				}
				
			}
			
			public static void hayGanador() {
				
			}
			
			public static void tableroLleno () {
				
			}
			
}



