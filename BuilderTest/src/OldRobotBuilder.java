
public class OldRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Long arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
	}

	@Override
	public Robot getRobot() {
		System.out.println("Robozinho");
		return this.robot;
	}
	
	

}
