package br.com.cpdias.solid.srp;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleResponsabilityPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingleResponsabilityPrinciple.class);
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número :");
        String primeiraEntrada = scanner.nextLine();
        
        System.out.println("Entre com o segundo número : ");
        String segundaEntrada = scanner.nextLine();
        
        scanner.close();
        
        int primeiroNumero = 0;
        int segundoNumero = 0;
        
        if (!StringUtils.isNumeric(primeiraEntrada)){
           System.out.println("O primeiro Número não é válido");
           return;
        }
        
        if (!StringUtils.isNumeric(segundaEntrada)){
            System.out.println("O segundo Número não é válido");
            return;
        }
        LOGGER.info("fINALIZANDO ");
        
        primeiroNumero = Integer.parseInt(primeiraEntrada);
        segundoNumero = Integer.parseInt(segundaEntrada);
        
        int resultado = primeiroNumero + segundoNumero;
        System.out.println(String.format("O resultado da soma é %d", resultado));
        
        System.out.println("Fim da aplicação");
        
        
        
    }
}
