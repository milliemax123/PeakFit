/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peakfit;

/**
 * This class validattes that all fields are filled out 
 * It then converts all inputs to a string to be added to an arraylist in recorded training
 * TrainingSessionLog.java
 * @author Amelia maxwell 
 * 23471092
 */
public class TrainingSessionLog {
    
    public boolean saveSession(String date, String startTime, String finishTime, String exercise, String comment) {
        if (date.isEmpty() || startTime.isEmpty() || finishTime.isEmpty() || exercise.isEmpty() || comment.isEmpty()) {
            return false;
        }
             String session = "date: " +date + ", start time: " + startTime+ ", finish time: " + finishTime + " ,exercise: " + exercise+ ", comments: " + comment;
        RecordedTraining training = new RecordedTraining();
        training.addSession(session);
        return true;
    }
}
