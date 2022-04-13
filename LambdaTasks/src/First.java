import java.util.Scanner;

interface Numbers{
    boolean bool(int a);
}

public class First {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Numbers numbers = (a) -> {
            if (a%13 == 0){
                return true;
            }
        };

        System.out.println(numbers.bool(n));
    }
}
