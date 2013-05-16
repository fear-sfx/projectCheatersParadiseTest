package com.fearsfx.cheatersParadise.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.ImageView;

import com.fearsfx.cheatersParadise.MainActivity;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	private ImageView bground, about, browse, post;

	public MainActivityTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		bground = (ImageView) activity
				.findViewById(com.fearsfx.cheatersParadise.R.id.background_main);
	}

	public void testAbout() {
		about = (ImageView) activity
				.findViewById(com.fearsfx.cheatersParadise.R.id.about);
		assertNotNull(about);
	}

	public void testBrowse() {
		browse = (ImageView) activity
				.findViewById(com.fearsfx.cheatersParadise.R.id.browse);
		assertNotNull(browse);
	}

	public void testPost() {
		post = (ImageView) activity.findViewById(com.fearsfx.cheatersParadise.R.id.post);
		assertNotNull(post);
	}

	public void testViewsCreated() {
		assertNotNull(getActivity());
		assertNotNull(bground);
	}

	public void testViewsVisible() {
		ViewAsserts.assertOnScreen(bground.getRootView(), bground);
		ViewAsserts.assertOnScreen(about.getId(), com.fearsfx.cheatersParadise.R.id.about);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
