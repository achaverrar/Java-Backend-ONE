package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.modelo.Producto;

public class ProductoDAO {
	final private Connection con;

	public ProductoDAO(Connection con) {
		this.con = con;
	}

	public void guardar(Producto producto) {
		try (this.con) {
			final PreparedStatement statement = this.con.prepareStatement(
					"INSERT INTO producto " + "(nombre, descripcion, cantidad) " + "VALUES (?, ?, ?)",
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
}
