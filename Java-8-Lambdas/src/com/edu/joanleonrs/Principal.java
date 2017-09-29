package com.edu.joanleonrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Persona> milista= new ArrayList<Persona>();
		milista.add(new Persona("Miguel"));
		milista.add(new Persona("Alicia"));
		
		Collections.sort(milista,new Comparator<Persona>() {
			public int compare(Persona p1,Persona p2) {
				return p1.getNombre().compareTo(p2.getNombre());
			}
		});
		
		for (Persona p: milista) {
			System.out.println(p.getNombre());
		}
	}

}
