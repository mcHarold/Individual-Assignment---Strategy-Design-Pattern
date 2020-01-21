//adds in Java random number generator
import java.util.Random;
//Specific Behavior that implements an interface
public class SimpleSpeakBehavior implements TalkBehavior {
	
	Random rand = new Random();//Allows random ints to be used
	
	//overrides the talk method and prints something
	public void talk()
	{

		int randomNum = rand.nextInt(3);//creates a random int between 0-2
		if(randomNum == 0)//if random int was this print this specific message
		{
			System.out.println("Wall-E, EVA!");
		}
		else if(randomNum == 1)//if random int was this print this specific message
		{
			System.out.println("Pop, Eva");
		}
		else if(randomNum == 2)//if random int was this print this specific message
		{
			System.out.println("Eee-va?");
		}
	}

}