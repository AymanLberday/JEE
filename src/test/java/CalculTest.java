import metier.Calcul;
import org.junit.Test;
import org.testng.Assert;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=5,b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }

    private double somme(double a, double b) {
        return a+b;
    }
}


