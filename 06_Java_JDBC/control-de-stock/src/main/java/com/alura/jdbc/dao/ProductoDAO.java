package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.modelo.Producto;

public class ProductoDAO {
	final private Connection con;

	public ProductoDAO(Connection con) {
		this.con = con;
	}

	public void guardar(Producto producto) {
		try {
			final PreparedStatement statement = this.con.prepareStatement(
					"INSERT INTO producto " + "(nombre, descripcion, cantidad, categoria_id) " + "VALUES (?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				ejecutarRegistro(statement, producto);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private void ejecutarRegistro(PreparedStatement statement, Producto producto) throws SQLException {
		statement.setString(1, producto.getNombre());
		statement.setString(2, producto.getDescripcion());
		statement.setInt(3, producto.getCantidad());
		statement.setInt(4, producto.getCategoriaId());

		statement.execute();

		/*
		 * Java 9's syntax to close connections automatically. It only works with
		 * entities that implement the interface Autoclosable.
		 */
		final ResultSet resultSet = statement.getGeneratedKeys();

		try (resultSet) {
			while (resultSet.next()) {
				producto.setId(resultSet.getInt(1));
				System.out.println(String.format("Fue insertado el producto %s", producto));
			}
		}
	}

	public List<Producto> listar() {
		try {
			final PreparedStatement statement = this.con
					.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM producto");

			try (statement) {
				statement.execute();

				ResultSet resultSet = statement.getResultSet();

				List<Producto> resultado = new ArrayList<>();

				while (resultSet.next()) {
					Producto fila = new Producto(
							resultSet.getInt("id"), 
							resultSet.getString("nombre"), 
							resultSet.getString("descripcion"), 
							resultSet.getInt("cantidad"));
					resultado.add(fila);
				}
				return resultado;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Producto> listar(Integer categoriaId) {
		try {
			final PreparedStatement statement = this.con
					.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM producto WHERE categoria_id = ?");

			try (statement) {
				statement.setInt(1, categoriaId);
				statement.execute();

				ResultSet resultSet = statement.getResultSet();

				List<Producto> resultado = new ArrayList<>();

				while (resultSet.next()) {
					Producto fila = new Producto(
							resultSet.getInt("id"), 
							resultSet.getString("nombre"), 
							resultSet.getString("descripcion"), 
							resultSet.getInt("cantidad"));
					resultado.add(fila);
				}
				return resultado;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int modificar(String nombre, String descripcion, Integer id, Integer cantidad) {
		try {
			final PreparedStatement statement = this.con.prepareStatement(
					"UPDATE producto SET " + "nombre = ?, " + "descripcion = ?, " + "cantidad = ? " + "WHERE id = ?");
			
			try (statement) {
				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);
				
				statement.execute();
				
				return statement.getUpdateCount();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public int eliminar(Integer id) {
		try {
			final PreparedStatement statement = con.prepareStatement("DELETE FROM producto WHERE id = ?");

			try (statement) {
				statement.setInt(1, id);
				statement.execute();

				return statement.getUpdateCount();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
