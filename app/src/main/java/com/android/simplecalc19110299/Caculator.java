package com.android.simplecalc19110299;

import android.util.Log;
import android.widget.Toast;

  class Calculator {


    public enum Operator {ADD, SUB, DIV, MUL,Exponential,Factorial,Logarit}


    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }


    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }


    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }


    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double Exponential(double firstOperand, double secondOperand) {

        return Math.pow(firstOperand, secondOperand);
    }

    public double Factorial(double firstOperand, double secondOperand) {
        double score=1;
        try
        {
            if(firstOperand<0)
            {
                return Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY;
            }
            for(double i=1;i<=firstOperand;i++)
            {
                score*=i;
            }
        }
        catch (NumberFormatException e)
        {
            Log.e("Factorial",e.getMessage());
        }

        return score;
    }

    public double Logarit(double firstOperand, double secondOperand) {
        return customLog(firstOperand,secondOperand);
    }
    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

}
