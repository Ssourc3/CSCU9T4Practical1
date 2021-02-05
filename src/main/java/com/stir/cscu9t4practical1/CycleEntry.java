/**
 * 
 */

/**
 * @author sophiacachapero
 *
 */
public class CycleEntry extends Entry{
 
	private String tempo;
	private String terrain;
	
	
	public CycleEntry(String Name, int Distance, int Month, int Year, int Hour, int Minute, int Seconds, float Duration, String Tempo, String Terrain ) {
	
	super(Name,Duration,Month, Year, Hour, Minute, Seconds, Distance);
	
	tempo = Tempo;
	terrain = Terrain;
	
	}


	public String getTempo() {
		return tempo;
	}


	public void setTempo(String tempo) {
		this.tempo = tempo;
	}


	public String getTerrain() {
		return terrain;
	}


	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public String getEntry() {
		   String result = super.getName() + "Has cycled"+ getDistance()+ "km"+ "within" + getHour() + "hrs"+ getMin() +"mins"+ getSec() + "secs" + "with a tempo of:" + getTempo() + "with a terrain of:"
	      + getTerrain() + "on" + super.getDay() + "/" + super.getMonth() + "/" + super.getYear() +"\n";
}
}
