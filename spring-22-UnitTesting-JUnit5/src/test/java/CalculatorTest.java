import org.junit.jupiter.api.*;

import java.nio.file.AccessDeniedException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println("BeforeALL is executed");
    }

    @AfterAll
    static void teardownAll(){
        System.out.println("AfterAll is executed");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("BeforeEach is executed");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("AfterEach is executed");

    }


    @Test
    void add() {
        System.out.println("Add method");
        int actual = Calculator.add(2,3);
        assertEquals(4,actual,"Test failed");
    }


    @Test
    void add2(){
        System.out.println("Add2 method");
       // assertThrows(IllegalAccessException.class,()-> Calculator.add(1,2));
        assertThrows(IllegalArgumentException.class,()-> Calculator.add(2,3));
     //   assertThrows(AccessDeniedException.class, ()->Calculator.add(3,2));
    }

    @Test
    void testCase1(){
       // System.out.println("Test case 1");
        fail("Not yet implemented");
    }

    @Test
    void testCase2(){
        System.out.println("Test case 2");
        assertEquals("add", Calculator.operator);
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase3(){
        System.out.println("Test case 3");
        assertArrayEquals(new int[]{1,2,3},new int[]{1,3,3},"Arrays are not same");
    }

    @Test
    void testCase4(){
        System.out.println("Test case 4");

        String nullString =null;
        String notNullString = "Cydeo";

        assertNull(nullString);
        assertNotNull(notNullString);
    }

    @Test
    void testCase5(){
        System.out.println("Test case 5");

        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();


        assertSame(c1,c2);
        assertNotSame(c1,c3);

    }
}

