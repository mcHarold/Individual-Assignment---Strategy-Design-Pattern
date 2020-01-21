//Specific Behavior that implements an interface
public class BarkBehavior implements TalkBehavior {
	//overrides the talk method and prints something
	public void talk()
	{
		System.out.println("Woof Woof Woof");
	}

}
