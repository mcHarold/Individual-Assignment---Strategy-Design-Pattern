//Dog robot that implements the Robot parent
public class DogRobot extends Robot {
	//takes in new name and sets behaviors to something different then default
	public DogRobot(String name)
	{
		super(name);
		moveBehavior = new CrawlBehavior();
		talkBehavior = new BarkBehavior();
	}
	
	//toString Method that prints the name and short message
	public String toString()
	{
		return this.name+" is a happy dog robot";
	}

}
