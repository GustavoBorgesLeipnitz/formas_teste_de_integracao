/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10723112133
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestFigura {

    @Test
    void testGetCor() {
        String retornoEsperado = "Verde";
        Figura retangulo = new Retangulo();
        retangulo.setCor("Verde");
        assertEquals(retornoEsperado, retangulo.getCor());
    }
}
