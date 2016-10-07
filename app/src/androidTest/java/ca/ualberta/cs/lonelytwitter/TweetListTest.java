package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by michelletagarino on 16-09-29.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{

    /**
     * Instantiates a new Tweet list test.
     */
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Tests if there is tweet duplicate.
     */
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    /**
     * Tests if there is a tweet duplicate.
     */
    public void testAddTweetException(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    /**
     * Tests if a tweet has been truly deleted using the delete method in the TweetList class.
     */
    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet= new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    /**
     * Tests if the getTweet method truly returns the tweet at the specified index.
     */
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage()); //checks to see if two objects are equal
    }

    /**
     * Tests if the hasTweet method works.
     */
    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Tests if the getTweets method works.
     */
    public void testGetTweets() {
        TweetList list1 = new TweetList();
        ArrayList<Tweet> list2 = new ArrayList<Tweet>();

        Tweet tweet1 = new NormalTweet("hey");
        Tweet tweet2 = new NormalTweet("there");

        list1.add(tweet1);
        list1.add(tweet2);

        list2.add(tweet1);
        list2.add(tweet2);

        assertEquals(list1.getTweets(),list2);

    }

    /**
     * Tests if the getCount method works.
     */
    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        assertEquals(tweets.getCount(),1);
    }
}
