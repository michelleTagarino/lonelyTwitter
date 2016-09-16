package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tagarino on 9/15/16.
 */
public class BadMood extends CurrentMood {

    public BadMood(){
        super();
    }

    public BadMood(Date date){
        super(date);
    }

    public String getMood() {
        return "I am feeling bad.";
    }
}
