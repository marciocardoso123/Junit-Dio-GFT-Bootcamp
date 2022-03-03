import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
        // anotação necessária para teste
    void validarCalculoDeIdate() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 01, 01));// cenário de teste
        Assertions.assertEquals(2, pessoa.getIdade()); //teste de validações
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
            Pessoa Jon = new Pessoa("Jon", LocalDate.of(1988, 10, 25));
            Assertions.assertEquals(2, Jon.getIdade());//teste com expectativa de retorno 2 anos proposital
            Assertions.assertTrue(Jon.ehMaiorDeIdade());// retorno 33 anos
        }

}

