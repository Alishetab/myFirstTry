package com.example.mysecondtry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"حالت از سرگیری",Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(),"حالت توقف",Toast.LENGTH_LONG).show();
    }
     protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"حالت تخریب",Toast.LENGTH_SHORT).show();
        //I Love coding
    }
}
