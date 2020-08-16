package Assignment1;

import java.util.Scanner;

class Rectangle{
    int height, width;
   
    public void display(){
        System.out.println(height +" "+ width);
    }

}
public class RectangleArea extends Rectangle{

  


    public void read_input(){
    	
    	Scanner sc= new Scanner(System.in);
        height = sc.nextInt();
        width = sc.nextInt();
    }
    
    public void display(){
    	
        System.out.println(height*width);
    }

    public static void main(String[] args) {
        RectangleArea obj = new RectangleArea();
        obj.read_input();
        System.out.println(obj.height + " "+ obj.width);
        obj.display();
    }
}