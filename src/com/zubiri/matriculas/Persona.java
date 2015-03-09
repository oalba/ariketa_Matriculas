package com.zubiri.matriculas;

import java.util.*;

public abstract class Persona {
	
	String dni;
	String nombre;
	String apellido;

	public Persona(String dni, String nombre, String apellido){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(Scanner sc){
		try{
			System.out.println("Introduce los datos de la persona: ");
			System.out.println("DNI: ");
			this.setDni(sc.next());
			System.out.println("Nombre: ");
			this.setNombre(sc.next());
			System.out.println("Apellido: ");
			this.setApellido(sc.next());
		}catch (Exception e) {
			System.out.println("¡Error al introducir la persona!"+e);
		
		}
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
			String personastr = this.getDni() + ":" + this.getNombre() + ":" + this.getApellido() + "\n";
			return personastr;		
	}
	
	/**
	 * M�todo que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		try{
			String separador = (Character.toString(separator));
			String [] parte = personaStr.split(separador);
			System.out.println("DNI: " + parte[0]);
			System.out.println("Nombre: " + parte[1]);
			System.out.println("Apellido: " + parte[2]);
		}catch (Exception e) {
			System.out.println("¡Error con la obtención de los valores!"+e);
		}
	}
	public void mostrarPersona(){
		try{
			System.out.println("DNI: " + getDni());
			System.out.println("Nombre: " + getNombre());
			System.out.println("Apellido: " + getApellido());
		} catch (Exception e) {
			System.out.println("¡Error al mostrar la persona!"+e);
		}
		
	}
}
