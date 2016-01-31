package com.nerdyworks.anuroop.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button submit = (Button) findViewById(R.id.submit);
        final TextView getName = (TextView) findViewById(R.id.getName);
        final TextView getNumber = (TextView) findViewById(R.id.getNumber);
        Storage store = new Storage();
        submit.setOnClickListener(
                //interface

                new Button.OnClickListener()
                {
                    //button0 data
                    public void onClick(View view){
                        Intent reviewScreen = new Intent(HomeScreen.this,Review.class);
                        reviewScreen.putExtra("name",getName.getText().toString());
                        reviewScreen.putExtra("number", getNumber.getText().toString());
                        String name = getName.getText().toString();
                        String number =  getNumber.getText().toString();
                        startActivity(reviewScreen);

                    }
                }
        );
    }
}
