/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10723112133
 */
public class Triangulo extends Figura {

    private double altura;
    private double base;

    public Triangulo() {
        this("", 0, 0);
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        setBase(base);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return ((getBase() * getAltura()) / 2.0);
    }
}
