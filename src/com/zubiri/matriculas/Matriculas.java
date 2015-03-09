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
}