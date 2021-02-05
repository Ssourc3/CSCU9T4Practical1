
public class SwimEntry extends Entry{

	private String where;
	

    public SwimEntry(String Name, int Distance, int Month, int Year, int Hour, int Minute, int Seconds, float Duration, String Where) {
    	
    super(Name,Distance,Month, Year, Hour, Minute, Seconds, Distance);
    
    where = Where;
    
   
    } 
   public void setWhere(String where) {
		this.where = where;
	}
//getting where 
   public String getWhere() {
	   return where;
   }
   
   public String getEntry() {
	   String result = getName() + "Has swam"+ getDistance()+ "km"+ getWhere() + "within" + getHour() + "hrs"+ getMin() +"mins"+ getSec() + "secs" 
       + "on" + getDay() + "/" + getMonth() + "/" + getYear() +"\n";
	   
	   return result;
   }
}
 
