package br.com.cpdias.solid.srp;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleResponsabilityPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingleResponsabilityPrinciple.class);
    
    public static void main(String[] args) {
        LOGGER.info("Executando programa...");
        
        SingleResponsabilityPrinciple srp = new SingleResponsabilityPrinciple();
        srp.program();
        
        LOGGER.info("Programa finalizado com sucesso!");
        
    }
    
    public void program() {
        System.out.println("Welcome to the Application!");
        
        // capturamos os valores
        ParDeNumeros parDeNumeros = FormParDeNumeros.process();
            
        // Avaliamos se os números são válidos
        if(!parDeNumeros.estaValido()) {
            System.out.println("One of the input is invalid...");
            return;
        }
        
        int firstInteger = Integer.valueOf(parDeNumeros.getPrimeiro());
        int secondInteger = Integer.valueOf(parDeNumeros.getSegundo());
        
        int result = firstInteger +  secondInteger;
        
        System.out.println("The result is: " + result);
        System.out.println("End of the application!");
    }
    
}
class ParDeNumeros {

    private String primeiro;
    private String segundo;
    
    public ParDeNumeros(String primeiraEntrada, String segundaEntrada) {
        this.primeiro = primeiraEntrada;
        this.segundo = segundaEntrada;
    }
    public String getPrimeiro() {
        return primeiro;
    }
    public String getSegundo() {
        return segundo;
    }

    public boolean estaValido() {
        return StringUtils.isNumeric(primeiro) && StringUtils.isNumeric(segundo);
    }
}
class FormParDeNumeros {

    public static ParDeNumeros process() {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Enter the first number: ");
        String firstNumber = scanner.nextLine();
    
        System.out.println("Enter the second number: ");
        String secondNumber = scanner.nextLine();
        
        ParDeNumeros pair = new ParDeNumeros(firstNumber, secondNumber);
        
        scanner.close();
        
        return pair;
    }
}