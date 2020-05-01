// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 02/12/19
// Class - 10th
// Lab - Expression Solver

import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
    public static void main(String args[]) {
        ExpressionSolver exp = new ExpressionSolver("3 + 5");

        exp.solveExpression();
        System.out.println(exp + "\n");

        exp.setExpression("3 * 5");
        exp.solveExpression();
        System.out.println(exp + "\n");

        exp.setExpression("3 - 5");
        exp.solveExpression();
        System.out.println(exp + "\n");

        exp.setExpression("3 / 5");
        exp.solveExpression();
        System.out.println(exp + "\n");

        exp.setExpression("5 / 5 * 2 + 8 / 2 + 5");
        exp.solveExpression();
        System.out.println(exp + "\n");

        exp.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
        exp.solveExpression();
        System.out.println(exp + "\n");

    }
}
