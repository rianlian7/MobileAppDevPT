package com.lian.hellosibu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Solve extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);
    }

    public void ClickBackSolve(View view) {
        startActivity(new Intent("com.lian.hellosibu.MainActivity"));
    }
}
