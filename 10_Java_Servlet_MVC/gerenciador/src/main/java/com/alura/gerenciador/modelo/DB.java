package com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer llaveSecuencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNombre("Alura");
		empresa.setId(DB.llaveSecuencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Caelum");
		empresa2.setId(DB.llaveSecuencial++);
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return DB.listaEmpresas;
	}

	public void eliminarEmpresa(Integer id) {
		Iterator<Empresa> it = DB.listaEmpresas.iterator();
		while(it.hasNext()) {
			Empresa empresa = it.next();
			if(empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscarEmpresaPorId(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
