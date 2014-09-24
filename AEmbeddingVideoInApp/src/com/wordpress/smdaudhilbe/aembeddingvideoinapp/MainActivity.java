package com.wordpress.smdaudhilbe.aembeddingvideoinapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends Activity {

	private VideoView videoView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		videoView = (VideoView)findViewById(R.id.videoView1);
		
		String fileName = "android.resource://" + getPackageName() + "/" + R.raw.moto_x_review_2014;
		videoView.setVideoURI(Uri.parse(fileName));
		videoView.start();
	}
}