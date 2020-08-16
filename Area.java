package Assignment1;

import java.util.Scanner;

class Triangle{
	
    public float getArea(float a, float b, float c){
    	
        float s = (a+b+c)/2f;

        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return (float)area;
    }
}
public class Area {

    public static void main(String[] args) {
        
          Triangle obj = new Triangle();
        Scanner sc = new Scanner(System.in);
        float  a = sc.nextFloat();
        float b =  sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println(obj.getArea(a,b,c));
    
    }

}