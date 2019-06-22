package com.berkanaslan.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Global Variables
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);

        new CountDownTimer(10000, 1000) {

            @Override
            public void onTick(long l) {
                textView.setText("Left:"+l/1000);
                /* /1000 is mean for show second */
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_LONG).show();
                textView.setText("Finished!");
            }
        }.start();

    }


}
