/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interpreter;

import pattern.AndExpression;
import pattern.Expression;
import pattern.OrExpression;
import pattern.TerminalExpressionFalse;
import pattern.TerminalExpressionTrue;

/**
 *
 * @author Gustavo
 */
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Expressão: (true AND false) OR (true AND true) No pattern
        boolean result = (true && false) || (true && true);
        System.out.println("Resultado: " + result);
        
        // Criando os valores booleanos Pattern
        Expression trueExpr = new TerminalExpressionTrue();
        Expression falseExpr = new TerminalExpressionFalse();

        // Criando a expressão: (true AND false) OR (true AND true)
        Expression andExpression1 = new AndExpression(trueExpr, falseExpr);  // true AND false
        Expression andExpression2 = new AndExpression(trueExpr, trueExpr);   // true AND true
        Expression orExpression = new OrExpression(andExpression1, andExpression2); // (true AND false) OR (true AND true)

        // Interpretando a expressão
        boolean resultInterpreter = orExpression.interpret();
        System.out.println("Resultado: " + resultInterpreter);
    }
    
}
