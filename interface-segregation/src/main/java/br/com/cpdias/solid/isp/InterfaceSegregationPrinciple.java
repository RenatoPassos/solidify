package br.com.cpdias.solid.isp;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Pagamento{
	void iniciarPagamentos();
    Object situacao();
    List<Object> pagamentos(); 
    
    // A medida que o tempo passa...
    void  iniciarPagamentoDeEmprestimo();
    void  iniciarReembolso();
}
class PagamentoBancario implements Pagamento {

	@Override
	public void iniciarPagamentos() {
		System.out.println("Zerando todos os pagamentos...");
	}
	@Override
	public Object situacao() {
		return true;
	}
	@Override
	public List<Object> pagamentos() {
		return Collections.emptyList();
	}

	@Override
	public void iniciarPagamentoDeEmprestimo() {
		throw new UnsupportedOperationException("Não sei como Fazer um pagamento de empréstimo.");
	}

	@Override
	public void iniciarReembolso() {
		throw new UnsupportedOperationException("Não sei como Fazer um Reembolso.");
	}
	
}


public class InterfaceSegregationPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterfaceSegregationPrinciple.class);
    
    public static void main(String[] args) {
        LOGGER.info("Executando programa...");
        Pagamento pagamento = new PagamentoBancario();
        pagamento.iniciarPagamentoDeEmprestimo();
        LOGGER.info("Programa finalizado com sucesso!");
        
    }
    
    
    
}

