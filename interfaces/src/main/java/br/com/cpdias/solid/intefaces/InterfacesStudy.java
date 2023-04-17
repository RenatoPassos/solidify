package br.com.cpdias.solid.intefaces;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterfacesStudy {
    private static final Logger LOGGER = LoggerFactory.getLogger(InterfacesStudy.class);
    
    
    public static void main(String[] args) {
        LOGGER.info("Iniciando Programa de exemplo...");
        
        PessoaDao pessoaDao = new PessoaDaoJdbc(); // O único ponto que precisa ser alterado em toda a aplicação
        //PessoaDao pessoaDao = new PessoaDaoFileSystem(); 
        
        Pessoa pessoa = new Pessoa(null, "Eduardo Siqueira");
        pessoaDao.gravar(pessoa);
        
    }
}

record Pessoa (String id, String nome) {}

interface PessoaDao {
   void gravar(Pessoa pessoa);

}

class PessoaDaoJdbc implements PessoaDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(PessoaDaoJdbc.class);
    
    private Connection conn;

    public void gravar(Pessoa pessoa){
      if (pessoa == null) throw new IllegalArgumentException("Objeto Inválido");

      String sql = "INSERT INTO PESSOAS(ID, NOME) VALUES( ?, ? )";
      
      try(PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, UUID.randomUUID().toString());
        ps.setString(2, pessoa.nome());
       
        int result = ps.executeUpdate();

        if (result < 1){
          throw new SQLException("Falha de inserção de dados");
        }

      }catch(SQLException e){
          LOGGER.error("Falha na Inserção de dados {}", e.getMessage(), e);
      }
    }
}

class PessoaDaoFileSystem implements PessoaDao{
    private static final Logger LOGGER = LoggerFactory.getLogger(PessoaDaoFileSystem.class);
    private final String FILE_NAME = "pessoa.txt";
    
    private void gravarEmArquivo(String csvObject) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            writer.write(csvObject);
        }catch(IOException ioe) {
            LOGGER.error("Falha na Inserção de dados {}", ioe.getMessage(), ioe);
        }  
    }

    @Override
    public void gravar(Pessoa pessoa) {
        StringBuilder stb = new StringBuilder();
        stb.append(UUID.randomUUID().toString());
        stb.append(";");
        stb.append(pessoa.nome());
        gravarEmArquivo(stb.toString());
        
    }    
}
