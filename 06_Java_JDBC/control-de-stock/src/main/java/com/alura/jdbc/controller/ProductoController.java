package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {
	private ProductoDAO productoDAO;

	public ProductoController() {
		this.productoDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());
	}
	
	public int modificar(String nombre, String descripcion, Integer id, Integer cantidad) {
		return this.productoDAO.modificar(nombre, descripcion, id, cantidad);
	}

	public int eliminar(Integer id) {
		return this.productoDAO.eliminar(id);
	}

	public List<Producto> listar() {
		return this.productoDAO.listar();
	}
	
	public List<Producto> listar(Categoria categoria) {
		return this.productoDAO.listar(categoria.getId());
	}

	public void guardar(Producto producto, Integer categoriaId) {
		producto.setCategoriaId(categoriaId);
		this.productoDAO.guardar(producto);
	}

}