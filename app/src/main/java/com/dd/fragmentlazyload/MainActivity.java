package com.dd.fragmentlazyload;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private ViewPager mContent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContent = (ViewPager) findViewById(R.id.content);

		mContent.setOffscreenPageLimit(5);//设置为全部预加载

		List<Fragment> listData = new ArrayList<>();
		FragmentOne one = new FragmentOne();
		FragmentTwo two = new FragmentTwo();
		FragmentThree three = new FragmentThree();
		FragmentFour four = new FragmentFour();
		FragmentFive five = new FragmentFive();
		listData.add(one);
		listData.add(two);
		listData.add(three);
		listData.add(four);
		listData.add(five);
//		ContentAdapter adapter = new ContentAdapter(getSupportFragmentManager(), listData);
//		mContent.setAdapter(adapter);

		ContentAdapter adapter1 = new ContentAdapter(getSupportFragmentManager());
		mContent.setAdapter(adapter1);
		adapter1.setListData(listData);
	}
}
