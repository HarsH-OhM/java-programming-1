package Assignment1;

class Calculator{
	
    interface add {
         public int  add(int a, int b);
    }

    interface difference {
         public int difference(int a, int b);
    }

    interface product {
         public int product(int a, int b);
    }

    interface safeDivision {
         public float safeDivision(float a, float b);
    }


    public static void main(String[] args) {

        Calculator.add obj1 = (a,b)-> (a+b);
        Calculator.difference obj2 = (a,b) -> (a-b);
        Calculator.product obj3 = (a,b)-> (a*b);
        Calculator.safeDivision obj4 = (a,b)->{
            try{
                if (b==0){
                	throw new ArithmeticException();
                	}else{
                		System.out.println(a/b);
                	}
            }catch (ArithmeticException e){
                System.out.println("Denominator can not be Zero");
            }
            return 0;
        };

        System.out.println(obj1.add(12,12));
        System.out.println(obj2.difference(10,5));
        System.out.println(obj3.product(40,10));
        obj4.safeDivision(10f,5f);

    }
}