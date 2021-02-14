// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    //TextFields
    private JTextField name = new JTextField(30);
    private JTextField day = new JTextField(2);
    private JTextField month = new JTextField(2);
    private JTextField year = new JTextField(4);
    private JTextField hours = new JTextField(2);
    private JTextField mins = new JTextField(2);
    private JTextField secs = new JTextField(2);
    private JTextField dist = new JTextField(4);
    private JTextField entry = new JTextField(10);
    private JTextField reps = new JTextField(5);
    private JTextField recovery = new JTextField(5);
    private JTextField terrain = new JTextField(20);
    private JTextField Tempo = new JTextField(20);
    private JTextField where = new JTextField(20);
        
   //Labels 
    private JLabel labn = new JLabel(" Name:");
    private JLabel labd = new JLabel(" Day:");
    private JLabel labm = new JLabel(" Month:");
    private JLabel laby = new JLabel(" Year:");
    private JLabel labh = new JLabel(" Hours:");
    private JLabel labmm = new JLabel(" Mins:");
    private JLabel labs = new JLabel(" Secs:");
    private JLabel labEntry = new JLabel("Type (Cycle/Swim/Sprint):");
    private JLabel labdist = new JLabel(" Distance (km):");
    private JLabel labRepitions = new JLabel("reps");
    private JLabel labRecoveryTime = new JLabel("Recovery Time");
    private JLabel labWhere = new JLabel("Swam where");
    private JLabel labcycleTempo = new JLabel("Cycle Tempo");
    private JLabel labcycleTerrain = new JLabel("Cycle Terrain);                                     
    
    // Buttons in Interface 
    private JButton addR = new JButton("Add");
    private JButton RemoveEntry= new JButton("Remove");
    private JButton allDates = new JButton("Find All by Date");
    private JButton lookUpByDate = new JButton("Look Up");

    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5, 50);

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI 
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());
        add(labn);
        add(name);
        name.setEditable(true);
        add(labd);
        add(day);
        day.setEditable(true);
        add(labm);
        add(month);
        month.setEditable(true);
        add(laby);
        add(year);
        year.setEditable(true);
        add(labh);
        add(hours);
        hours.setEditable(true);
        add(labmm);
        add(mins);
        mins.setEditable(true);
        add(labs);
        add(secs);
        secs.setEditable(true);
        add(labdist);
        add(dist);
        dist.setEditable(true);
       
        //adding labels and textfields
        
        //entry type
        add(labEntry); 
        add(entry);   
        entry.setEditable(true);
        
        //Cycle 
        add(labcycleTempo);
        add(Tempo);
        Tempo.setEditable(true);
        add(labcycleTerrain);
        add(terrain);
        terrain.setEditable(true);
        
        //Swim 
        add(labWhere);
        add(where);
        where.setEditable(true);
        
        //Sprint
        add(labRepitions);
        add(reps);
        reps.setEditable(true);  
            
        add(addR);
        addR.addActionListener(this);
        add(lookUpByDate);
        
        //Buttons are disabled before record is to be added or add button is used
        
        lookUpByDate.setEnabled(false);
        allDates.setEnabled(false);
        RemoveEntry.setEnabled(false);
            
        lookUpByDate.addActionListener(this);
        add(allDates);
        allDates.addActionListener(this);
        add(RemoveEntry);
        RemoveEntry.addActionListener(this);
        add(outputArea);
        outputArea.setEditable(false);
        setSize(720, 200);
        setVisible(true);
        blankDisplay();

        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)
        
    } // constructor

    // listen for and respond to GUI events 
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (event.getSource() == addR) {
            message = addEntry("generic");
            
     //buttons are re-enabled after the Add button is clicked:
        lookUpByDate.setEnabled(true);
        allDates.setEnabled(true);
        RemoveEntry.setEnabled(true);
        }
        if (event.getSource() == lookUpByDate) {
            message = lookupEntry();
        }
        if (event.getSource() == allDates) {
            message = findAllDates();
        }
        if(event.getSource() ==lookUpByDate) {
            message = lookUpByDate();
        } 
        if(event.getSource()==RemoveEntry){
            message = RemoveEntry();
        }     
        outputArea.setText(message);
        blankDisplay();
    } // actionPerformed

    public String addEntry(String what) {
        String message = "Record added\n";
        System.out.println("Adding "+what+" entry to the records");
        String n = name.getText();
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        float km = java.lang.Float.parseFloat(dist.getText());
        int h = Integer.parseInt(hours.getText());
        int mm = Integer.parseInt(mins.getText());
        int s = Integer.parseInt(secs.getText());
        Entry e = new Entry(n, d, m, y, h, mm, s, km);
        myAthletes.addEntry(e);
        return message;
    }
    //checking input and adding new entry
    if(n.isEmpty()|| m ==- 1|| d== -1||y == -1)){
        return "Invalid Input try again";
        
     // new sprint record 
    }else if(entry.equals("Sprint")){
        int Reps = Integer.parseInt(entry.getText());
        int Recovery_time = Integer.parseInt(recovery.getText());
        e = new SprintEntry(n, d, m, y, h, mm, s, km, Reps, Recovery_time);
      // new swim record   
    }else if(entry.equals("Swim)){
        String Swimwhere =  where.getText();
       e = new SwimEntry(n,d,m,y,h,mm,s,km,Swimwhere);
     // new cycle record 
    }else (entry.equals("Cycle")){  
      String Terrain = terrain.getText());
      String Tempo = Tempo.getText());
       //checks if there is already a matching record entered 
    }else{
        if(myAthletes.checkUniqueness(n, d, m, y)){
            return "Record already Exists";
            }
   } catch (Exception e){
        message = "enter a valid input.";
    }
        return message;
    }
   
                                                                              
    
    public String lookupEntry() {
        int m = Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        outputArea.setText("looking up record ...");
        String message = myAthletes.lookupEntry(d, m, y);
        return message;
    }

     /**
     * finds all records with matching day/month/year
     * returns matching records or an empty set
     * (Find all dates)
     */
     public String FindAllDates() {
         int m =Integer.parseInt(month.getText());
         int d = Integer.parseInt(day.getText());
         int y = Integer.parseInt(year.getText());
         outputArea.setText("looking up record ...");
         String message = myAthletes.lookupEntry(d, m, y);
         return message;
     }
     /**
     * Removes a record based on matching:
     * Day/Month/Year and Name
     */
     
    public String Delete() {
        String n = name.getText();
        int m =Integer.parseInt(month.getText());
        int d = Integer.parseInt(day.getText());
        int y = Integer.parseInt(year.getText());
        
        String message = myAthletes.RemoveEntry(n,d, m, y);
        return message;
    }
                                                
    public void blankDisplay() {
        name.setText("");
        day.setText("");
        month.setText("");
        year.setText("");
        hours.setText("");
        mins.setText("");
        secs.setText("");
        dist.setText("");

    }// blankDisplay
    // Fills the input fields on the display for testing purposes only
    public void fillDisplay(Entry ent) {
        name.setText(ent.getName());
        day.setText(String.valueOf(ent.getDay()));
        month.setText(String.valueOf(ent.getMonth()));
        year.setText(String.valueOf(ent.getYear()));
        hours.setText(String.valueOf(ent.getHour()));
        mins.setText(String.valueOf(ent.getMin()));
        secs.setText(String.valueOf(ent.getSec()));
        dist.setText(String.valueOf(ent.getDistance()));
    }

} // TrainingRecordGUI

