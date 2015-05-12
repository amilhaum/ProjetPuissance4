package fr.iutvalence.info.m2103.project;
/**
 * Class of position who's composed with a line's number and a column's number
 * @author amilhaum
 * 
 */
public class Position 
{
	private int lineNumber;
	private int columnNumber;
	
	/**
	 * A combination of line and column who give us a position in the grid
	 * @param numberOfLine
	 * @param numberOfColumn
	 */
	
	public Position (int numberOfLine, int numberOfColumn)
	{
		this.lineNumber=numberOfLine;
		this.columnNumber=numberOfColumn;
	}
	
	/**
	 * return the number of the targeted line
	 * @return
	 */
	
	public int getNumberOfLine()
	{
		return this.lineNumber;
	}
	
	/**
	 * return the number of the targeted column
	 * @return
	 */
	
	public int getNumberOfColumn()
	{
		return this.columnNumber;
	}
	
}
