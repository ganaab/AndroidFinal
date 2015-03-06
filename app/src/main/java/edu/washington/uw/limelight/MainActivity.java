package edu.washington.uw.limelight;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.andrewgiang.textspritzer.lib.SpritzerTextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SpritzerTextView spritzerTV = (SpritzerTextView) findViewById(R.id.spritzTV);
        spritzerTV.setSpritzText("Ganaa Like Penis Flavored Ice Cream!!");

        final ImageView play = (ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView play = (ImageView) findViewById(R.id.play);
                if(play.getTag() == null || play.getTag().equals("start")) {
                    spritzerTV.play();
                    play.setImageResource(R.drawable.pausebutton);
                    play.setTag("stop");
                } else {
                    spritzerTV.pause();
                    play.setImageResource(R.drawable.playbutton);
                    play.setTag("start");
                }
            }
        });

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
}
