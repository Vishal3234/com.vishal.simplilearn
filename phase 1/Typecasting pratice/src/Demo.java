
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Implicit Type Casting");
    char a = '8';
    System.out.println("Value of char a:"+a);
    int b=a;
    System.out.println("Value of int b:"+b);
    float c=a;
    System.out.println("Value of float c:"+c);
    long d=a;
    System.out.println("Value of long d:"+d);
    double e=a;
    System.out.println("Value of double e:"+e);
    
    System.out.println("Explicit Type Casting");
    double x= 77.5;
    int y=(int)x;
    System.out.println("Value of x:"+x);
    System.out.println("Value of y:"+y);
    long u= 321;
    float k=(float)u;
    System.out.println("Value of u:"+ u);
    System.out.println("Value of k:"+k);
    
    
    
	}

}
