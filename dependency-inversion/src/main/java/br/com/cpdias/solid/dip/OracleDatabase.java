package br.com.cpdias.solid.dip;

// this is another low level module
public class OracleDatabase implements Database {

	@Override
	public void connect() {
		System.out.println("Conectando um banco Oracle...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Desconectando o banco Oracle...");
	}
}
