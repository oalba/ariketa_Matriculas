package com.zubiri.matriculas;

import java.util.*;

public class Asignatura {

	String nombre;
	int creditos;
	Profesor profesor;

	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	public Asignatura(Scanner sc){
		try{
			System.out.println("Nombre de la signatura: ");
			this.setNombre(sc.next());
			System.out.println("Créditos: ");
			this.setCreditos(sc.nextInt());
			System.out.println("Profesor: ");
			Profesor profesor = new Profesor(sc);
		}catch (Exception e) {
			System.out.println("¡Error al introducir la asignatura!"+e);
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * Metodo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
			String asignaturastr = this.getNombre() + ":" + this.getCreditos() + ":" + this.getProfesor() + "\n";
			return asignaturastr;
	}
	
	/**
	 * M�todo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String asignaturaStr, char separator) {
		try{
			String separador = (Character.toString(separator));
			String [] parte = asignaturaStr.split(separador);
			System.out.println("Nombre de la asignatura: " + parte[0]);
			System.out.println("Créditos de la asignatura: " + parte[1]);
			System.out.println("Profesor: " + parte[2]);
		}catch (Exception e) {
			System.out.println("¡Error con la obtención de los valores!"+e);
		}
	}
	public void mostrarAsignatura(){
		try{
		System.out.println("Nombre: " + getNombre());
		System.out.println("Créditos: " + getCreditos());
		System.out.println("Profesor: " + getProfesor());
		}catch (Exception e) {
			System.out.println("¡Error al mostrar la asignatura!"+e);			
		}
	}

}
