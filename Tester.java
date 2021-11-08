package SimpleCalc;
import SimpleCalc.Exception.MidEquationError;
import SimpleCalc.Math.Equations;

public class Tester {
    public static void main(String[] args) {
        try {
            int[] a = Equations.secDegree(2.0,-3.0, -1.0);//falha
            System.out.println(a[0]);
            System.out.println(a[1]);
        } catch (MidEquationError e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] b = Equations.secDegree(2.0,-3.0, 1.0);//funciona
            System.out.println(b[0]);
            System.out.println(b[1]);
        } catch (MidEquationError e) {
            System.out.println(e.getMessage());
        }
        
    }
}
