package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int i;
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot bot1 = null;
		Robot bot2 = null;
		Robot bot3 = null;
		Robot bot4 = null;
		Robot bot5 = null;
		Robot bot6 = null;
		Robot botArr[] = {bot1, bot2, bot3, bot4, bot5, bot6};
		//3. use a for loop to initialize the robots.
		for (i = 0; i < 6; i++) {
			//4. make each robot start at the bottom of the screen, side by side, facing up
			botArr[i] = new Robot();
			botArr[i].setSpeed(100);
			botArr[i].turn(90);
			botArr[i].setY((i + 1) * 87);
			botArr[i].setX(100);
		}
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		boolean noWinner = true;
		while (noWinner) {
			for (i = 0; i < 6; i++) {
				Random ran = new Random();
				int ranNum = ran.nextInt(50)+1;
				botArr[i].setSpeed(10);
				botArr[i].move(ranNum);
				
				if (botArr[i].getX() > 750) {
					botArr[i].turn(180);
					botArr[i].setX(750);
				}
				
				if (botArr[i].getX() < 50) {
					noWinner = false;
					System.out.println(botArr[i] + " is the WINNER\nHURRAY!!!!!");
					break;
				}
			}
			//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		}
		//7. declare that robot the winner and throw it a party!

		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
		
	}
}
