/*
* Author : dani
* Date : Jun. 16, 2021
* Description :
*/

package danielle_juin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhone {

	public static void main(String[] args) 
	{
		Scanner crayon = new Scanner(System.in);
		//System.out.println("Inscrire le numéro de télephone au format 123-456-7890");
		//System.out.println("Inscrire le numéro de télephone au format 123 456- 890"); // ou 123.456.7890
		//System.out.println("Inscrire le numéro de télephone au format (123)-456-7890"); // ou points ou est
		System.out.println("Inscrire le numéro de télephone au format (123)-456-7890 Ext 234" );// ou points
		String input = crayon.nextLine();
		verifPhone(input);
		crayon.close();
	}	
		private static void verifPhone(String tel)
		{
			//Pattern pattern=Pattern.compile("\\d{3}-\\d{3})--\\d{4}"); //format 316-332-3384
			//Pattern pattern=Pattern.compile("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}");
			//Pattern pattern=Pattern.compile("\\(\\d{3}\\)[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}");
			Pattern pattern=Pattern.compile("\\(\\d{3}\\)[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}\\s(X|Ext)\\s\\d{3,4}");
			Matcher matcher = pattern.matcher(tel);
			if(matcher.matches())
			System.out.println("Le numéro " + tel + "est valide");
			else
				System.out.println("Le numéro " + tel + "n'est pas valide" );
		}

}
