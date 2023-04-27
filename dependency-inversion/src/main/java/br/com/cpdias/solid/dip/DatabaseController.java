package br.com.cpdias.solid.dip;

// Representa um módulo de alto nivel
public class DatabaseController {

	// we program to an interface - so we can achieve loosely coupled architecture
	private MySQLDatabase database;
	
	public DatabaseController() {
		this.database = new MySQLDatabase();
		this.database.connect();
		this.database.disconnect();
	}
	
}
