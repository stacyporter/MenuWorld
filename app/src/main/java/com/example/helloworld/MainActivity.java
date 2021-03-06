package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView greetingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingView = (TextView) findViewById(R.id.greeting);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_bye) {
            greetingView.setText(R.string.bye);
            return true;
        }
        else if (item.getItemId() == R.id.action_rock) {
            greetingView.setText(R.string.rock);
            return true;
        }
        else if (item.getItemId() == R.id.action_block) {
            greetingView.setText(R.string.block);
            return true;
        }
        else if (item.getItemId() == R.id.action_knock) {
            greetingView.setText(R.string.knock);
            return true;
        }
        else if (item.getItemId() == R.id.action_miles) {
            greetingView.setText(R.string.miles);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
