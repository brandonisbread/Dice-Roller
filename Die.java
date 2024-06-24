// Chapter 4 Game Zone exercise (page 159)

public class Die
{

	// instance variables
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;
	private int dieValue;

	// Custom constructor for die class
	public Die()
	{
		dieValue = (int) (Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}	

	// accessor/getter
	public int getDieValue()
	{
		return dieValue;
	}
}