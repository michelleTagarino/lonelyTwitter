/*
Copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All Rights Reserved.
You may use, copy or distribute this code under terms and conditions of University of Alberta
and Code of Student Behavior.
Please contact tagarino@ualberta.ca for more details or questions.
*/

package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
<<<<<<< HEAD
import android.net.Uri;
=======
import android.content.Intent;
>>>>>>> lab6finish
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

/**
 * This class is the main view class in lonelyTwitter class.
 * It deals with user inputs, saves/loads them in/from the file FILENAME (file.sav).
 * <p> You can access this file from Android Device Monitor. </p>
 * <pre> pre-formatted	text</pre>
 * <code>
 *     pseudo-code that is used in this class is as follows: <br>
 *     step 1 <br>
 *     step 2 <br>
 * </code>
 * <ol>
 *     <li>first item</li>
 *     <li>second item</li>
 *     <li>third item</li>
 * </ol>
 * <ul>
 *     <li>first item</li>
 *     <li>second item</li>
 *     <li>third item</li>
 * </ul>
 * @author Michelle
 * @since 1.4
 * @see NormalTweet
 * @see java.io.BufferedReader
 * @see TweetList
 */
public class LonelyTwitterActivity extends Activity {

<<<<<<< HEAD
	/**
	 * This is the name of the file that is saved in your virtual device.
	 * You can access it through Android Device Monitor by selecting your app,
	 * then data -> data -> file.sav
	 * @see NormalTweet
	 * @author Michelle
	 */
=======
	private Activity activity = this;

>>>>>>> lab6finish
	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;
	private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

<<<<<<< HEAD
	/**
	 * Called when the activity is first created.
	 */
=======
	public ListView getOldTweetsList(){
		return oldTweetsList;
	}


>>>>>>> lab6finish
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				Tweet newTweet = new NormalTweet(text);
				tweetList.add(newTweet);
				adapter.notifyDataSetChanged();
				saveInFile();
			}
		});

		clearButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				tweetList.clear();
<<<<<<< HEAD
				adapter.notifyDataSetChanged();
			}
		});
=======
				deleteFile(FILENAME);
				adapter.notifyDataSetChanged();
			}
		});

		oldTweetsList.setOnItemClickListener(new
				AdapterView.OnItemClickListener(){
					public void onItemClick(AdapterView<?> parent, View view,
											int position ,long id){
						Intent intent = new Intent(activity, EditTweetActivity.class);
						intent.putExtra("newText", tweetList.get(0).getMessage());
						startActivity(intent);
					}

				});


>>>>>>> lab6finish
	}

	/**
	 * This method starts after the app first gets created.
	 * It will call the method that loads the json file and generates the tweets from its contents.
	 * It creates an Array Adapter and displays it through the ListView.
	 */
	@Override
	protected void onStart() {
		super.onStart();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

<<<<<<< HEAD
	/**
	 * This method loads the json file and generates the tweets from its contents.
	 * @throws RuntimeException
	 * @exception FileNotFoundException
	 * @exception IOException
	 */
	private void loadFromFile() {
		tweetList = new ArrayList<Tweet>();
=======

	private void loadFromFile() {
>>>>>>> lab6finish
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			Gson gson = new Gson();
			//Code taken from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt Sept.22,2016
			Type listType = new TypeToken<ArrayList<NormalTweet>>() {}.getType();
			tweetList = gson.fromJson(in, listType);
		} catch (FileNotFoundException e) {
<<<<<<< HEAD
=======
			// TODO Auto-generated catch block
>>>>>>> lab6finish
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

<<<<<<< HEAD
	/**
	 * This method will save the updated file in the json file.
	 * @throws RuntimeException
	 * @exception FileNotFoundException
	 * @exception IOException
	 */
=======

>>>>>>> lab6finish
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME, 0);
			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson = new Gson();
			gson.toJson(tweetList, writer);
			writer.flush();
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
}