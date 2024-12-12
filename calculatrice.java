import java.util.Scanner;
public class calculatrice { // CLASS
    public static Double Add(double a, double b) {
        return a + b;
    }
    public static Double Soustraction(double a, double b) {
        return a - b;
    }
    public static Double Multiplication(double a, double b) {
        return a * b;
    }
    public static Double Division(double a, double b) {
        if ( b==0 ){
            System.err.println(" Erreur ");
            return null;
        }
        return  a / b;
    }
    public static double puissance(double a,double b){
        return Math.pow(a,b);
    }
    public static double Racine(double a){
        if (a < 0) {
            System.err.println("valeur invalide !");
        }
        return Math.sqrt(a);
    }
    public static double factorielle(double a){
        if (a < 0) {
            throw new IllegalArgumentException("La factorielle d'un nombre négatif n'est pas définie !");
        }
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] agrs){// MAIN
        double a = 0,b = 0;
        Scanner A = new Scanner(System.in);// POUR SCANNER TOUTS LES VALEUR DE MENI
        while (true) {
            System.out.println("-_-_-_-_-_MENU_-_-_-_-_-_-");

            System.out.println("1.Addition");
            System.out.println("2.Soustraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Puissance");
            System.out.println("6.Racine carree");
            System.out.println("7.Factorielle");
            System.out.println("8.Quitter");
            System.out.printf("Choisir un nombre de 1 à 8: ");
            int choix = A.nextInt();
            if (choix>= 1 && choix <=5){
                System.out.print("Entre A : ");
                a =A.nextDouble();
                System.out.print("Entre B : ");
                b = A.nextDouble();}
            else if (choix == 6){
                System.out.print("Entre A : ");
                a = A.nextDouble();
            } else if (choix == 7) {
                System.out.print("Entre un nombre : ");
                a = A.nextDouble();
            }
            if (choix == 8) {
                System.out.println("Au Revoir");
                break;
            }

            switch (choix) {
                case 1:
                    System.out.println("la somme est : "+Add(a,b));
                    break;
                case 2:
                    System.out.println("la soustraction est : "+Soustraction(a,b));
                    break;
                case 3:
                    System.out.println("la Multiplication est : "+Multiplication(a,b));
                    break;
                case 4:
                    System.out.println("la Division est : "+Division(a,b));
                    break;
                case 5:
                    System.out.println("la puissance est : "+puissance (a ,b));
                    break;
                case 6:
                    System.out.println("la racine est : "+Racine(a));
                    break;
                case 7:
                    System.out.println("le factorielle est : "+factorielle(a));
                    break;
                default:
                    System.out.println("Erreur entrez un numero entre 1 et 8");
            }
        }}}