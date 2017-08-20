package com.itheima.comprehensivedemo;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener, TextWatcher {

	private EditText et1;
	private EditText et2;
	private ImageView iv;
	private AnimatedVectorDrawable anim1;
	private AnimatedVectorDrawable anim2;
	private AnimatedVectorDrawable anim3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv = (ImageView) findViewById(R.id.img1);
		anim1 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim1);
		anim2 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim2);
		anim3 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim3);


		et1 = (EditText) findViewById(R.id.edit1);
		et2 = (EditText) findViewById(R.id.edit2);
		et1.setOnFocusChangeListener(this);
		et2.setOnFocusChangeListener(this);

		et1.addTextChangedListener(this);
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		switch (v.getId()){
			case R.id.edit1:
				if(hasFocus){
					iv.setImageDrawable(anim1);
					anim1.start();
				}
				break;
			case R.id.edit2:
				if(hasFocus){
					iv.setImageDrawable(anim2);
					anim2.start();
				}
				break;
		}
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {

	}

	@Override
	public void afterTextChanged(Editable s) {
		String result = s.toString();
		if("123".equals(result)) {
			Toast.makeText(this, "right", Toast.LENGTH_SHORT).show();
			iv.setImageDrawable(anim3);
			anim3.start();
		}
	}
}
