package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet{

    /**
     * This constructor creates and important tweet.
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * This method tests whether the tweet is normal or important.
     * In this class it will always return the boolean value 'TRUE'.
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
