package org.zakariya.stickyheadersapp.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import org.zakariya.stickyheadersapp.adapters.SimpleDemoAdapter;

/**
 * Created by shamyl on 7/9/16.
 */
public class EndlessScrollDemoActivity extends DemoActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setAdapter(new SimpleDemoAdapter(5, 5, false, false, false));
	}
}
