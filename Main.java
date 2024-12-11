
import java.util.Scanner;
public class Main {
    public static double Add(double a,double b){
        return a+b;
    }
public static double Sous(double a,double b){
        return a-b;
}
    public static double Mul(double a,double b){
        return a*b;
    }
    public static Double Div(double a,double b){
        if(b==0){
            System.out.printf("la division par 0 est invalide!! Réssayer!");
        return  null;
        }
            return a/b;
        }


    public static void main(String[] args) {
        double a , b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner le premier nombre : ");
        a = scanner.nextDouble();
        System.out.print("Donner le deuxieme nombre : ");
        b = scanner.nextDouble();
      //int result= function.add(a,b);
       // System.out.println(+ result);
        System.out.println("la somme est "+ Add(a,b));
        System.out.println("la difference est "+ Sous(a,b));
        System.out.println("le produit est "+ Mul(a,b));
        System.out.printf("la division est "+Div(a,b));

        
    }


}
