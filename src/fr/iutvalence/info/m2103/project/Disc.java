package fr.iutvalence.info.m2103.project;

/**
 * Disc's class
 * @author amilhaum
 *
 */

public class Disc 
{
	
	/**
	 * Disc's color 
	 */
	
	private DiscColor discColor;
	
	/**
	 * create a disc (with a color)
	 * @param discColor
	 */
	
	public Disc(DiscColor discColor)
	{
		this.discColor = discColor;	
	}
	
	/**
	 * give the color of the disc
	 * @return discColor
	 */
	
	public DiscColor getColor()
	{
		return this.discColor;
	}
}
