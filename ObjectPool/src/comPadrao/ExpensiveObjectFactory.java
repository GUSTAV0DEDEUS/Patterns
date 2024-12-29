/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

import semPadrao.ExpensiveObject;

/**
 *
 * @author Gustavo
 */
public class ExpensiveObjectFactory implements ObjectFactory<ExpensiveObject> {
    @Override
    public ExpensiveObject create() {
        return new ExpensiveObject();
    }
}
