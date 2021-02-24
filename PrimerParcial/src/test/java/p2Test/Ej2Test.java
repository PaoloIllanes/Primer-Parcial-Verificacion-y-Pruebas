package p2Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import p2.Ej2Notas;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class Ej2Test {
    private int notaFinal;
    private String expectedResult;
    public Ej2Test(int notaFinal,String expectedResult){
        this.notaFinal =notaFinal;
        this.expectedResult = expectedResult;

    }

             /* Se tiene un metodo para calcular la nota cualitativa en base a la nota cuantitativa evaluada en 10
            si la nota esta entre 0 y 5 el mensaje es "F"
            si la nota esta entre 5 y 7 el mensaje es "C"
            si la nota esta entre 7 y 9 el mensaje es "B"
            si la nota esta entre 9 y 10 el mensaje es "A"
            si esta fuera de rango : "VALOR INCORRECTO"*/

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects= new ArrayList<>();
        objects.add(new Object[]{1,"F"});
        objects.add(new Object[]{6,"C"});
        objects.add(new Object[]{8,"B"});
        objects.add(new Object[]{10,"A"});
        objects.add(new Object[]{0,"VALOR INCORRECTO"});
        objects.add(new Object[]{11,"VALOR INCORRECTO"});
        objects.add(new Object[]{5,"F"});
        objects.add(new Object[]{7,"C"});
        objects.add(new Object[]{9,"B"});
        objects.add(new Object[]{10,"A"});
        return objects;
    }
    @Test
    public void verify_nota_final(){
        Ej2Notas cal= new Ej2Notas();
        String actualResult= cal.notasCualitativas(this.notaFinal);
        Assert.assertEquals("ERROR",this.expectedResult,actualResult);
    }
}
