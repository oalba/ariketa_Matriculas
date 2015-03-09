package com.zubiri.matriculas;

import java.util.*;

public class Profesor extends Persona {
	
	String titulacion;
	String departamento;

	public Profesor(String dni, String nombre, String apellido, String titulacion, String departamento){
		super(dni, nombre, apellido);
		this.titulacion = titulacion;
		this.departamento = departamento;
	}
	public Profesor(Scanner sc){
		super(sc);
		try{
			System.out.println("Titulación del profesor: ");
			this.setTitulacion(sc.next());
			System.out.println("Departamento: ");
			this.setDepartamento(sc.next());
		}catch (Exception e) {
			System.out.println("¡Error al introducir el profesor!"+e);
		
		}
	}
	
	public String getTitulacion() {
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public void mostrarPersona(){
		try{
			System.out.println("PROFESOR:");
			super.mostrarPersona();
			System.out.println("Titulación: " + getTitulacion());
			System.out.println("Departamento: " + getDepartamento());
		}catch (Exception e) {
			System.out.println("¡Error al mostrar el profesor!"+e);	
		}
	}
	
}
