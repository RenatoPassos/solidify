package br.com.cpdias.solid.dip;

public class App {

	public static void main(String[] args) {
		Database ds = new OracleDatabase();
		
		DatabaseController databaseController = new DatabaseController(ds);
		
		databaseController.connect();
		
		databaseController.disconnect();
		
	}
}
