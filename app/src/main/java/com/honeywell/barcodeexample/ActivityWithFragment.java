package com.honeywell.barcodeexample;

import android.os.Bundle;
import android.app.Activity;

public class ActivityWithFragment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_fragment);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
