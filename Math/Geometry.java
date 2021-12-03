package SimpleCalc.Math;
/* Geometry calculations include:
 - perimeter
 - area (2d and 3d shapes)
 - volume
 - formulas
*/
import SimpleCalc.Exception.MidEquationError;
public class Geometry{
    
    static final float PI = 3.141592653589793F;
    static float result;

	//PERIMETER
	
    public static float perimeter(float p[]){
		// needed a new validator
        for(int i = 0; i < p.length; i++){
            result+=p[i];
        }

        return result;
    }
	
    public static float circlePerimeter(float r){
		validator(r);
        result = 2 * PI * r;
        return result;
    }
	
	// 2D AREA
	
	public static float rectanguleArea(float h, float b){
		validator(b, h);
		result = h * b;
		return result;
	}
	
	public static float circleArea(float r){
		validator(r);
		result = PI * (r * r);
		return result;
	}
	
	public static float equilateralTriangleArea(float s){
		validator(s);
		result = (float) (((s * s)* Math.sqrt(3))/4);
		return result;
	}
	
	public static float genericTriangle(float h, float b){
		validator(b, h);
		result = (b * h)/2;
		return result;
	}
	
	public static float trapezoidArea(float bigBase, float b, float h){
		validator(bigBase, h, b);
		result = ((bigBase * b)*h)/ 2;
		return result;
	}
	
	// 3D AREA
	
	public static float sphereArea(float r){
		validator(r);
		result = 4 * PI * (r * r);
		return result;
	}
	
	public static float prismArea(float baseArea, float sideArea, int totalNumberSides){
		validator(baseArea, sideArea, totalNumberSides);
		result = (2 * baseArea) + (totalNumberSides * sideArea);
		return result;
	}
	
	public static float cubeArea(float s){
		validator(s);
		result = (s * s) * 6;
		return result;
	}
	
	public static float cilinderArea(float r, float h){
		validator(r, h);
		result = 2 * PI * r *(r + h);
		return result;
	}
	
	public static float coneArea(float r, float h){
		validator(r, h);
		result = (PI * (r * r)) + (PI * r * pitagoras(h,r));
		return result;
	}
	
	// FORMULA
	
	public static float pitagoras(float a, float b){
		validator(a, b);
		result = (a * a) +  (b * b);
		return (float) Math.sqrt(result);
	}
	
	// VOLUME 
	
	public static float sphereVolume(float r){
		validator(r);
		result = (4 / 3) * PI * (r * r * r);
		return result;
	}
	
	public static float prismVolume(float baseArea, float h){
		validator(baseArea, h);
		result = baseArea * h;
		return result;
	}
	
	public static float cubeVolume(float s){
		validator(s);
		result = s * s * s;
		return result;
	}
	
	public static float cilinderVolume(float r, float h){
		validator(r, h);
		result = PI * (r * r) * h;
		return result;
	}
	
	public static float coneVolume(float r, float h){
		
		validator(r, h);
		result = (1 / 3) * (PI * (r * r)) * h;
		return result;
	}
	
	// MISC
	
	private void validate(float ... val){
		int validator = 0;
		for(int i = 0; i val.length; i++){
			if(val[i] != 0 && val[i] > 0){
				validator++;
			}
		}
		
		if(validator != val.length){
			throw new MidEquationError("ERROR-One of the numbers are invalid! Remember: Zero and negative numbers are not valid for geometry calculations");
		}
	}		
}