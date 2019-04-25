package com.mmc.lamandys.liba_datapick.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mmc.lamandys.liba_datapick.R;
import com.mmc.lamandys.liba_datapick.annotation.AutoCount;


public class MainActivity extends Activity implements View.OnClickListener {

    Button jumpButton;

    @Override
    @AutoCount
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jumpButton = findViewById(R.id.jumpButton);
        findViewById(R.id.jumpButton).setOnClickListener(this);
        findViewById(R.id.tabButton).setOnClickListener(this);
        findViewById(R.id.toolbarBotton).setOnClickListener(this);
        findViewById(R.id.radioBotton).setOnClickListener(this);
        findViewById(R.id.drawerBotton).setOnClickListener(this);
    }

    @Override
    @AutoCount
    public void onClick(View v) {
        if (v.getId() == R.id.jumpButton) {
            startActivity(new Intent(this, SecondActivity.class));
        } else if (v.getId() == R.id.tabButton) {
            startActivity(new Intent(this, TabActivity.class));
        } else if (v.getId() == R.id.toolbarBotton) {
            startActivity(new Intent(this, ToolBarActivity.class));
        } else if (v.getId() == R.id.radioBotton) {
            startActivity(new Intent(this, RadioActivity.class));
        } else if (v.getId() == R.id.drawerBotton) {
            startActivity(new Intent(this, DrawerActivity.class));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}













