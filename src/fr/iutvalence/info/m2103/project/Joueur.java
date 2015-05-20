package fr.iutvalence.info.m2103.project;

public class Joueur 
{
	public String name;
	public int numJoueur;
	public static DiscColor couleurJoueur;
	

	public Joueur(String name, int numJoueur, DiscColor couleurJoueur)
	{
		this.name=name;
		this.numJoueur=numJoueur;
	}
	
	/**
	 * Associate a disc's color to a player
	 * @param numJoueur
	 * @param couleurJoueur
	 */
	
	public void associateAColor(int numJoueur ,DiscColor couleurJoueur)
	{
		if(numJoueur==1)
		{
			Joueur.couleurJoueur=DiscColor.RED_DISC;
		}
		else
		{
			Joueur.couleurJoueur=DiscColor.YELLOW_DISC;
		}
	}
}
