/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao5;

import comPadrao.ExpensiveObjectFactory;
import comPadrao.ObjectPool;
import semPadrao.ExpensiveObject;

/**
 *
 * @author Gustavo
 */
public class Padrao5 {

    /**
     * @param args the command line arguments
     */
        // Sem padrao
     public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ExpensiveObject obj = new ExpensiveObject();
            obj.doSomething();
        }
        
        // Com Padrao
        ObjectPool<ExpensiveObject> pool = new ObjectPool<>(3, new ExpensiveObjectFactory());

        for (int i = 0; i < 5; i++) {
            ExpensiveObject obj = pool.borrowObject();
            obj.doSomething();
            pool.returnObject(obj);
        }
    }
    
}
