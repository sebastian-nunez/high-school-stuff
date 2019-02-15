
// � A+ Computer Science - www.apluscompsci.com
// Name - Sebastian Nunez
// Date - 02/12/19
// Class - 10th
// Lab - Expression Solver

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
  //add in instance variables
  private ArrayList<String> exp;
  String[] expArray;

  public ExpressionSolver(String s) {
    setExpression(s);
  }

  public void setExpression(String s) {
    expArray = s.split(" ");
    exp = new ArrayList<String>(Arrays.asList(expArray));
  }

  public void solveExpression() {
    String operator = "";
    int operatorIndex = 0;

    String firstOperand = "";
    int firstOperandValue = 0;

    String secondOperand = "";
    int secondOperandValue = 0;

    int result = 0;

    while (exp.contains("*") || exp.contains("/")) {
      if (exp.indexOf("*") == -1) {
        operator = "/";
      } else if (exp.indexOf("/") == -1) {
        operator = "*";
      } else if (exp.indexOf("*") < exp.indexOf("/")) {
        operator = "*";
      } else if (exp.indexOf("/") < exp.indexOf("*")) {
        operator = "/";
      }

      operatorIndex = exp.indexOf(operator);

      if (operator.equals("*")) {
        firstOperand = exp.get(exp.indexOf("*") - 1);
        secondOperand = exp.get(exp.indexOf("*") + 1);
      } else if (operator.equals("/")) {
        firstOperand = exp.get(exp.indexOf("/") - 1);
        secondOperand = exp.get(exp.indexOf("/") + 1);
      }

      result = 0;
      firstOperandValue = Integer.parseInt(firstOperand);
      secondOperandValue = Integer.parseInt(secondOperand);

      if (operator.equals("*")) {
        result = firstOperandValue * secondOperandValue;
      } else if (operator.equals("/")) {
        result = firstOperandValue / secondOperandValue;
      }

      exp.remove(operatorIndex + 1);
      exp.remove(operatorIndex - 1);

      exp.set(operatorIndex - 1, "" + result);
    }

    while (exp.contains("+") || exp.contains("-")) {
      if (exp.indexOf("+") == -1) {
        operator = "-";
      } else if (exp.indexOf("-") == -1) {
        operator = "+";
      } else if (exp.indexOf("+") < exp.indexOf("-")) {
        operator = "+";
      } else if (exp.indexOf("-") < exp.indexOf("+")) {
        operator = "-";
      }

      operatorIndex = exp.indexOf(operator);

      if (operator.equals("+")) {
        firstOperand = exp.get(exp.indexOf("+") - 1);
        secondOperand = exp.get(exp.indexOf("+") + 1);
      } else if (operator.equals("-")) {
        firstOperand = exp.get(exp.indexOf("-") - 1);
        secondOperand = exp.get(exp.indexOf("-") + 1);
      }

      result = 0;
      firstOperandValue = Integer.parseInt(firstOperand);
      secondOperandValue = Integer.parseInt(secondOperand);

      if (operator.equals("+")) {
        result = firstOperandValue + secondOperandValue;
      } else if (operator.equals("-")) {
        result = firstOperandValue - secondOperandValue;
      }

      exp.remove(operatorIndex + 1);
      exp.remove(operatorIndex - 1);

      exp.set(operatorIndex - 1, "" + result);
    }
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < expArray.length; i++) {
      output += expArray[i] + " ";
    }
    output += "= " + exp.get(0);
    return output;
  }
}
