# quotes

## Lab08:

With this application, you can read from a Json file, containing quotes with their authors, and prints one random quote with its author.

The app showing the quote and the author when it is run. The app should choose one quote each time it is run.

**To see the output just run The App.java every time you need to see one qutoe and one author.**

The application uses a dependency called Gson. Here is how to set it up:

### Setting up

To run the app correctly after you clone the repo, you should do the following:

* add this line into your dependencies declarations in your gradle.build of your project:

  >implementation 'com.google.code.gson:gson:2.8.7'

* refresh your gradle project from the gradle configurations on the ride side of the screen.

* use this import in the files you want to use the Gson in:

  >import com.google.gson.Gson;


## Lab9
 The application send GET request to api and show one quote, and save quotes to local json file and show them when offline.
 this feature uses the Java.net inner dependency in order to get the Json data from an API.
