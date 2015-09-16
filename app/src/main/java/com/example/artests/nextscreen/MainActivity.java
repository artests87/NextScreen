package com.example.artests.nextscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.button);
        Button button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()) {
            case R.id.button:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                break;
            case R.id.button3:
                EditText editTextName=(EditText)findViewById(R.id.editTextName);
                EditText editTextDescription=(EditText)findViewById(R.id.editTextDescription);
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(getResources().getString(R.string.text_whom_string),editTextName.getText().toString());
                intent.putExtra(getResources().getString(R.string.text_description_string), editTextDescription.getText().toString());
                break;
        }
        startActivity(intent);

    }
}
