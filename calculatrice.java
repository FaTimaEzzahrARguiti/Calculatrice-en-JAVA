import java.util.Scanner;
public class calculatrice { // CLASS
    public static Double Add(double x, double y) {return x + y;}
    public static Double Soustraction(double x, double y) {return x - y;}
    public static Double Multiplication(double x, double y) {return x * y;}
    public static Double Division(double x, double y) {
        if ( y==0 ){
            System.err.println(" Erreur ");
            return null;
        }
        return  x / y;}
    public static double puissance(double x,double y){return Math.pow(x,y);}

    public static void main(String[] agrs){// MAIN
        double x = 0,y = 0;
        Scanner A = new Scanner(System.in);// POUR SCANNER TOUTS LES VALEUR DE MENI
        while (true) {
            System.out.println("-CALCULATRICE-");
            System.out.println("1.Addition (+)");
            System.out.println("2.Soustraction (-)");
            System.out.println("3.Multiplication (*)");
            System.out.println("4.Division (/)");
            System.out.println("5.Puissance");
            System.out.println("6.Racine carrÃ©e");
            System.out.println("7.Factorielle");
            System.out.println("8.Quitter");
            System.out.print("Choisissez une actions (1-8): ");
            int choix = A.nextInt();
            if (choix>= 1 && choix <=5){
                System.out.print("Entre 1ere Nbr : ");
                x =A.nextDouble();
                System.out.print("Entre 2eme Nbr : ");
                y = A.nextDouble();}
            else if (choix == 6){
                System.out.print("Entre un Nbr : ");
                x = A.nextDouble();
            } else if (choix == 7) {
                System.out.print("Entre un Nbr : ");
                x = A.nextDouble();
            }
            if (choix == 8) {
                System.out.println("byy");
                break;
            }

            switch (choix) {
                case 1:
                    System.out.println("la somme est : "+Add(x,y));
                    break;
                case 2:
                    System.out.println("la soustraction est : "+Soustraction(x,y));
                    break;
                case 3:
                    System.out.println("la Multiplication est : "+Multiplication(x,y));
                    break;
                case 4:
                    System.out.println("la Division est : "+Division(x,y));
                    break;
                case 5:
                    System.out.println("la puissance est : "+puissance (x ,y));
                    break;
                case 6:
                    System.out.println("la soustraction est : "+Soustraction(x,y));
                    break;
                case 7:
                    System.out.println("la soustraction est : "+Soustraction(x,y));
                    break;
                default:
                    System.out.println("Erreur entrez un numero entre 1 et 8");
            }
        }}}