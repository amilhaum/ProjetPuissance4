package fr.iutvalence.info.m2103.project;

public class Joueur 
{
	public String nom;
	public int numJoueur;
	public static DiscColor couleurJoueur;
	
	
	public Joueur(String nom, int numJoueur, DiscColor couleurJoueur)
	{
		this.nom=nom;
		this.numJoueur=numJoueur;
	}
	
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
