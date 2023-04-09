package br.com.cpdias.solid.ocp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface OperacaoDePagamento{
    double cobrancaTotal(double valor);    
}
class CartaoDeDebito implements OperacaoDePagamento{
    @Override
    public double cobrancaTotal(double valor) {
        return valor + 2.00;
    }
}

class Pix implements OperacaoDePagamento{
    @Override
    public double cobrancaTotal(double valor) {
        return valor - 0.5;
    }
}

class Cheque implements OperacaoDePagamento{
    @Override
    public double cobrancaTotal(double valor) {
        return valor + (valor * 0.13);
    }
}
public class OpenClosedPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenClosedPrinciple.class);
    
    public static void main(String[] args) {
        LOGGER.info("Executando programa...");
        
        OperacaoDePagamento debito = new CartaoDeDebito();
        OperacaoDePagamento pix = new Pix();
        OperacaoDePagamento  cheque = new Cheque();
        
        System.out.println(debito.cobrancaTotal(100));
        System.out.println(pix.cobrancaTotal(100));
        System.out.println(cheque.cobrancaTotal(100));
        
        LOGGER.info("Programa finalizado com sucesso!");
        
    }    
}
