package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/15/16.
 */
public class NormalTweet extends Tweet {

    /**
     * This constructor creates a normal tweet.
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * This method tests whether the tweet is normal or important.
     * In this class it will always return the boolean value 'FALSE'.
     * @return boolean
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
