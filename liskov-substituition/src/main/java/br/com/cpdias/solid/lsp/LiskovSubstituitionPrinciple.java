package br.com.cpdias.solid.lsp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiskovSubstituitionPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(LiskovSubstituitionPrinciple.class);
    
    public static void main(String[] args) {
        LOGGER.info("Iniciando Uso do Veículo.");
        /*Veiculo veiculo = new Veiculo("Toyota", 3);
        
        veiculo.acelera();
        veiculo.desacelera();
        veiculo.abastece();*/
        
        LOGGER.info("Trocando Uso do Veículo Por um carro a gasolina.");
        Veiculo veiculo2 = new CarroaGasolina("Ford", 4);
        
        veiculo2.acelera();
        veiculo2.desacelera();
        veiculo2.abastece();
        
        LOGGER.info("Trocando Uso do Veículo Por um carro elétrico.");
        Veiculo veiculo3 = new CarroEletrico("Tesla", 5);
        
        veiculo3.acelera();
        veiculo3.desacelera();
        veiculo3.abastece();
    }
}
abstract class Veiculo  {

    protected String tipo;
    protected int idade;
    
    public Veiculo(String type, int age) {
        this.tipo = type;
        this.idade = age;
    }
    
    protected void acelera() {
        System.out.println("O veículo está acelerando...");
    }
    
    protected void desacelera() {
        System.out.println("O veículo está desacelerando......");
    }
    protected abstract void abastece();
        
}
class CarroaGasolina extends Veiculo {

    public CarroaGasolina(String type, int age) {
        super(type, age);
    }
    @Override
    protected void acelera() {
        System.out.println("O Carro a Gasolina está acelerando...");
    }
    @Override
    protected void desacelera() {
        System.out.println("O Carro a Gasolina está desacelerando......");
    }
    @Override
    protected void abastece() {
        System.out.println("O Carro a Gasolina está abastecendo......");
    }
}

class CarroEletrico extends Veiculo {

    public CarroEletrico(String type, int age) {
        super(type, age);
    }
    @Override
    protected void acelera() {
        System.out.println("O Carro Elétrico está acelerando...");
    }
    
    @Override
    protected void desacelera() {
        System.out.println("O Carro Elétrico está desacelerando......");
    }
    
    /*@Override
    protected void abastece() {
        System.out.println("O Carro Elétrico está abastecendo......");
    }*/
    
    @Override
    protected void abastece() {
        System.out.println("O Carro Elétrico está sendo carregando a bateria......");
    }
}
