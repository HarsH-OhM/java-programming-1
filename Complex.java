package Assignment1;

public class Complex {

    int real;
    int imaginary;

    public Complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Cshow add(Cshow b){
        return new Cshow(this.real+b.real,this.imaginary+b.imaginary);
    }
    public Cshow subtract(Cshow b){
        return new Cshow(this.real-b.real,this.imaginary-b.imaginary);
    }
    public Cshow multiply(Cshow b){
        return new Cshow( this.real*b.real - this.imaginary*b.imaginary , this.imaginary*b.real + this.real*b.imaginary);
    }
    public String toString(){
        return String.format("Real > %d : Imaginary > %d",this.real,this.imaginary );
    }
}
public class Complex {

    Complex(){
        Cshow a = new Cshow(1,2);
        Cshow b = new Cshow(3,4);
        System.out.println((a.add(b)).toString());
        System.out.println((a.subtract(b)).toString());
        System.out.println((a.multiply(b).toString()));


    }

    public static void main(String[] args) {
        Cshow test = new Cshow();
    }
}