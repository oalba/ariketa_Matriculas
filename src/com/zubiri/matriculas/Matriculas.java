package com.zubiri.matriculas;

import java.util.*;

public class Matriculas {
	private static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

	public static ArrayList<Matricula> añadirMatricula(Scanner sc){
		int cant = 0;
		System.out.println("¿En cuantas asignaturas deseas matricularte?");
		cant = sc.nextInt();
		for (int i = 0; i < cant; i++) {
			matriculas.add(new Matricula(sc));
		}
		return matriculas;
	}

	public static ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public static void setMatriculas(ArrayList<Matricula> matriculas) {
		Matriculas.matriculas = matriculas;
	}


	public static Matricula buscarMatricula(String nombre){
		Matricula matricula = null;
		if (matriculas == null) {
			System.out.println("¡Todavía no te as matriculado en ninguna asignatura!");
		}else {
			for (int i = 0; i < matriculas.size(); i++) {
				if (matriculas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					matricula = matriculas.get(i);
				}
			}
		}
		return matricula;
	}
	public static void borrarMatricula(String nombre){
		try{
			matriculas.remove(buscarMatricula(nombre));
		}catch (Exception e) {
			System.out.println("¡Error al eliminar la matrícula!"+e);
		}
	}
	public static void mostrarMatriculas(){
		//Matricula matricula = null;
		//if (matriculas == null) {
			//System.out.println("¡Todavía no te as matriculado en ninguna asignatura!");
		//}else {
			for (int o = 0; o < matriculas.size(); o++) {
				System.out.println("Nombre: " + matriculas.get(o).getNombre());
				System.out.println("Creditos: " + matriculas.get(o).getCreditos());
				System.out.println("Profesor: " + matriculas.get(o).getProfesor().getNombre());
				//Profesor profesor = new Profesor();
				//profesor.mostrarPersona();
				System.out.println("Año de matriculación: " + matriculas.get(o).getAñoMatriculacion());
				System.out.println("Precio: " + matriculas.get(o).getPrecio());
			}
		//}
	}
	public static Iterator<Matricula> impriMatri() {
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
		matriculas = Matriculas.getMatriculas();
		Iterator<Matricula> itrMatricula = matriculas.iterator();
			while(itrMatricula.hasNext()){
				Matricula matri = itrMatricula.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Nombre: " + matri.getNombre());
				System.out.println("Creditos: " + matri.getCreditos());
				System.out.println("Profesor: " + matri.getProfesor().getNombre());
				//Profesor profesor = new Profesor();
				//profesor.mostrarPersona();
				System.out.println("Año de matriculación: " + matri.getAñoMatriculacion());
				System.out.println("Precio: " + matri.getPrecio());
				// ejemplo: System.out.println("Apellido: " + matri.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println();
				
			}
			return itrMatricula;
	}
}