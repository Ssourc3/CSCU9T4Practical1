
public class SwimEntry extends Entry{

	private String where;
	

    public SwimEntry(String n, int d, int m, int y, int h, int m, int s, float dist, String Where) {
    	
    super(n,d,m,y,h,min,s,dist);
    
    where = Where;
    
   
//getting where 
   public String getWhere() {
	   return where;
   }
   
   public String getEntry() {
	   String result = super.getName() + "Has swam"+ super.getDistance()+ "km"+ "in a:" + getWhere() + "within" + super.getHour() + "hrs"+ super.getMin() +"mins"+ super.getSec() + "secs" 
       + "on" + super.getDay() + "/" + super.getMonth() + "/" + super.getYear() +"\n";
	   
	   return result;
   }
}
 
