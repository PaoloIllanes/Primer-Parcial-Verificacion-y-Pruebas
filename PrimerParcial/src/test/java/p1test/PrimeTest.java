package p1test;

import org.junit.*;
import p1.Ej1UtilsNumeros;

public class PrimeTest {
    Ej1UtilsNumeros prime;

    @BeforeClass
    public void beforeClass(){
        System.out.print("Before class logic");
    }

    @AfterClass
    public void afterClass(){
        System.out.print("After class logic");
    }

    @After
    public void after(){
        System.out.print("Despues de cada test");
    }

    @Before
    public void before(){
        prime = new Ej1UtilsNumeros();
    }

    @org.junit.Test
    public void isPrime(){
        boolean actualResult= prime.esPrimo(5);
        boolean expectedResult= true;
        Assert.assertEquals("Es un numero primo",expectedResult,actualResult);

    }

    @org.junit.Test
    public void isNotPrime(){
        boolean actualResult= prime.esPrimo(4);
        boolean expectedResult= false;
        Assert.assertEquals("No es un numero primo",expectedResult,actualResult);

    }

    @org.junit.Test
    public void novalido(){
        boolean actualResult= prime.esPrimo(-1);
        boolean expectedResult= false;
        Assert.assertEquals("ingrese un dato valido",expectedResult,actualResult);

    }
}
