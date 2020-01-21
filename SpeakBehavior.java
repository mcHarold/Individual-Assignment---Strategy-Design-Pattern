import java.util.Random;//imports java RNG

//Specific Behavior that implements an interface
public class SpeakBehavior implements TalkBehavior {
	
	Random rand = new Random();//Allows Random ints to be used
	
	//overrides the talk method and prints something
	public void talk()
	{
		int randomNum = rand.nextInt(2);//creates random int between 0-1
		if(randomNum == 0)//if random int was this print this specific message
		{
			System.out.println("Hello, How are you?");
		}
		else
		{
			System.out.println("Good day");
		}
	}

}
