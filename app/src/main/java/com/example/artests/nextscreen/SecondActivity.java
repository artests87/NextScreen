package com.example.artests.nextscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name;
        String description;
        String sendler;
        name=getIntent().getStringExtra(getResources().getString(R.string.text_whom_string));
        description=getIntent().getStringExtra(getResources().getString(R.string.text_description_string));
        sendler=getIntent().getStringExtra(getResources().getString(R.string.username_send));
        TextView textViewReceiver=(TextView)findViewById(R.id.textViewReceive);
        String textReceived=getResources().getString(R.string.text_received);
        textViewReceiver.setText(name+textReceived+description+getResources().getString(R.string.text_sendler)+sendler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
