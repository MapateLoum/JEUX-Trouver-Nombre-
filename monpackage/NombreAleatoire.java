package monpackage;
import java.util.Random;
import java.util.Scanner;
public class NombreAleatoire
{


 public static int nombreAleatoire()
 {
 	Random random =new Random();
 	return random.nextInt(100) +1;	
 }



 public static void rechercheNombre()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("\tBienvenue dans notre jeux. ");
		
		int nombre=nombreAleatoire();
		int entierSaisi;

        do {
            System.out.print("Veuillez saisir un entier entre 0 et 100 : ");

            while (!scanner.hasNextInt()) 
            {
                System.out.print("Erreur ! Veuillez saisir un entier valide : ");
                scanner.next(); 
            }

            entierSaisi = scanner.nextInt();

            if (entierSaisi < 0 || entierSaisi > 100) 
            {
                System.out.print("Erreur ! ");
            }

        } while (entierSaisi < 0 || entierSaisi > 100);

        int i=1;
       do
        {

            if (entierSaisi>nombre) 
            {
            System.out.print("Veuiller essayer encore mais avec un nombre plus petit : ");
             while (!scanner.hasNextInt()) 
            {
                System.out.print("Erreur ! Veuillez saisir un entier valide et plus petit que le précédent : ");
                scanner.next(); 
            }
            entierSaisi=scanner.nextInt();
            }


            else if (entierSaisi<nombre)
            {
             System.out.print("Veuiller essayer encore mais avec un nombre plus grand : ");
              while (!scanner.hasNextInt()) 
            {
                System.out.print("Erreur ! Veuillez saisir un entier valide et plus grand que le précédent : ");
                scanner.next(); 
            }
            entierSaisi=scanner.nextInt();   
            }


            System.out.println("Attention !! Il vous reste "+(10-i)+" tenative");


            if(entierSaisi==nombre)
            {
            System.out.println("Félicitations. Vous avez réussi à trouver le bon nombre qui etait "+nombre+" et il vous restait "+(10-i)+" tentatives.");    
            }
            else if (i==10) 
            {
            System.out.println("Dommage. Vous n'avez pas trouvé le nombre . Réessayer plus tard.");
            
            }
        i++;
        }
         while (entierSaisi!=nombre && i<=10);
        scanner.close();
	}

 }