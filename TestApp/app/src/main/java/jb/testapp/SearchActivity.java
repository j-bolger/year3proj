package jb.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    private Button sButtonHome;
    private Button sButtonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Intent in = getIntent();

    }

    public void home(View view){
        Intent in = new Intent(this,HomeActivity.class);
        startActivity(in);
    }
    public void settings(View view){
        Intent in = new Intent(this,SettingsActivity.class);
        startActivity(in);
    }
}
