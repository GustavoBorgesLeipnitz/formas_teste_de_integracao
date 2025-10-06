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

class TestDesenho {

    @Test
    void testAdicionar() {
        //Objeto desenho a ser testado
        Desenho desenho = new Desenho();

        //Insere uma figura do tipo retângulo
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        Retangulo retangulo = new Retangulo("",
                baseRetangulo, alturaRetangulo);

        desenho.adicionar(retangulo);
        int retornoFeito = desenho.getFiguras().size();
        int retornoEsperado = 1;

        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testGetArea() {
        Desenho desenho = new Desenho(); //Objeto desenho a ser testado
        //Insere uma figura do tipo retângulo
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        double retornoEsperadoRetangulo = 6;
        Retangulo retangulo = new Retangulo("", baseRetangulo,
                alturaRetangulo);
        desenho.adicionar(retangulo);

        //Insere uma figura do tipo triângulo
        double alturaTriangulo = 3;
        double baseTriangulo = 2;
        double retornoEsperadoTriangulo = 3.0;
        Triangulo triangulo = new Triangulo("", baseTriangulo,
                alturaTriangulo);
        desenho.adicionar(triangulo);
        double areaDesenhoEsperado = retornoEsperadoRetangulo
                + retornoEsperadoTriangulo;
        double retornoFeito = desenho.getArea();
        assertEquals(areaDesenhoEsperado, retornoFeito);
    }
}
