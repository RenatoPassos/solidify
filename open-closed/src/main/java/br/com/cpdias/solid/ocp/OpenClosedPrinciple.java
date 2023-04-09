package br.com.cpdias.solid.ocp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

enum TipoDePagamento{
    CARTAO_DEBITO, //Adiciona 2.00 para cobrir custos operacionais
    PIX, // Desconta .50 centavos 
    CHEQUE // Adiciona 13%  a título de risco.
}
public class OpenClosedPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpenClosedPrinciple.class);
    
    
    double cobrancaTotal(TipoDePagamento tipo, float valor) {
        if (tipo == TipoDePagamento.CARTAO_DEBITO) {
            return valor + 2f;
        }
        else if (tipo == TipoDePagamento.PIX) {
            return valor - 0.5f;
        }
        else if (tipo == TipoDePagamento.CHEQUE) {
            return valor + (valor * 0.13);
        }
        return 0f;
    }
    
    public static void main(String[] args) {
        LOGGER.info("Executando programa...");
        
        OpenClosedPrinciple ocp = new OpenClosedPrinciple();
        System.out.println(ocp.cobrancaTotal(TipoDePagamento.CARTAO_DEBITO, 100));
        System.out.println(ocp.cobrancaTotal(TipoDePagamento.PIX, 100));
        System.out.println(ocp.cobrancaTotal(TipoDePagamento.CHEQUE, 100));
        
        LOGGER.info("Programa finalizado com sucesso!");
        
    }
    
    
    
}

