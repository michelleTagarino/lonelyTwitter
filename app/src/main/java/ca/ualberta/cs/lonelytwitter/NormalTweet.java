package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tagarino on 9/15/16.
 */
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
