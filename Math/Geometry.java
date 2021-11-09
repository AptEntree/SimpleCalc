package SimpleCalc.Math;

/* Geometry calculations include:
 - perimeter
 - area (2d and 3d shapes)
 - volume
 - formulas
*/

import java.util.Math;
public class Geometry{
    
    final float PI = 3.141592653589793;
    float result;

	//PERIMETER
	
    public static float perimeter(float p[]){

        for(int i = 0; i < p.length; i++){
            result+=p[i];
        }

        return result;
    }
	
    public static float circlePerimeter(float r){

        result = 2 * PI * r;
        return result;
    }
	
	// 2D AREA
	
	public static float rectanguleArea(float h, float b){
		
		result = h * b;
		return result;
	}
	
	public static float circleArea(float r){
		
		result = PI * (r * r);
		return result;
	}
	
	public static float equilateralTriangleArea(float s){
		
		result = ((s * s)* Math.sqrt(3))/4;
		return result;
	}
	
	public static float genericTriangle(float h, float b){
		
		result = (b * h)/2;
		return result;
	}
	
	public static float trapezoidArea(float bigBase, float b, float h){
		
		result = ((bigBase * b)*h)/ 2;
		return result;
	}
	
	// 3D AREA
	
	public static float sphereArea(float r){
		
		result = 4 * PI * (r * r);
		return result;
	}
	
	public static float prismArea(float baseArea, float sideArea, int totalNumberSides){
		
		result = (2 * baseArea) + (totalNumberSides * sideArea);
		return result;
	}
	
	public static float cubeArea(float s){
		
		result = (s * s) * 6;
		return result;
	}
	
	public static float cilinderArea(float r, float h){
		
		result = 2 * PI * r (r + h);
		return result;
	}
	
	public static float coneArea(float r, float h){
		
		result = (PI * (r * r)) + (PI * r * pitagoras(h,r));
		return result;
	}
	
	// FORMULA
	
	public static float pitagoras(float a, float b){
		
		result = (a * a) +  (b * b);
		return Math.sqrt(result);
	}
	
	// VOLUME 
	
	public static float sphereVolume(float r){
		
		result = (4 / 3) * PI * (r * r * r);
		return result;
	}
	
	public static float prismVolume(float baseArea, float h){
		
		result = baseArea * h;
		return result;
	}
	
	public static float cubeVolume(float s){
		
		result = s * s * s;
		return result;
	}
	
	public static float cilinderVolume(float r, float h){
		
		result = PI * (r * r) * h;
		return result;
	}
	
	public static float coneVolume(float r, float h){
		
		result = (1 / 3) * (PI * (r * r)) * h;
		return result;
	}
}