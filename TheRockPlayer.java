package Lab12;

public class TheRockPlayer extends Player {

	public TheRockPlayer(String roshambo, String name) {
		super(roshambo, name);
		// TODO Auto-generated constructor stub
	}

	public TheRockPlayer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateRoshambo() {
		setRoshambo("rock");
		// TODO Auto-generated method stub
		return getRoshambo();
	}

}
