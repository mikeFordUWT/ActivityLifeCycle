package edu.uw.tacoma.mmuppa.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Main2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
