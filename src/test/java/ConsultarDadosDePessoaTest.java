import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.beans.BeanProperty;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
   static void configurarConexao(){
        BancoDeDados.iniciarConexao();
        //System.out.println("Rodou configurarConexao");
    }
@Test
    void validarDadosDeRetorno(){
    Assertions.assertTrue(true);
}
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        //System.out.println("Rodou FinalizarConexao");
    }

}
