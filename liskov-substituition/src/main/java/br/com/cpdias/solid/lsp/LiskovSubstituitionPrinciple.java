package br.com.cpdias.solid.lsp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiskovSubstituitionPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(LiskovSubstituitionPrinciple.class);
    
    public static void main(String[] args) {
        
        Veiculo v = new CarroaGasolina("Toyota", 3);
        
        v.speedUp();
        v.slowDown();
        
        
    }
}
abstract class Veiculo  {

    protected String tipo;
    protected int idade;
    
    public Veiculo(String type, int age) {
        this.tipo = type;
        this.idade = age;
    }
    
    protected void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }
    
    protected void slowDown() {
        System.out.println("Vehicle is slowing down...");
    }
}
class CarroaGasolina extends Veiculo {

    public CarroaGasolina(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Car is speeding up...");
    }
    
    @Override
    protected void slowDown() {
        System.out.println("Car is slowing down...");
    }
    
  
}

class CarroEletrico extends Veiculo {

    public CarroEletrico(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Electric car is speeding up...");
    }
    
    @Override
    protected void slowDown() {
        System.out.println("Electric car is slowing down...");
    }
    
  
}
