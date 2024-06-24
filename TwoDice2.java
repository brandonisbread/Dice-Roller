// Chapter 5 Game Zone

public class TwoDice2
{
	public static void main(String[] args) 
	{
		//variables and constants
		Die dieOne = new Die();
		Die dieTwo = new Die();
		String outcome;
		int player;
		int computer;

		player = dieOne.getDieValue();
		computer = dieTwo.getDieValue();

		//process
		if(player > computer)
		{
			outcome = "The player wins the game!";
		} 
		else
		{
			if(player < computer)
			{
				outcome = "The computer wins the game...";
			} else
			{
				outcome = "The player and the computer tied.";
			}
		}


		// output
		System.out.println("You rolled a " + player + ".");
		System.out.println("The computer rolled a " + computer + ".");
		System.out.println(outcome);
	}//end of main
}