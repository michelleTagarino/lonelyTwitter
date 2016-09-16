package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tagarino on 9/15/16.
 */
public class GoodMood extends CurrentMood {

    public GoodMood(){
        super();
    }

    public GoodMood(Date date){
        super(date);
    }

    public String getMood(){
        return "I am feeling good.";
    }

}
