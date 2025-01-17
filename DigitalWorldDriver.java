//package csce247.assignments.strategy;

public class DigitalWorldDriver {
	public void runWorld() {
		Robot[] robots = new Robot[4];
		robots[0] = new DogRobot("Tipsy");
		robots[1] = new HumanRobot("Sam");
		robots[2] = new iRobot("Will");
		robots[3] = new WallERobot("Wall-E");
		
		for(Robot robot : robots) {
			displayRobot(robot);
		}
		
	}
	
	private void displayRobot(Robot robot) {
		System.out.println("\n----------------");
		System.out.println(robot);
		robot.move();
		robot.talk();
		System.out.println("----------------");
	}
	
	
	public static void main(String[] args) {
		DigitalWorldDriver world = new DigitalWorldDriver();
		world.runWorld();
	}
}
