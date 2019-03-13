package tp1.original.main;

import tp1.original.database.Storage;
import tp1.original.parts.Machine;

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
