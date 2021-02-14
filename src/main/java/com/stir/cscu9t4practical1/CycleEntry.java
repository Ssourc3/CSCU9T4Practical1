/**
 * 
 */

/**
 * 
 *
 */
public class CycleEntry extends Entry{
        
	private String tempo;
	private String terrain;
	
	
	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String Tempo, String Terrain ) {
	
	super(n,d,m,y,h,min,s,dist);
	
	tempo = Tempo;
	terrain = Terrain;
	
	}


	public String getTempo() {
		return tempo;
	}


	public String getTerrain() {
		return terrain;
	}


	public String getEntry() {
		   String result = super.getName() + "Has cycled"+ super.getDistance()+ "km"+ "within" + super.getHour() + "hrs"+ super.getMin() +"mins"+ super.getSec() + "secs" + "with a tempo of:" + getTempo() + "with a terrain of:"
	      + getTerrain() + "on" + super.getDay() + "/" + super.getMonth() + "/" + super.getYear() +"\n";
}
}
