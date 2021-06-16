/*
* Author : dani
* Date : Jun. 11, 2021
* Description :
*/

package danielle_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class monFichier {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		int c; 
		
		ficALire = new FileReader("monFichier,txt.txt");
		entree = new BufferedReader(ficALire);
		c=entree.read();
	}

}
