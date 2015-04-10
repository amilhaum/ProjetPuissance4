/**
 * Game board, which is a grid of fixed size, in which colored discs an be dropped.
 * (see http://en.wikipedia.org/wiki/Connect_Four)
 *  
 * @author amilhaum
 *
 */
public class Grid 
{
	public final static int NOMBRE_DE_COLONNES=7;
	public final static int NOMBRE_DE_LIGNES=7;
	
	public Disc[][] cells;
	
	public int numberOfLine;
	
	public int numberOfColumn;
	
	/**
	 * Create a new empty grid
	 */
	public Grid()
	{
		this.cells = new Disc[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
		for(numberOfColumn=0;numberOfColumn <= NOMBRE_DE_COLONNES; numberOfColumn++)
		{
			for(numberOfLine=0;numberOfLine<= NOMBRE_DE_LIGNES; numberOfLine++)
			{
				cells[numberOfLine][numberOfColumn]= null;
			}
		}
			
				
	}
	
}
