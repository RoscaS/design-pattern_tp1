package tp1.updated.main;

import tp1.updated.parts.Machine;
import tp1.updated.database.Storage;


public class ShowMachine {

	public static void main(String[] args) {
		Storage s = new Storage();
		Machine m = s.load();
		if (m != null) {
			System.out.println("Machine loaded.");
			System.out.println(m);
		} else {
			System.out.println("File or Machine not found.");
		}

	}

}
