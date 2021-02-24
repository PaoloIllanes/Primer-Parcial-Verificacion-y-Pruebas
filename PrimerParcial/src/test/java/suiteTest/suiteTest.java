package suiteTest;

import P3tEST.Ej3Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import p1test.PrimeTest;
import p2Test.Ej2Test;


    @RunWith(value =  Suite.class)
    @Suite.SuiteClasses(
            {
                    PrimeTest.class,
                    Ej2Test.class,
                   Ej3Test.class,

            }

    )
    public class suiteTest{
    }

