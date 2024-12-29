/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratormain;

import comPadrao.AcucarDecorator;
import comPadrao.Cafe;
import comPadrao.CafeSimples;
import comPadrao.LeiteDecorator;
import semPadrao.CafeComAcucarSem;
import semPadrao.CafeComLeiteSem;
import semPadrao.CafeSimplesSem;

/**
 *
 * @author Gustavo
 */
public class DecoratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        Cafe cafe = new CafeComAcucarSem();
        System.out.println(cafe.preparar() + " custa: R$ " + cafe.preco());

        Cafe outroCafe = new CafeComLeiteSem();
        System.out.println(outroCafe.preparar() + " custa: R$ " + outroCafe.preco());
        // Com padrao
        Cafe cafeSem = new CafeSimplesSem();
        System.out.println(cafeSem.preparar() + " custa: R$ " + cafe.preco());

        Cafe cafeComAcucar = new AcucarDecorator(cafe);
        System.out.println(cafeComAcucar.preparar() + " custa: R$ " + cafeComAcucar.preco());

        Cafe cafeComLeiteEAcucar = new LeiteDecorator(cafeComAcucar);
        System.out.println(cafeComLeiteEAcucar.preparar() + " custa: R$ " + cafeComLeiteEAcucar.preco());
    }

}
