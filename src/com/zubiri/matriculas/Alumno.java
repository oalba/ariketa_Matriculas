package com.zubiri.matriculas;

import java.util.*;

public class Alumno extends Persona {
	
	//Año en el que se inscribio por primera vez en alguna asignatura
	int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	//Matriculas realizadas a lo largo de los años en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;

	public Alumno(String dni, String nombre, String apellido, int añoInscripcion, String ciclo, ArrayList<Matricula> matriculas){
		super(dni, nombre, apellido);
		this.añoInscripcion = añoInscripcion;
		this.ciclo = ciclo;
		this.matriculas = matriculas;
	}
	public Alumno(Scanner sc){
		super(sc);
		try{
			System.out.println("Año de inscripción: ");
			this.setAñoInscripcion(sc.nextInt());
			System.out.println("Ciclo matriculado: ");
			this.setCiclo(sc.next());
			this.setMatriculas(Matriculas.añadirMatricula(sc));
		}catch (Exception e) {
			System.out.println("¡Error al introducir el alumno!"+e);
		
		}
	}
	
	public int getAñoInscripcion() {
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	@Override
	public void mostrarPersona(){
		try{
			System.out.println("ALUMNO:");
			super.mostrarPersona();
			System.out.println("Año de inscripción: " + getAñoInscripcion());
			System.out.println("Ciclo: " + getCiclo());
			System.out.println("Matrículas: " + getMatriculas());
		}catch (Exception e) {
			System.out.println("¡Error al mostrar el alumno!"+e);
		}
	}

}
