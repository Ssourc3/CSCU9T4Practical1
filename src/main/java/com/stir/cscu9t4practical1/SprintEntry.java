
public class SprintEntry extends Entry {

	private int recovery_time;
	private int repetitions;
	
	public SprintEntry(String Name, float Distance, int Month, int Year, int Hour, int Minute, int Seconds, 
			int Repetitions, int Recovery_time) {
		
		super(Name, Distance, Month, Year, Hour, Minute, Seconds, Distance);
		
		repetitions = Repetitions;
		
	}

	public int getRecovery_time() {
		return recovery_time;
	}

	public void setRecovery_time(int recovery_time) {
		this.recovery_time = recovery_time;
	}

	public int getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}
	
	 public String getEntry() {
		 String result = super.getName() + "Has Sprinted" + GetDistance() + "km"+ "Within" + getHour()
		 + "hrs" + getMin()+"mins" + getSec()+ "secs"+ "on" + super.getDay() + "/" + super.getMonth() + "/" + super.getYear() + "\n";
		 
		 return result;
	 }

}
