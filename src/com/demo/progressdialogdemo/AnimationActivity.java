package com.demo.progressdialogdemo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimationActivity extends Activity {

	private ImageView mImgView = null;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);

		mImgView = (ImageView) findViewById(R.id.imgView);

		mImgView.setBackgroundResource(R.drawable.progress_anim);

		final AnimationDrawable progressAnimation = (AnimationDrawable) mImgView
				.getBackground();
		progressAnimation.start();
	}
}