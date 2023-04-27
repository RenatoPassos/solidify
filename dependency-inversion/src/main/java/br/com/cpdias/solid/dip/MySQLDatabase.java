package br.com.cpdias.solid.dip;
// low level module
public class MySQLDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Conectando um banco MySQL...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Desconectando o banco MySQL....");
	}
}
