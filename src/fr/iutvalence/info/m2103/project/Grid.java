package fr.iutvalence.info.m2103.project;
/**
 * Game board, which is a grid of fixed size, in which colored discs an be dropped.
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
		for(numberOfColumns=0;numberOfColumns <= NUMBER_OF_COLUMNS; numberOfColumns++)
		{
			for(numberOfLines=0;numberOfLines<= NUMBER_OF_LINES; numberOfLines++)
			{
				cells[numberOfLines][numberOfColumns]= null;
			}
		}
	}
	
	/**
	 * Get the the cell of the grid for a position who's given
	 * @param position
	 * @return
	 */
	
	public DiscColor GetPosition(Position position)
	{
		return this.cells[position.getNumberOfLine()][position.getNumberOfColumn()];
	}
	
	
	
	/**
	 * Give a representation in ASCII-art of the grid
	 */
	
	public String toString()
	{
		String gridConnectFourAsciiArt="-----\n";
		
		for(int numberOfLines=0;numberOfLines<NUMBER_OF_LINES;numberOfLines++)
		{
			for(int numberOfColumns=0;numberOfColumns<NUMBER_OF_COLUMNS;numberOfColumns++)
			{
				gridConnectFourAsciiArt += this.GetPosition(new Position(numberOfLines,numberOfColumns));
			}
			gridConnectFourAsciiArt += "\n-----\n";
		}
		return gridConnectFourAsciiArt;
	}
	
}
