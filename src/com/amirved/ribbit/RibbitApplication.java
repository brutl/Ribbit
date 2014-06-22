package com.amirved.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "9QcvWbZYOKeaHn1p9pjyrceSnMEhqkh6ePJ4fFZ3", "VLghObH0X5VVf2GjqxvCIRtppyedEyOMyAULtvGQ");
	}
}
