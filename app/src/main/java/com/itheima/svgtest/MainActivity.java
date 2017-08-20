package com.itheima.svgtest;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.iv).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ImageView iv= (ImageView) findViewById(R.id.iv);
				AnimatedVectorDrawable drawable= (AnimatedVectorDrawable) iv.getDrawable();
				drawable.start();
			}
		});
	}

}
