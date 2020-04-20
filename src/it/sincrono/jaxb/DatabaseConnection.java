package it.sincrono.jaxb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import javax.sql.*;

public class DatabaseConnection {

	private final String URL = "jdbc:postgresql://localhost:5432/corso";
	private final String username = "excale";
	private final String password = "Lambda1!41";

	private Connection conn;

	public void connect() {

		try {
			conn = DriverManager.getConnection(URL, username, password);

			if(conn != null)
				System.out.println("connected to the database");
			else
				System.out.println("failed to make connection");

		}

		catch (SQLException e) {
			System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public List<Anagrafica> queryAllAnagrafica() throws SQLException {
		List<Anagrafica> result = new ArrayList<>();

		if(conn == null) {
			System.out.println("errore, connessione non aperta");
			return null;

		}

		Statement stmt = conn.createStatement();
		String query = "SELECT * FROM main.ANAGRAFICA";
		ResultSet rs = stmt.executeQuery(query);

		while(rs.next()) {
			Anagrafica elem = new Anagrafica();
			elem.setCodfiscale(rs.getString("cod_fiscale"));
			elem.setCognome(rs.getString("cognome"));
			elem.setNome(rs.getString("nome"));
			elem.setDatanascita(rs.getString("data_nascita"));
			result.add(elem);
		}

		return result;

	}

}
