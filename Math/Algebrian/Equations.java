package Java.SimpleCalc.Math.Algebrian;
import Java.SimpleCalc.Exception.MidEquationError;

public class Equations {
    public int[] secDegree(double a, double b, double c) throws MidEquationError{
        double asn, delta = (b*b)-(4*a*c);
        int[] x = new int[2];
        if(sqrt(delta) > 0){
            x[0] = (int)(((-1.0*b)+sqrt(delta))/2*a);
            x[1] = (int)(((-1.0*b)-sqrt(delta))/2*a);
        }
        else throw new MidEquationError("ERROR-Your delta do not have a exact square root");
        return x;
    }
    private double sqrt(double num){
        double root = 0.0, ans;
        do{
            root += 1;
            ans = root*root;

        }while(num > ans);
        if(num == ans){
            return root;
        }
        else{
            return 0;
        }
    }
}
