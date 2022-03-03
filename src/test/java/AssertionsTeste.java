import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
    @Test

    void ValidarLancamentos(){
        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {-1,5,10,16,17};
//teste de comparação de arrays se o segundo é igual ao primeiro
        //Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);//teste se arrays são iguais
        Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);//teste se arrays são diferentes
    }
@Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
//teste se pessoa é null
        Assertions.assertNull(pessoa);
}
@Test
    void validarTiposNumDiferente(){
        double valor = 5.0;
        double outroValor = 5.0;
        //teste de valores iguais
        Assertions.assertEquals(valor,outroValor);
}

}
