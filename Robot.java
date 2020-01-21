//main class Robot
public abstract class Robot {
	//Has 3 Attributes
	protected String name;
	TalkBehavior talkBehavior;
	MoveBehavior moveBehavior;
	//Default
	public Robot()
	{
		this.name = "Name";		
	}
	//Calls the set Name function
	public Robot(String aName)
	{
		setName(aName);
	}
	//Sets name to something new
	public void setName(String aName)
	{
		this.name=aName;
	}
	//move function which calls the interface method
	public void move()
	{
		moveBehavior.move();
	}
	//talk function which calls the interface method
	public void talk()
	{
		talkBehavior.talk();
	}
	
	//interface mutators:
	//sets the move behavior to something new
	public void setMoveBehavior(MoveBehavior m)
	{
		moveBehavior = m;
	}
	//Sets the talk behavior to something new
	public void setTalkBehavior(TalkBehavior t)
	{
		talkBehavior = t;
	}
}
