package fr.iutvalence.info.m2103.project;

/**
 * Game board, which is a grid of fixed size, where colored discs an be dropped.
 * (see http://en.wikipedia.org/wiki/Connect_Four)
 *  
 * @author amilhaum
 *
 */

public class Grid 
{
	private final static int NUMBER_OF_COLUMNS=7;
	private final static int NUMBER_OF_LINES=7;
	
	private DiscColor[][] cells;
	
	private int numberOfLines;
	private int numberOfColumns;
	
	/**
	 * Create a new empty grid
	 */
	
	public Grid()
	{
		this.cells = new DiscColor[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];
		for(numberOfColumns=0;numberOfColumns<NUMBER_OF_COLUMNS;numberOfColumns++)
		{
			for(numberOfLines=0;numberOfLines<NUMBER_OF_LINES;numberOfLines++)
			{
				cells[numberOfLines][numberOfColumns]=null;
			}
		}
	}
	
	/**
	 * Get the the cell of the grid for a position who's given
	 * @param position
	 * @return the position of the cell
	 */
	
	public DiscColor GetPosition(Position position)
	{
		return this.cells[position.getNumberOfLine()][position.getNumberOfColumn()];
	}
	
/**
 * Play a single in shot in the grid and analyse if the last shot play allow the player to win, or not.
 * @param col
 * @param joueur
 * @return boolean
 */
	
	public boolean playAShot(int col, Joueur joueur)
	{
		int line=0;
		int delta=1;
		int compteur1=0;
		int compteur2=0;
		int compteur3=0;
		int compteur4=0;

		for(line=7;line!=-1;line--)
		{
			if(cells[line][col]==null)
			{
				cells[line][col]=Joueur.couleurJoueur;
				break;
			}
		}
		
		for(int rLine=line;rLine<=NUMBER_OF_LINES;rLine++)
		{
			for(int lLine=line;lLine>=0;lLine--)
			{
				if(cells[rLine][col]==Joueur.couleurJoueur)
				{
					compteur1++;
				}
				if(cells[lLine][col]==Joueur.couleurJoueur)
				{
					compteur1++;
				}
				if(compteur1==4)
				{
					return true;
				}
			}
		}
		
		for(int uCol=col;uCol<=NUMBER_OF_COLUMNS;uCol++)
			{
			for(int lCol=col;lCol>=0;lCol--)
				{
					if(cells[line][uCol]==Joueur.couleurJoueur)
					{
						compteur2++;
					}
					if(cells[line][lCol]==Joueur.couleurJoueur)
					{
							compteur2++;
					}
					if(compteur2==4)
					{
						return true;
					}
				}
			}
		
		for(int rLine=line;rLine<=NUMBER_OF_LINES;rLine++)
		{
			for(int uCol=col;uCol<=NUMBER_OF_COLUMNS;uCol++)
			{
				for(int lLine=line;lLine>=0;lLine--)
				{
					for(int lCol=col;lCol>=0;lCol--)
					{
							if(cells[rLine][uCol]==Joueur.couleurJoueur)
							{
								compteur3++;
							}
							if(cells[rLine][lCol]==Joueur.couleurJoueur)
							{
								compteur4++;
							}
							if(cells[lLine][uCol]==Joueur.couleurJoueur)
							{
								compteur4++;
							}
							if(cells[lLine][lCol]==Joueur.couleurJoueur)
							{
								compteur3++;
							}
							if(compteur3==4 || compteur4==4)
							{
								return true;
							}
							rLine=rLine+delta;
							uCol=uCol+delta;
							lLine=lLine-delta;
							lCol=lCol-delta;
							delta++;
					}
				}
			}
		}
		return false;
	}
	
	

	/**
	 * Give a representation in ASCII-art of the grid
	 */
	
	public String toString()
	{
		String gridConnectFourAsciiArt="----------------------------\n";
		
		for(int numberOfLines=0; numberOfLines<NUMBER_OF_LINES; numberOfLines++)
		{
			for(int numberOfColumns=0; numberOfColumns<NUMBER_OF_COLUMNS; numberOfColumns++)
			{
				if (this.GetPosition(new Position(numberOfLines,numberOfColumns)) == null)
					gridConnectFourAsciiArt +=" ";
			}
			gridConnectFourAsciiArt +="\n----------------------------\n";
		}
		return gridConnectFourAsciiArt;
	}
}