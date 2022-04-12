import java.util.Scanner;

interface Count{
    double Discriminant(double a, double b, double c);
}

public class Second {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        double a1 = in.nextDouble();
        double b2 = in.nextDouble();
        double c3 = in.nextDouble();


        Count count = (a, b, c) ->{
            double d = 0.0;
                d = b*b - 4*a*c;
                if (d<0){
                    System.out.println("Дискреминант меньше нуля");
                }
                return d;
        };

        System.out.println(count.Discriminant(a1 , b2, c3));
    }
}
