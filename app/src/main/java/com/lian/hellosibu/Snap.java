package com.lian.hellosibu;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Snap extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap);
    }
    public void ClickBack(View view) {
        startActivity(new Intent("com.lian.hellosibu.MainActivity"));
    }
}
