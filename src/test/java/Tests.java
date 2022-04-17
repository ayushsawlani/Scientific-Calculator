import org.junit.jupiter.api.Test;
import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;


class Tests {
    //object
    Calculator c = new Calculator();

    @Test
    void factorial() {

        int actual = Calculator.fac(5);
        assertEquals(120, actual);

        int actual2 = Calculator.fac(0);
        assertEquals(1, actual2);

        int actual3 = Calculator.fac(1);
        assertEquals(1,actual3);


    }

    @Test
    void power() {
        double actual = Calculator.power(2.0,3.0);
        assertEquals(8.0, actual);

        double actual2 = Calculator.power(-1.0,-1.0);
        assertEquals(-1.0, actual2);

        double actual3 = Calculator.power(2.3,4.5);
        assertEquals(42.43998894277659, actual3);
    }

    @Test
    void sq_root() {
        double actual = Calculator.square_root(2.4);
        assertEquals(1.5491933384829668, actual);

        double actual1 = Calculator.square_root(4.0);
        assertEquals(2, actual1);

        double actual2 = Calculator.square_root(0.0);
        assertEquals(0.0, actual2);


    }

    @Test
    void log() {
        double actual = Calculator.nat_log(1.0);
        assertEquals(0, actual);

    }






}