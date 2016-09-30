package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by michelletagarino on 16-09-29.
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){
    }

    //Returns a tweet at the specified index
    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    //Returns true if there is tweet that equals another tweet
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    //Adds a tweet to the list
    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    //Deletes a tweet from the list
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    //Adds a tweet to the list. If the tweet is a duplicate, an IllegalArgumentException is thrown
    public void addTweet(Tweet tweet){
        try{
            if (!hasTweet(tweet)){
                tweets.add(tweet);
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }

    //Returns a list of tweets in chronological order
    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

    //Gets the exact count of tweets in the tweet list
    public int getCount(){
        return tweets.size();
    }
}
