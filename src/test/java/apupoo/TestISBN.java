package apupoo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import apupoo.modelo.ISBN;

public class TestISBN {
    ISBN isbn;
    
    @BeforeEach
    public void Iniciar(){
        isbn = new ISBN("7583358469873");
    }

    @AfterEach
    public void finalizar(){
        isbn = null;
    }

    @Test
    public void testVerificarISBN(){

        assertTrue(isbn.verificarISBN("7583358469873"));
    }
}
