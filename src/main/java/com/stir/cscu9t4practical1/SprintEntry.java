
public class SprintEntry extends Entry {

	private int recovery_time;
	private int repetitions;
	
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, 
			int Repetitions, int Recovery_time) {
		
		
	        super(n,d,m,y,h,min,s,dist);
		repetitions = Repetitions;
		recovery_time = Recovery_time;
		
	}

	// get recovery 
	public int getRecovery_time() {
		return recovery_time;
	}

        // get Reps 
	public int getRepetitions() {
		return repetitions;
	}


	//returns the results for GetEntry
	 public String getEntry() {
		 String result = super.getName() + "Has Sprinted" + super.getDistance() + "km"+ "Within" + super.getHour()
		 + "hrs" + super.getMin()+"mins" + super.getSec()+ "secs"+ "on" + super.getDay() + "/" + super.getMonth() + "/" + super.getYear() + "\n";
		 
		 return result;
	 }

}
