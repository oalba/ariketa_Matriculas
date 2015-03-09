package com.zubiri.matriculas;

import java.util.*;

public class Matricula extends Asignatura {
	
	int añoMatriculacion;
    double precio;

    public Matricula(String nombre, int creditos, Profesor profesor, int añoMatriculacion, double precio){
    	super(nombre, creditos, profesor);
    	this.añoMatriculacion = añoMatriculacion;
    	this.precio = precio;
    }
    public Matricula(Scanner sc){
    	super(sc);
    	try{
	    	System.out.println("Año de matriculación: ");
	    	this.setAñoMatriculacion(sc.nextInt());
	    	System.out.println("Precio: ");
	    	this.setPrecio(sc.nextDouble());
    	}catch (Exception e) {
			System.out.println("¡Error al introducir la matrícula!"+e);
		}
    }
	
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	/**
	 * Metodo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matricula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		double precioTotal = this.getPrecio()-((this.getPrecio()*porcentaje)/100);
		return precioTotal;
	}

	public void mostrarMatricula(){
		try{
			super.mostrarAsignatura();
			System.out.println("Año de matriculación: " + getAñoMatriculacion());
			System.out.println("Precio: " + getPrecio());
		} catch (Exception e) {
			System.out.println("¡Error al mostrar la matrícula!"+e);
		}
	}
}
