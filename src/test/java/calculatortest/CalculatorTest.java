package calculatortest;

import com.ch3.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setup(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void addTest(){
        Assertions.assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void subtractTest(){
        Assertions.assertEquals(3, cal.add(6, 3));
        System.out.println("CalculatorTest.subtractTest");
    }

    @Test
    public void multiplyTest(){
        Assertions.assertEquals(18, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void divideTest(){
        Assertions.assertEquals(2, cal.add(6, 3));
        System.out.println("add");
    }

    @AfterEach
    public void teardown(){
        System.out.println("CalcultorTest.teardown");
    }
}
