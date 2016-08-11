package Lab12;

public abstract class Player {
	
	private String roshambo;
	private String name;
	
	
	public String getRoshambo() {
		return roshambo;
	}
	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player(String roshambo, String name) {
		super();
		this.roshambo = roshambo;
		this.name = name;
	}
	public void printNameAndChoice () 
	{
		System.out.println(name + " : " + roshambo);
	}
	
	public abstract String generateRoshambo ();
	public Player() {
		super();
	}

}
