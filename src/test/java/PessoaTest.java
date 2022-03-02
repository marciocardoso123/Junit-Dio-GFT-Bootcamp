import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
@Test
    void validarCalculoDeIdate(){
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,01,01));
    Assertions.assertEquals(2,pessoa.getIdade());
    }


}
