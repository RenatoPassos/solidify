package br.com.cpdias.solid.dip;
// low level module
public class MySQLDatabase {


	public void connect() {
		System.out.println("Conectando um banco MySQL...");
	}
	
	public void disconnect() {
		System.out.println("Desconectando o banco MySQL....");
	}
}
