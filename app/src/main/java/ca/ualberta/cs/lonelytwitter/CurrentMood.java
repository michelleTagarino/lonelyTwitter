package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tagarino on 9/15/16.
 */
public abstract class CurrentMood {
    private String mood;
    private Date date;

    public CurrentMood(){
        this.date = date;
    }

    public CurrentMood(Date date){
        this.date = date;
    }

    public abstract String getMood();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
