/*
* Author : dani
* Date : Jun. 16, 2021
* Description : Introduction sur les expressions régulières
* 				étapes / structure
*/

package danielle_juin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedExp1 {

	public static void main(String[] args) 
	{
		Scanner crayon=new Scanner(System.in);
		
			//imput est le texte dans lequel l'expression sera recherchée
			System.out.println("Inscrire le texte pour la recherche");
			String  imput = crayon.nextLine();
			//Expression à rechercher
			System.out.println("Imscrire le texte recherché");
			String regEx = crayon.nextLine();
			
			//Étape 1: Utiliser Pattern
			Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
			
			//Étape 2: Allouer un objet Matcher pour l'entrée spécifié
			Matcher matcher = pattern.matcher(imput);
			
			//Étape 3: Vérifier la concordance et afficher le résultat
			
			//==================================================
			
			// on peut utiliser find()
			/*
			 * while (matcher.find()) { System.out.println("Le(s) mot(s) \"" +
			 * matcher.group() + "\" débute à l'indice "+ matcher.start() +
			 * "et finit à l'indice" + matcher.end()); }
			 */
			
			//==================================================
			// utiliser matcher() ; Doit correspondre entièrement à tout le texte
			/*
			 * if (matcher.matches()) {
			 * System.out.println("Les deux textes sont les memes"); } else {
			 * System.out.println("les deux textes sont différents"); }
			 */
			//==================================================
			// Utiliser lookingAt()
			
			  if (matcher.lookingAt()) 
			  {
				  System.out.println("On a trouvé \"" +
			  matcher.group() + "\" commencant à l'indice " + matcher.start() +
			  " et finit à l'indice " + matcher.end());
			  }
			  else 
			  {
			  System.out.println("Le texte ne se trouve pas au début"); 
			  }
			 
			//==================================================
	}

}
