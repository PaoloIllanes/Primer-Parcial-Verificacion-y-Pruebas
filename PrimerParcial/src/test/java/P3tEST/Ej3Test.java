package P3tEST;

import org.junit.*;
import p1.Ej1UtilsNumeros;
import p3.Ej3Utils;

public class Ej3Test {

    /*Se tiene un metodo que valida si un CI es correcto o incorrecto

    si este es correcto el valor retornado : true
    si este es incorrecto el valor retornado : false

    si el valor es vacio lanza una excepcion, si el valor no es numerico lanza otra excepcion, si el valor es 0 lanza una exception

● 5% unit test utilizando: expected (2 test) and timeout (1 test)*/

    Ej3Utils validate;

    @Before
    public void before(){
        validate = new Ej3Utils();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void nullvalue(){
        boolean actualResult= validate.isCorrectCI(null);
        boolean expectedResult= Exception();
        Assert.assertEquals("Es un numero primo",expectedResult,actualResult);

    }

    @org.junit.Test
    public void validoe(){
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
//No se genera el archivo de report en el build por errores en esta clase
}
