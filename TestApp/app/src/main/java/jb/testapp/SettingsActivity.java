package jb.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private Button seButtonHome;
    private Button seButtonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Intent in = getIntent();

    }

    public void search(View view){
        Intent in = new Intent(this,SearchActivity.class);
        startActivity(in);
    }
    public void home(View view){
        Intent in = new Intent(this,HomeActivity.class);
        startActivity(in);
    }
}
