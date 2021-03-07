/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talita
 */
public class GameValidations {
    // -------------------- gameArrayValidation -------------------- //
	
//variables
	private String[] gameWords = {"algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug", 
		"binary", "browser", "bus", "cache", "command", "computer", "cookie", "compiler", "cyberspace", "compress", "configure", 
		"database", "digital", "data", "debug", "desktop", "disk", "domain", "decompress", "development", "download", "dynamic", 
		"email", "encryption", "firewall", "flowchart", "file", "folder", "graphics", "hyperlink", "host", "hardware", "icon", 
		"inbox", "internet", "kernel", "keyword", "keyboard", "laptop", "login", "logic", "malware", "motherboard", "mouse", 
		"mainframe", "memory", "monitor", "multimedia", "network", "node", "offline", "online", "path", "process", "protocol", 
		"password", "phishing", "platform", "program", "portal", "privacy", "programmer", "queue", "resolution", "root", "restore", 
		"router", "reboot", "runtime", "screen", "security", "shell", "snapshot", "spam", "screenshot", "server", "script", "software", 
		"spreadsheet", "storage", "syntax", "table", "template", "thread", "terminal", "username", "virtual", "virus", "web", 
		"website", "window", "wireless", "aa", "ee", "ii","oo", "uu"};

	private boolean found = false;
	private int index = 0;
	private String playerWord;

//setter method placeholder for the user input

	public void setPlayerWord(String playerWord){
	this.playerWord = playerWord;

	}
	
//method to check if the user word provided are included in the Array
	public void gameArrayValidation() {

		for (int i = 0; i < gameWords.length; i++) {

			if (playerWord.equals(gameWords[i])) {
				index = i; 
				found = true; 
				break;
			}

		}
			if(found){ // found = true

				System.out.println(playerWord +" was found in game Dictionary!");

			} else {

				System.out.println("But "+ playerWord +"  was not found in game Dictionary!");

			}

	}

// return the boolean true if the word was found or false if is not found
	public boolean getFound(){
			return found;
	}

// -------------------- checkStringMatch ------------------------ //	
 	
	// variables
 	private int count = 0;
 	private String randomString;
 	private String userInput;

 	public void setRandomString(String randomString){
 		this.randomString = randomString;
 	}

 	public void setUserInput(String userInput){
 		this.userInput = userInput;
 	}


	public void checkStringMatch(String randomString, String userInput) { 
	        
	        for (int x = 0; x < userInput.length(); x++) {
	            for (int y = 0; y < randomString.length(); y++) {
	                if (userInput.charAt(x) == randomString.charAt(y)) {
	                    count++;
	                    break;
	                }
	            }
	        }
   
	}

	public boolean getCount(){
		return count == userInput.length();
	}

//------------------------- countTheVowels --------------------------//

// variables   
      private int countA = 0;
      private int countE = 0;
      private int countI = 0;
      private int countO = 0;
      private int countU = 0;
      private String theWord;

// setter method to placehold a String
      public void setTheWord(String theWord) {
      this.theWord = theWord;
      }

// method to count the vowels
      public void countTheVowels() {
         for (int i=0 ; i<theWord.length(); i++) {
            char vowel = theWord.charAt(i);
            if (vowel == 'a'){
               countA ++;
            } else if (vowel == 'e') {
               countE ++;
            } else if (vowel == 'i') {
               countI ++;
            } else if (vowel == 'o') {
               countO ++;
            } else if (vowel == 'u') {
               countU ++;
            }
         }
      }

// getter methods to return the count of each vowel
      public int getCountA(){
         return countA;
      }
      public int getCountE(){
         return countE;
      }
      public int getCountI(){
         return countI;
      }
      public int getCountO(){
         return countO;
      }
      public int getCountU(){
         return countU;
      }
    
}
