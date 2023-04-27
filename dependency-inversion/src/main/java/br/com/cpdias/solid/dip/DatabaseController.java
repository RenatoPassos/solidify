package br.com.cpdias.solid.dip;

// Representa um módulo de alto nivel
public class DatabaseController {

	// we program to an interface - so we can achieve loosely coupled architecture
	private Database database;
	
	public DatabaseController(Database database) {
		this.database = database;
	}
	
	public void connect() {
		this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}
}
