//WallE robot that implements the Robot parent
public class WallERobot extends Robot {
	//takes in new name and sets behaviors to something different then default
	public WallERobot(String name)
	{
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SimpleSpeakBehavior();
	}
	//toString Method that prints the name and short message
		public String toString()
		{
			return this.name+" is an environmentally friendly Wwall-E Robot";
		}

}
