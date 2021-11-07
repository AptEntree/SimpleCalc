package Java.SimpleCalc;
import Java.SimpleCalc.Exception.MidEquationError;
import Java.SimpleCalc.Math.Algebrian.*;

public class Tester {
    public static void main(String[] args) {
        Equations eq = new Equations();
        try {
            int[] a = eq.secDegree(2.0,-3.0, -1.0);//falha
            System.out.println(a[0]);
            System.out.println(a[1]);
        } catch (MidEquationError e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] b = eq.secDegree(2.0,-3.0, 1.0);//funciona
            System.out.println(b[0]);
            System.out.println(b[1]);
        } catch (MidEquationError e) {
            System.out.println(e.getMessage());
        }
        
    }
}
