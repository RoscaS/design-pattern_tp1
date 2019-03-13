package tp1.tp1A.database;

import tp1.tp1A.parts.Machine;
import java.io.*;


public class Storage {
	final private String fileName;

	public Storage() {
		Config config = new Config();
		fileName = config.getDatabase();
	}

	public Storage(String fileName) {
		this.fileName = fileName;
	}

	public Machine load() {
		Machine ret = null;

		try (FileInputStream file = new FileInputStream(fileName)) {
			try (ObjectInputStream input = new ObjectInputStream(file)) {
				Object o = input.readObject();
				if (!(o instanceof Machine))
					throw new IOException("File " + fileName + " does not contain a Machine");
				ret = (Machine) o;
			}
		} catch (Exception ex) {
			ret = null;
		}

		return ret;
	}

	public void save(Machine machine) {
		try (FileOutputStream file = new FileOutputStream(fileName)) {
			try (ObjectOutputStream output = new ObjectOutputStream(file)) {
				output.writeObject(machine);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
