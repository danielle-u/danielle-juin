/*
* Author : dani
* Date : Jun. 17, 2021
* Description :
*/

package danielle_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class monCalcul {

	public static void main(String[] args) throws IOException, FileNotFoundException 
	{
		
		FileReader ficALire;
		BufferedReader entree;
		
		ficALire=new FileReader("monCalcul.txt");
		entree=new BufferedReader(ficALire);
		entree.close();
		
		
		String Fichier="monResultat.txt";
		final int s1=230;
		final int s2=429;
		final int s3=457;
		final int s4=300;
		
		FileWriter ficAEcrire;
		PrintWriter sortie = null;
		try
		{
			ficAEcrire=new FileWriter(Fichier);
			sortie=new PrintWriter(ficAEcrire);
			sortie.print(s1+s2+s3+s4);
			sortie.close();
		}
		
		catch(IOException ioe)
		{
			System.out.println("Erreur entrée/sortie");
		}

	}

}
