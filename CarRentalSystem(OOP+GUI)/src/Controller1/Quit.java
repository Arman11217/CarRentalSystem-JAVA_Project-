package Controller1;

import java.util.Scanner;

import Model1.Database;
import Model1.Operation;
import Model1.User;
import javax.swing.JFrame;

public class Quit implements Operation {

	@Override
	public void Operation(Database database, JFrame f, User user) {

		System.out.println("Thanks for visiting us!");
		
		
	}

}
