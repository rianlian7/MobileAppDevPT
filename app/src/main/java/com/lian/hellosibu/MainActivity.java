package com.lian.hellosibu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        startActivity(new Intent("com.lian.hellosibu.Snap"));
    }

    public void onClick2(View view) {
        startActivity(new Intent("com.lian.hellosibu.Speak"));
    }
    public void onClick3(View view) {
        startActivity(new Intent("com.lian.hellosibu.Send"));
    }
    public void onClick4(View view) {
        startActivity(new Intent("com.lian.hellosibu.Solve"));
    }
}
