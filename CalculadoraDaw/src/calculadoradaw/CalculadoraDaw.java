/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradaw;

/**
 *
 * @author usuario
 */
public class CalculadoraDaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int numero1 = 5;
        int numero2 = 5;

        System.out.println(calculadora.suma(numero1, numero2));

        System.out.println("El ultimo resultado es: " + calculadora.getResultado());
        int ultimoRes = calculadora.getResultado();

        System.out.println(calculadora.suma(numero1, ultimoRes));
        
    }
}
