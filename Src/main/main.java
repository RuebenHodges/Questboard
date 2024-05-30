package Src.main;

import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        System.out.println("helloworld"); 
        String time = "10:30:pm";
        String date = "05-30";
        DateTimeFormatter meetingTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:a");
        DateTimeFormatter meetingDateFormatter = DateTimeFormatter.ofPattern("M/L-dd-yyyy");
        quest testQuest = new quest();
        testQuest.setTitle("adventureTime");
        testQuest.setDescription("a game to play with a bunch of friends");
        time = time.format(meetingTimeFormatter);
        testQuest.setTime(time);
        date = date.format(meetingDateFormatter);
        testQuest.setDate(date);
        testQuest.printQuest();   
    }
}