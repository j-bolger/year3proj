package jb.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {

    private Button hButtonSearch;
    private Button hButtonSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void search(View view){
        Intent in = new Intent(this,SearchActivity.class);
        startActivity(in);
    }
    public void settings(View view){
        Intent in = new Intent(this,SettingsActivity.class);
        startActivity(in);
    }
}
