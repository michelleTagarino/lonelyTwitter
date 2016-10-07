package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by michelletagarino on 16-09-29.
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList(){}

    /**
     * This method gets the tweet at the specified index.
     *
     * @param index the index in the array list.
     * @return the tweet at a specified index.
     */
    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    /**
     * This method tests whether or not the list of tweets contains duplicates.
     *
     * @param tweet the tweet.
     * @return the boolean.
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * This method adds a tweet to the list.
     *
     * @param tweet the tweet.
     */
    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    /**
     * This method deletes a tweet from the list.
     *
     * @param tweet the tweet.
     */
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    /**
     * This method adds a tweet to the list. If the tweet is a duplicate,
     * an IllegalArgumentException is thrown.
     *
     * @param tweet the tweet.
     * @throws IllegalArgumentException
     */
    public void addTweet(Tweet tweet){
        try{
            if (!hasTweet(tweet)){
                tweets.add(tweet);
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method returns a list of tweets in chronological order.
     *
     * @return the array list.
     */
    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

    /**
     * This method gets the exact count of tweets in the tweet list.
     *
     * @return int the size of the list of tweets.
     */
    public int getCount(){
        return tweets.size();
    }
}
