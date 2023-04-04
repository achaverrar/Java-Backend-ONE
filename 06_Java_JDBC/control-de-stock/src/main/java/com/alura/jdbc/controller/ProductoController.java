package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoController {

	public int modificar(String nombre, String descripcion, Integer id, Integer cantidad) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexion();

		PreparedStatement statement = con.prepareStatement(
				"UPDATE producto SET " + "nombre = ?, " + "descripcion = ?, " + "cantidad = ? " + "WHERE id = ?");
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
		statement.setInt(4, id);

		statement.execute();

		con.close();

		return statement.getUpdateCount();
	}

	public int eliminar(Integer id) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexion();

		PreparedStatement statement = con.prepareStatement("DELETE FROM producto WHERE id = ?");

		statement.setInt(1, Integer.valueOf(id));

		statement.execute();

		con.close();

		return statement.getUpdateCount();
	}

	public List<Map<String, String>> listar() throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexion();

		PreparedStatement statement = con.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM producto");

		statement.execute();

		ResultSet resultSet = statement.getResultSet();

		List<Map<String, String>> resultado = new ArrayList<>();

		while (resultSet.next()) {
			Map<String, String> fila = new HashMap<>();
			fila.put("id", String.valueOf(resultSet.getInt("id")));
			fila.put("nombre", resultSet.getString("nombre"));
			fila.put("descripcion", resultSet.getString("descripcion"));
			fila.put("cantidad", String.valueOf(resultSet.getInt("cantidad")));
			resultado.add(fila);
		}

		con.close();

		return resultado;
	}

	public void guardar(Map<String, String> producto) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexion();
		/* If there's an error with the transaction and it can't be completed,
		 * all progress made is undone. 
		*/
		con.setAutoCommit(false);
		
		PreparedStatement statement = con.prepareStatement(
				"INSERT INTO producto " + "(nombre, descripcion, cantidad) " + "VALUES (?, ?, ?)",
				Statement.RETURN_GENERATED_KEYS);

		String nombre = producto.get("nombre");
		String descripcion = producto.get("descripcion");
		Integer cantidad = Integer.valueOf(producto.get("cantidad"));
		Integer maximaCantidad = 50;

		try {
			do {
				int cantidadParaGuardar = Math.min(cantidad, maximaCantidad);
				ejecutarRegistro(statement, nombre, descripcion, cantidadParaGuardar);
				cantidad -= maximaCantidad;
			} while (cantidad > 0);
			
			/* 
			 * When auto-commit is set to false, we have to explicitly 
			 * commit the changes to the database
			 */
			con.commit();			
		} catch (Exception e) {
			con.rollback();
		}
		
		statement.close();
		con.close();
	}

	private void ejecutarRegistro(PreparedStatement statement, String nombre, String descripcion, Integer cantidad)
			throws SQLException {
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();

		ResultSet resultSet = statement.getGeneratedKeys();

		while (resultSet.next()) {
			System.out.println(String.format("Fue insertado el producto de id %d", resultSet.getInt(1)));
		}
	}

}
