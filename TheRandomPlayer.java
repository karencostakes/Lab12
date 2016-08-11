package Lab12;

import java.util.Random;

public class TheRandomPlayer extends Player {

	public TheRandomPlayer(String roshambo, String name) {
		super(roshambo, name);
		// TODO Auto-generated constructor stub
	}


	public TheRandomPlayer() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String generateRoshambo() {
		
		Random rand = new Random(); 
		int value = rand.nextInt(3); 
		if (value == 2)
		{
			setRoshambo("rock");
		}
		if (value == 1)
		{
			setRoshambo ("paper");
		}
		
		if (value == 0)
		{
		setRoshambo ("scissors");
		}
		
		// TODO Auto-generated method stub
		return getRoshambo();
	}

}
