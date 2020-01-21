//Human robot that implements the Robot parent
public class HumanRobot extends Robot {
	//takes in new name and sets behaviors to something different then default
	public HumanRobot(String name)
	{
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SpeakBehavior();
	}
	//toString Method that prints the name and short message
		public String toString()
		{
			return this.name+" is a typical human robot";
		}

}
