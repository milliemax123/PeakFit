/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peakfit;
import java.util.ArrayList;

/**
 * This class gets all sessions so they can be presented 
 * it also has an addsession method which TrainingsessionLog uses to add new records
 * RecordedTraining.java
 * @author Amelia maxwell 
 * 23471092
 */
public class RecordedTraining {
    
    public static ArrayList<String> sessions = new ArrayList<>();

    public void addSession(String session){
        sessions.add(session);
    }

    public String getAllSessions(){
        if (sessions.isEmpty()) {
            return "No training sessions have been recorded yet ";
        }
        String allSessions = "";
        for (String session : sessions){
            allSessions += session + "\n\n";
        }
        return allSessions;
    }
    
}
