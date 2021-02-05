
public class Athlete {
	 private String name;
	 private String type;
     private Float distance;
     private Float time;
     private Double duration;
     
     public Athlete (String Name, String Type, Float Distance,Float Time,Double Duration) {
    	    setName(Name);
    	    setType(Type);
    	    setDistance(Distance);
    	    setTime(Time);
    	    setDuration(Duration);   
    	    
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

	public void setDistance(Float distance) {
		this.distance = distance;
	}
	
	//Return Time

	public Float getTime() {
		return time;
	}
	
	//Set Time

	public void setTime(Float time) {
		this.time = time;
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
