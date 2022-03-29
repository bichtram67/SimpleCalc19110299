package com.android.simplecalc19110299;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import androidx.test.filters.SmallTest;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    //Add: 5 items
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }
    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        //assertThat(resultAdd, is(closeTo(2.222, 0.01)));
        assertEquals(resultAdd, 2.221, 0.01);

    }
    @Test
    public void addTwoNumbersInts() {
        double resultAdd = mCalculator.add(1, 0.5d);
        //assertThat(resultAdd, is(closeTo(2.222, 0.01)));
        assertThat(resultAdd, is(equalTo(1.5d)));

    }
    @Test
    public void addTwoNumbersZero() {
        double resultAdd = mCalculator.add(0d, 0d);
        assertThat(resultAdd, is(equalTo(0d)));
    }

    //Sub : 6 items
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }
    @Test
    public void subWorksWithZero() {
        double resultSub = mCalculator.sub(0, 0);
        assertThat(resultSub, is(equalTo(0.0)));
    }
    @Test
    public void subWorksBetweenNegativeAndPositiveResult() {
        double resultSub = mCalculator.sub(5d, -17d);
        assertThat(resultSub, is(equalTo(22d)));
    }
    @Test
    public void subWorksWithFloat() {
        double resultSub = mCalculator.sub(5d, 0.5f);
        assertThat(resultSub, is(equalTo(4.5d)));
    }
    @Test
    public void subWorksWithNegativeFloat() {
        double resultSub = mCalculator.sub(1d, 2.5f);
        assertThat(resultSub, is(equalTo(-1.5d)));
    }
    //Mul : 6 items
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }
    @Test
    public void mulTwoNumbersZero() {
        double resultMul = mCalculator.mul(32d, 0);
        double ktra=0;
        assertThat(resultMul, is(equalTo(ktra )));
    }
    @Test
    public void mulTwoNumbersWithNegative() {
        double resultMul = mCalculator.mul(-10d,-10d);

        assertThat(resultMul, is(equalTo(100.0 )));
    }
    @Test
    public void mulTwoNumbersBetweenNegativeAndPositiveResult() {
        double resultMul = mCalculator.mul(10d,-10d);

        assertThat(resultMul, is(equalTo(-100.0 )));
    }
    @Test
    public void mulTwoNumbersFloats() {
        double resultMul = mCalculator.mul(0.5f,0.5f);
        assertThat(resultMul, is(equalTo(0.25 )));
    }
    @Test
    public void mulTwoNumbersNegativeFloats() {
        double resultMul = mCalculator.mul(0.5f,-0.5f);
        assertThat(resultMul, is(equalTo(-0.25 )));
    }
    //div : 7 items
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void divTwoNumbersNegative() {
        double resultDiv = mCalculator.div(32d,-2d);
        assertThat(resultDiv, is(equalTo(-16d)));
    }
    @Test
    public void divFloatResults() {
        double resultDiv = mCalculator.div(32d,3d);
        //assertThat(resultDiv, is(equalTo(10.66d)));
        assertEquals(resultDiv, 10.66, 0.01);
    }
    @Test
    public void divOneNumbersNegativeFloatResults() {
        double resultDiv = mCalculator.div(20d,-7d);
        //assertThat(resultDiv, is(equalTo(10.66d)));
        assertEquals(resultDiv, -2.855, 0.01);
    }
    @Test
    public void divOneNumbersFloat() {
        double resultDiv = mCalculator.div(20d,0.5d);
        //assertThat(resultDiv, is(equalTo(10.66d)));
        assertThat(resultDiv, is(equalTo(40d)));

    }
    @Test
    public void divTwoNumbersNegativeFloat() {
        double resultDiv = mCalculator.div(20d,-0.5d);
        //assertThat(resultDiv, is(equalTo(10.66d)));
        assertThat(resultDiv, is(equalTo(-40d)));
    }
    //Exponential : 11 items
    @Test
    public void ExponentialTwoNumbers() {
        double resultEx = mCalculator.Exponential(2d,3d);
        assertThat(resultEx, is(equalTo(8d)));
    }
    @Test
    public void ExponentialWithFloatNumber() {
        double resultEx = mCalculator.Exponential(2d,0.3f);
        assertEquals(resultEx, 1.23d, 0.01);

    }
    @Test
    public void ExponentialOneNumbersZero_1() {
        double resultEx = mCalculator.Exponential(2d,0);
        assertThat(resultEx, is(equalTo(1d)));
    }
    @Test
    public void ExponentialOneNumbersZero_2() {
        double resultEx = mCalculator.Exponential(0,2d);
        assertThat(resultEx, is(equalTo(0d)));
    }
    @Test
    public void ExponentialNegativeNumber() {
        double resultEx = mCalculator.Exponential(2,-2d);
        assertThat(resultEx, is(equalTo(0.25d)));
    }
    @Test
    public void ExponentialFloatNumber() {
        double resultEx = mCalculator.Exponential(0.2f,2d);
        assertEquals(resultEx, 0.04, 0.01);
    }
    @Test
    public void ExponentialNegativeFloatNumber() {
        double resultEx = mCalculator.Exponential(-0.2f,2d);
        assertEquals(resultEx, 0.04d, 0.01);
        //assertThat(resultEx, is(equalTo(0.04d)));

    }
    @Test
    public void ExponentialNegativeFloatNumber_2() {
        double resultEx = mCalculator.Exponential(0.2f,-2d);
        assertEquals(resultEx, 25d, 0.01);
    }
    @Test
    public void ExponentialFloatTwoNumbers() {
        double resultEx = mCalculator.Exponential(0.2f,0.5f);
        assertEquals(resultEx, 0.44d, 0.01);
    }
    @Test
    public void ExponentialNegativeFloatTwoNumbers_1() {
        double resultEx = mCalculator.Exponential(-0.2f,0.5f);
        assertThat(resultEx, is(equalTo(Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY)));

    }
    @Test
    public void ExponentialNegativeFloatTwoNumbers_2() {
        double resultEx = mCalculator.Exponential(0.2f,-0.5f);
        assertEquals(resultEx, 2.23d, 0.01);

    }
    //Factorial : 5items
    @Test
    public void FactorialOneNumber() {
        double resultFac = mCalculator.Factorial(0d,0);
        assertThat(resultFac, is(equalTo(1d)));
    }
    @Test
    public void FactorialNumber() {
        double resultFac = mCalculator.Factorial(5d,0);
        assertThat(resultFac, is(equalTo(120d)));
    }
    @Test
    public void FactorialNegativeNumber() {
        double resultFac = mCalculator.Factorial(-5d,0);
        //assertThat(resultFac, is(equalTo(-120d)));
        assertThat(resultFac, is(equalTo(Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY)));
    }
    @Test
    public void FactorialTwoNumbers() {
        double resultFac = mCalculator.Factorial(5d,5d);
        assertThat(resultFac, is(equalTo(120d)));

    }
    @Test
    public void FactorialNegativeTwoNumbers() {
        double resultFac = mCalculator.Factorial(-5d,5d);
        assertThat(resultFac, is(equalTo(Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY)));
    }
    //Logarit : 7items
    @Test
    public void LogaritTwoNumbersWithInfinityResults() {
        double resultLoga = mCalculator.Logarit(1d,2d);
        assertThat(resultLoga, is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void LogaritTwoNumbersWithNegativeValue() {
        double resultLoga = mCalculator.Logarit(2d,-2d);
        assertThat(resultLoga, is(equalTo(Double.POSITIVE_INFINITY-Double.POSITIVE_INFINITY)));
    }
    @Test
    public void LogaritWithSameTwoNumbers() {
        double resultLoga = mCalculator.Logarit(2d,2d);
        assertThat(resultLoga, is(equalTo(1d)));
    }
    @Test
    public void LogaritWithTwoNumbers() {
        double resultLoga = mCalculator.Logarit(2d,5d);
        assertEquals(resultLoga, 2.32d, 0.01);

    }
    @Test
    public void LogaritWithFloatBase() {
        double resultLoga = mCalculator.Logarit(0.5f,5d);
        assertEquals(resultLoga, -2.32d, 0.01);

    }
    @Test
    public void LogaritWithFloatValue() {
        double resultLoga = mCalculator.Logarit(5d,0.5f);
        assertEquals(resultLoga, -0.43d, 0.01);

    }
    @Test
    public void LogaritWithTwoFloatNumbers() {
        double resultLoga = mCalculator.Logarit(0.2f,0.85f);
        assertEquals(resultLoga, 0.100d, 0.01);

    }
}