package week1;

public class W1Ex3 {

	public static void main(String[] args) {
        System.out.println("<<<<<Example W2EX2>>>>>");
        int a= 40, c, b=6;
        double x= 40.0, y=6.0, z;
//        int u = (int)( x * 10) ; // 40.7310 * 10 = 407.310 ==> 407
//        System.out.println("Without Math.round, u= " + u);
//        u = (int) Math.round(x);
//        System.out.println("Using Math.round, u= " +u);
        c = a / b;System.out.println("c = a / b , c =  " + c);
        c = b /a;System.out.println("c = b / a , c =  " + c);
        z = x / y;System.out.println("z = x / y, z =  " + z);
        z = y/x;System.out.println("z = y / x, z = " + z);
        c = b % a; System.out.println("c = b % a, c =   " + c);
        c = a % b;System.out.println("c = a % b, c =  " + c);

	}

}
