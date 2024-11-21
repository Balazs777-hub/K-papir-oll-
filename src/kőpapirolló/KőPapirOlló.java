package kőpapirolló;

import java.util.Random;
import java.util.Scanner;


public class KőPapirOlló {

    
    public static void main(String[] args) {
        
       /*Scanner sc = new Scanner(System.in);
        
        /*Kérdés amire várjuk a választ*/
        /*System.out.println("Egész: ");
        /*Eltároljuk a megfelelő tipusban*/
        /*int egesz = sc.nextInt();
        /*Bekérés eredményének felhasználása*/
        /*System.out.println("A bekért bekért szám duplája: " + egesz*2);
        
        System.out.println("Szöveg: ");
        String szoveg = sc.nextLine();
        System.out.println("A bekért szöveg" + szoveg);*/
        
        /* Müködő feladat */
        
        /*Scanner scanner = new Scanner(System.in);*/
        
        /*String[] options = {"Kő", "Papír", "Olló"};
        
        System.out.println("Válassz egyet: Kő, Papír, Olló");
        System.out.println("Választásod: ");
        String userChoice = scanner.nextLine();
        
        

        if (!isValidChoice(userChoice, options)) {
            System.out.println("Érvénytelen választás! Kérlek, válassz Kő, Papír vagy Olló.");
            return;
        }
        

        Random random = new Random();
        String computerChoice = options[random.nextInt(options.length)];
        

        System.out.println("Te választottál: " + userChoice);
        System.out.println("Az ellenfél választása: " + computerChoice);
        

        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
    }
    

    public static boolean isValidChoice(String choice, String[] options) {
        for (String option : options) {
            if (option.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }
    

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Döntetlen!";
        }
        
        if ((userChoice.equalsIgnoreCase("Kő") && computerChoice.equalsIgnoreCase("Olló")) ||
            (userChoice.equalsIgnoreCase("Papír") && computerChoice.equalsIgnoreCase("Kő")) ||
            (userChoice.equalsIgnoreCase("Olló") && computerChoice.equalsIgnoreCase("Papír"))) {
            return "Gratulálok, nyertél!";
        } else {
            return "Sajnos, vesztettél!";
        }*/
        
        /* Órai Munka */
        /*System.out.println("Mit választasz?");
        System.out.println("1: Kő");
        System.out.println("2: Papír");
        System.out.println("3: Olló");
        System.out.println("Választásod (1,2,3): ");
        int jatekos = scanner.nextInt();
        
        int gep = rnd.nextInt(3)+1;
        System.out.println("A gép választása: " + gep);
        
        String eredmeny = "Döntetlen!";
        if (jatekos != gep) {
            return "Döntetlen!";
        }
        
        System.out.println("Eredmény: ");*/
    
        /* Önnálló */
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Vállasz egyet: Kő/Papír/Olló ");
        String Jatekos = sc.nextLine();
        int RandomSzam = random.nextInt(3);
        
        String Gep;
        if (RandomSzam == 0) {
            Gep = "Kő";
        } else if (RandomSzam == 1) {
            Gep = "Papír";
        } else {
            Gep = "Olló";
        }
        
        System.out.println("A választásod: " + Jatekos);
        System.out.println("A gép ezt vállasztotta: " + Gep);
        
        if (Jatekos.equals(Gep)) {
            System.out.println("Döntetlen!");
        } else if (JatekosNyer(Jatekos, Gep)) {
            System.out.println("Nyertél!");
        } else {
            System.out.println("Vesztettél!");
        }
    }   

    static boolean JatekosNyer(String Jatekos, String Gep) {
        if (Jatekos.equals("Kő")) {
            return Gep.equals("Olló");
        } else if (Jatekos.equals("Papír")) {
            return Gep.equals("Kő");
        } else {
            return Gep.equals("Papír");
        }
    }



}
   


    

