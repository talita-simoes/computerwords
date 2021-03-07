/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talita
 */
import java.util.Random;

public class RandomString {
    private int letterA = 97; //char no 97 == a
	    private int letterZ = 122; //char no 122 == z
	    private int maxLength = 12;

// Object Random created so the program can generate random numbers
	    Random random = new Random();
// Object StringBuilder modifies the length of the string with the parameter
	    StringBuilder buffer = new StringBuilder(maxLength);

	public void createRandomString(){

	// for loop to traverse the length
	    for (int i = 0; i < maxLength; i++) {
	    	// store and generate a random number between 97 and 122
	         int randomInt = letterA + (int)(random.nextFloat() * (letterZ - letterA + 1));
	         // buffer created to store the characters randomly created
	         buffer.append((char) randomInt);
	    }

	}

	public StringBuilder getString(){
		return buffer;
	}

}
