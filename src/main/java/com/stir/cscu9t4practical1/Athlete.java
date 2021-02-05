
public class Athlete extends Entry {
      private String name;
      private String type;
      private float distance;
      private int hours;
      private int mins;
      private int second;
      private Double duration;
      private String type;
      
     
     public Athlete (String Name, String Type, float Distance, int Hours, int Mins, int Second, float Duration) {
    
	 name = Name;
         type = Type;
	 distance = Distance;
	 hours = Hours;
	 mins = Mins
         second = Second;
         duration = Duration;
	      
    	    
    	  } //constructor

     //get Athlete Name
	public String getName() {
		return name;
	}

	//Set Athlete Name
	public void setName(String name) {
		this.name = name;
	}

	//Get Type
	public String getType() {
		return type;
	}

	
	//Set Type
	public void setType(String type) {
		this.type = type;
	}

	//Get Distance 
	public float getDistance() {
		return distance;
	}
	
	//Return Distance 

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	//Return Hours

	public Float getHours() {
		return Hours;
	}
	
	//Set Time

	public void setHours(int Hours) {
		this.hours = hours;
	}
	
	//Get Duration

	public Double getDuration() {
		return duration;
	}

	//Set Duration 
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	
	//Returns string of Athlete results 
	public String getAthlete () {
		   String result = getName()+ getType() + getDistance() 
		              +getTime()+ getDuration()+ "seconds";
		   return result;
		  } 
}
