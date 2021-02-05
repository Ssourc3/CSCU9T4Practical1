// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;


import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    private List<SprintEntry> SprintEntrylist;
    private List<CycleEntry> CycleEntryList;
    private List<SwimEntry> SwimEntryList;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       //adding Entry for Sprint
 public void addSprintEntry(SprintEntry sprintEntry)     {
	 sprintEntryList.add(sprintEntry);
 }
 
 //adding Entry for Cycle
       
 public void addCycleEntry(CycleEntry cycleEntry) {
	 cycleEntryList.add(cycleEntry);
 }
 
 //Adding Swim Entry 
 public void addSwimEntry(SwimEntry swimEntry) {
	 swimEntryList.add(swimEntry);
 }
      
       return result;
   } // lookupEntry
   
   //looking up Entry based on Date 
   public String LookupEntry(int Day, int Month, int Year) {
	   ListIterator<Entry> iter = tr.ListIterator();
	   String result = "No matching records found, Try again";	   
	   while (iter.hasNext()) {
		   Entry current = iter.next();
		   
		   // Checking if Dates Input Match
		   if (current.getDay()==Day && current.getMonth()==Month && current.getYear()==Year)
         result = current.getEntry();
	   }
	   
	   //returns result of Lookup
	   return result;
	  
   }
   //returns all records for a given date 
   
  public String FindAllDates(int Day, int Month, int Year) {
	  ListIterator<Entry> iter = tr.listIterator();
	  String result = "";
	  
	  while(iter.hasNext()) {
		  Entry current = iter.next();
		  
		// Checking if Dates Input Match
		  if(current.getDay()==Day && current.getMonth()==Month && current.getYear()==Year)  
	     result += current.getEntry() + "";
	  }
	  return result;
  }
  
  //returns all records for a given name 
  
 public String 
  
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   
   //removing a record based on Name and Date
   public String Delete(String Name, int Day, int Month, int Year) {
	   ListIterator<Entry> entryIterator = tr.listIterator();
	   
	   //check if record matches 
	   while(entryIterator.hasNext()) {
		   Entry  current = entryIterator.next();
		if(current.getName().equals(name)&& current.getDay()==Day && current.getMonth()==Month && curret.getYear()==Year) {
			tr.remove(current);
			return "Record has been deleted";
		}
	   }
	   return "Invalid Record"
   }

   }
   
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
       
   }
   
} // TrainingRecord