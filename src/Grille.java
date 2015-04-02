/**
 * 
 * @author amilhaum
 * grille de jeu
 */
public class Grille 
{
	public final static int NOMBRE_DE_COLONNES=7;
	public final static int NOMBRE_DE_LIGNES=7;
	
	public final int colones;
	public final int lignes;
	public char [][] plateau;

	
	
	public int obtenirNbColonne ()
	{
		return this.colones;
	}
	
	public int obtenirNbLigne()
	{
		return this.lignes;
	}
	
	
}
