package br.com.cpdias.solid.isp;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Pagamento{
	
    Object situacao();
    List<Object> pagamentos(); 
    
}

interface Banco extends Pagamento {
	void iniciarPagamentos();
}

interface Emprestimo extends Pagamento {
	void  iniciarPagamentoDeEmprestimo();
	void  iniciarReembolso();
}

class PagamentoBancario implements Pagamento {
	@Override
	public Object situacao() {
		return true;
	}
	@Override
	public List<Object> pagamentos() {
		return Collections.emptyList();
	}
}
class PagamentoDeEmprestimo implements Emprestimo {

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
		System.out.println("Preparando carga de pagamentos de empréstimos.");
		
	}
	@Override
	public void iniciarReembolso() {
		System.out.println("Preparando Reembolso.");
		
	}
}
public class InterfaceSegregationPrinciple {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterfaceSegregationPrinciple.class);
    
    public static void main(String[] args) {
        LOGGER.info("Executando programa...");
        PagamentoDeEmprestimo pagamento = new PagamentoDeEmprestimo();
        pagamento.iniciarPagamentoDeEmprestimo();
        LOGGER.info("Programa finalizado com sucesso!");
        
    }
}

