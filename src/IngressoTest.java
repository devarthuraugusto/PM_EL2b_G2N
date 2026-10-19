import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class IngressoTest {
    
    //TODO
    //escolha uma categoria de ingresso para fazer o teste conforme enunciado

    @Test 
    public void calculaIngressoComDoisAdicionais(){

        //Arrange
        MeiaEntrada ingresso = new MeiaEntrada("Carros", LocalDateTime.now());

        ingresso.incluir(EAdicional.BALDE_ESPECIAL);
        ingresso.incluir(EAdicional.REFRIGERANTE);

        assertEquals(ingresso.valorIngresso(), 44.00, 0);
        }

}
