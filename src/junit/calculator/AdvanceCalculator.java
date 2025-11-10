package junit.calculator;

import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AdvanceCalculator {

    Calculator calc ;

    @BeforeAll
    void starting(){
        System.out.println("Program Starting.....");
    }

    @BeforeEach
    void started(){
        System.out.println("started....");
    }

    @Test
    @DisplayName("addition")
    void test(){
        calc = new Calculator();
        Assertions.assertEquals(30 , calc.add(10, 20));
    }

    @AfterEach
    void ending(){
        System.out.println("Its Ending...");
    }

    @AfterAll
    void ended(){
        System.out.println("Ended...");
    }
}
