package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tagarino on 9/15/16.
 */
public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
