package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    /**
     * This method takes the the user's input text and uses it when creating a new Tweet object.
     * The method will throw an exception if the tweet is greater than 140 characters long.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method will get the message of the tweet instance.
     *
     * @return the message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method will get the date of the tweet instance.
     *
     * @return the date.
     */
    public Date getDate() {
        return date;
    }
}
