package in.ineuron.main;

import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Let's begin the game");
		guessNum=scan.nextInt();
		if(guessNum==0 && guessNum<=10)
		{
			System.out.println("Guesser enter the number");
		}
		else
		{
			System.out.println("Please the enter the correct the number");
		}
		return guessNum;
		
	}
}
class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		guessNum=scan.nextInt();
		if(guessNum==0 && guessNum<=10)
		{
			System.out.println("Player enter the number");
		}
		else
		{
			System.out.println("Please the enter the correct the number");
		}
		return guessNum;
		
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2= p2.guessNum();
		numFromPlayer3=p3.guessNum();
		
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All player won the game");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player 1 and 2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and 3 won the game");
			}
			else
			{
				System.out.println("Player one won the game");	
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player 2 and 3 won the game");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game Lost try again");
		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		 Umpire u=new Umpire();
		 u.collectNumFromGuesser();
		 u.collectNumFromPlayer();
		 u.compare();

	}

}
