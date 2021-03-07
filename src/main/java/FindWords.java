/*
This is a game to find computer related words

/**
 *
 * @author talita
 */
import java.util.Scanner;
public class FindWords {

    public static void main(String[] args) {
        char start;
		char again;
		int round = 0;
		int player1Points = 0;
		int player2Points = 0;
		String player2;

		Scanner input = new Scanner(System.in);

//--------- Rules of the Game
		System.out.println();
		System.out.println("WELCOME TO FIND COMPUTER WORDS GAME");
		System.out.println("-------- How to Play --------");
		System.out.println("** Each player should type a word according to the following rules:");
		System.out.println("1- The word must match the characters provided by the computer (max 12)");
		System.out.println("2- Try to form a word related to computers, e.g.: online");
		System.out.println("3- If your word have double vowels, like 'data' you win 2 points!");
		System.out.println();
		
//--------- Input to Start/End
		System.out.println("Would you like to start? Y/N");
		start = input.next().charAt(0);
		System.out.println();

		if (start == 'Y' || start == 'y') {

			do {
				round++;
				System.out.println("--------Round " + round +" --------");

				System.out.println();
		
//--------- Display the 12 random letters
				RandomString gameRandomString = new RandomString();
				gameRandomString.createRandomString();

				String randWord = gameRandomString.getString().toString();

				System.out.println("Try to use the max of letters you can and you can use each letter only once");
				System.out.println("Here are the letters");
				System.out.println(randWord);
				System.out.println();

//--------- Player1 inputs the word
				
				System.out.print("Player 1 Enter the Word: ");
                                System.out.println();
				String player1 = input.next().toLowerCase();

//--------- Checks if the String matches the word given and the player input - Validation 1	objects and Methods			
				
				GameValidations checkValid = new GameValidations();

				checkValid.setRandomString(randWord);

				checkValid.setUserInput(player1);

				checkValid.checkStringMatch(randWord,player1);

				checkValid.getCount();

				checkValid.setPlayerWord(player1);

				checkValid.setTheWord(player1);


//--------- Validation Player1 - Conditions to check the String provided (player1)
				
				if (checkValid.getCount()) {
					System.out.println("Good! You use the given letters to form a new word!");
					
					checkValid.gameArrayValidation();

					if(checkValid.getFound()){
						checkValid.countTheVowels();

						if(checkValid.getCountA() >=2 || checkValid.getCountE() >=2 || checkValid.getCountI() >=2 ||
						checkValid.getCountO() >=2 || checkValid.getCountU()>=2){
							System.out.println(" You won 2 points!");
							player1Points = player1Points + 2;

						}
					}
					
                } else {
                	System.out.println("Oh no! Some of this letters are not part of the given letters");
                }
                System.out.println();

//--------- Player2 inputs the word with validation: input player2 can not to be equal input player1) 
            do {
                System.out.print("Player 2 Enter the Word: ");
                                System.out.println();
				player2 = input.next().toLowerCase();

				if (player2.equals(player1)){
                 System.out.println("Please, enter a word different then Player 1's word.");    	
            	}

			} while (player2.equals(player1));

//--------- Checks if the String matches the word given and the player input - Validation 2	Objects and Methods
				GameValidations checkValid2 = new GameValidations();

				checkValid2.setRandomString(randWord);

				checkValid2.setUserInput(player2);

				checkValid2.checkStringMatch(randWord,player2);

				checkValid2.getCount();

				checkValid2.setPlayerWord(player2);

				checkValid2.setTheWord(player2);
		

//--------- Validation Player2 - Conditions to check the String provided (player2)

				if (checkValid2.getCount()) {
					System.out.println("Good! You use the given letters to form a word!");
					
					checkValid2.gameArrayValidation();

					if(checkValid2.getFound()){
						checkValid2.countTheVowels();

						if(checkValid2.getCountA() >=2 || checkValid2.getCountE() >=2 || checkValid2.getCountI() >=2 ||
						checkValid2.getCountO() >=2 || checkValid2.getCountU()>=2){
							System.out.println(" You won 2 points!");
							player2Points = player2Points + 2;

						}
					}

                } else {
                	System.out.println("Oh no! Some of this letters are not part of the given letters");
                }

                if (player2.equals(player1)){
                	System.out.println("Copy is not allowed, please enter a new word.");
                	
                }
            
                System.out.println();
                System.out.println("Player 1: " + player1Points + " points" );
                System.out.println("Player 2: " + player2Points + " points" );

//--------- End of the Round 
			
			System.out.println("Would you like to play another round? Y/N");
			again = input.next().charAt(0);	

			} while (again == 'Y' || again == 'y');
			
			System.out.println();
			System.out.println("You have Played " + round + " rounds" );
			System.out.println("Player 1: " + player1Points + " points" );
			System.out.println("Player 2: " + player2Points + " points" );
			if (player1Points == player2Points) {
				System.out.println("It is a tie!" );
			} else if (player1Points > player2Points) {
				System.out.println("Congratulations! Player 1 Won!" );
			} else {
				System.out.println("Congratulations! Player 2 Won!" );
			}	


		} else {

			System.out.println("End of the Game");

		}
    }
    
}
