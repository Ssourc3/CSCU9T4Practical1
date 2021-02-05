
public class Trainer {
	private String trainer_name;
	private String name;

	public Trainer(String Trainer_name, String Name) {
		setTrainer_name(Trainer_name);
		setName(Name);

	} // constructor

// Get Trainer's Name
	public String getTrainer_name() {
		return trainer_name;
	}

	// Set Trainer's Name

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

// Get Athlete's Name	

	public String getName() {
		return name;
	}

// Set Athlete's Name	
	public void setName(String name) {
		this.name = name;
	}

	// Returns string of Trainer results
	public String getTrainer() {
		String result = getName() + getTrainer_name();
		return result;
	}

}
