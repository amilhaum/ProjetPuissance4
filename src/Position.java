/**
 * Class of position who's composed with a line's number and a column's number
 * @author amilhaum
 * 
 */
public class Position 
{
	public int numberLine;
	public int numberColumn;
	
	/**
	 * It's a combination of a line and a column who give us a position in the grid
	 * @param numberOfLine
	 * @param numberOfColumn
	 */
	public Position (int numberOfLine, int numberOfColumn)
	{
		this.numberLine=numberOfLine;
		this.numberColumn=numberOfColumn;
	}
	
	/**
	 * return the number of the targeted line
	 * @return
	 */
	public int getNumberOfLine()
	{
		return this.numberLine;
	}
	/**
	 * return the number of the targeted column
	 * @return
	 */
	public int getNumberOfColumn()
	{
		return this.numberColumn;
	}
	
}
