package Src.main;


public class quest {
    
    String title;
    String description;
    String date;
    String time;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //can be quitelong
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    //meeting date of quest
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    //meeting Time / Timezone tb implemented
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void printQuest(){
        System.err.println(
        title + " " +
        description + " " +
        date + " " +
        time + " " );
    }
}
