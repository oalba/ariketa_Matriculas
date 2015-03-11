package com.zubiri.matriculas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) throws IOException {
			
			int seleccion = -1;
			Scanner sc = new Scanner(System.in);
			
			do {
				try{
					//Visualiza por terminal (stdout) las opciones del menu
					System.out.println("Matricular---------------------------------------1");
					System.out.println("Ver matrículas-----------------------------------2");
					System.out.println("Mostrar asignatura-------------------------------3");
					System.out.println("Añadir asignatura--------------------------------4");
					System.out.println("SALIR DEL PROGRAMA-------------------------------5");
					   
					seleccion = sc.nextInt();
					
					//Matricula matricula = new Matricula();
					//Asignatura asignatura = new Asignatura();
					
					switch (seleccion) {
						case 1: //Matricular
							Matriculas.añadirMatricula(sc);
							break;
						case 2: //Ver matriculados
							Matriculas.impriMatri();
							//Matriculas.mostrarMatriculas();
							//matricula.mostrarUltMatricula();
							break;
						case 3: //Mostrar asignatura
							Asignatura.mostrarAsignatura();
							//asignatura.split(asignatura.formatted(),':');
							break;
						case 4: //Añadir asignatura
							new Asignatura(sc);
							break;
						case 5: //Salimos
							break;
						default:
							System.out.println("No ha insertado la opcion correcta");
					
					}
			
				}catch(InputMismatchException e){
					System.out.println("Eso no es un número ");
					sc.nextLine();
				}
	} while (seleccion != 5);
			
			System.out.println("Gracias por usar nuestro programa. Que tenga un buen día!");
			sc.close();
		}
}