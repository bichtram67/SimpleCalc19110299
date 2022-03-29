package com.android.simplecalc19110299;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 class MainActivity extends AppCompatActivity {

    private static final String TAG = "CalculatorActivity";

    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the calculator class and all the views
        mCalculator = new Calculator();
        mResultTextView = findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = findViewById(R.id.operand_one);
        mOperandTwoEditText = findViewById(R.id.operand_two);
    }

    /**
     * OnClick method called when the add Button is pressed.
     */
    public void onAdd(View view) {

        compute(Calculator.Operator.ADD);
    }

    /**
     * OnClick method called when the subtract Button is pressed.
     */
    public void onSub(View view) {
        compute(Calculator.Operator.SUB);
    }

    /**
     * OnClick method called when the divide Button is pressed.
     */
    public void onDiv(View view) {
        try {
            compute(Calculator.Operator.DIV);
        } catch (IllegalArgumentException iae) {
            Log.e(TAG, "IllegalArgumentException", iae);
            mResultTextView.setText(getString(R.string.computationError));
        }
    }

    /**
     * OnClick method called when the multiply Button is pressed.
     */
    public void onMul(View view) {
        compute(Calculator.Operator.MUL);
    }

    public void onExponential(View view) {

        compute(Calculator.Operator.Exponential);
    }
    public void onFactorial(View view) {

        compute(Calculator.Operator.Factorial);
    }
    public void onLogarit(View view) {
        compute(Calculator.Operator.Logarit);
    }
    private void compute(Calculator.Operator operator) {
        double operandOne;
        double operandTwo = 0;
        try {
            operandOne = getOperand(mOperandOneEditText);
            if(operator!= Calculator.Operator.Factorial)
            {
                operandTwo = getOperand(mOperandTwoEditText);
            }

        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NumberFormatException", nfe);
            mResultTextView.setText(getString(R.string.computationError));
            return;
        }

        String result;
        switch (operator) {
            case ADD:
                result = String.valueOf(
                        mCalculator.add(operandOne, operandTwo));
                break;
            case SUB:
                result = String.valueOf(
                        mCalculator.sub(operandOne, operandTwo));
                break;
            case DIV:
                result = String.valueOf(
                        mCalculator.div(operandOne, operandTwo));
                break;
            case MUL:
                result = String.valueOf(
                        mCalculator.mul(operandOne, operandTwo));
                break;
            case Exponential:
                result = String.valueOf(
                        mCalculator.Exponential(operandOne, operandTwo));
                break;
            case Factorial:
                result = String.valueOf(
                        mCalculator.Factorial(operandOne, operandTwo));
                break;
            case Logarit:
                result = String.valueOf(
                        mCalculator.Logarit(operandOne, operandTwo));
                break;
            default:
                result = getString(R.string.computationError);
                break;
        }
        mResultTextView.setText(result);
    }

    /**
     * @return the operand value entered in an EditText as double.
     */
    private static Double getOperand(EditText operandEditText) {
        String operandText = getOperandText(operandEditText);
        return Double.valueOf(operandText);
    }

    /**
     * @return the operand text which was entered in an EditText.
     */
    private static String getOperandText(EditText operandEditText) {
        return operandEditText.getText().toString();
    }
}
