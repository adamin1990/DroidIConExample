package com.lt.adamin.droidiconexample;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.thedazzler.droidicon.badges.DroidiconBadge;
import com.thedazzler.droidicon.badges.IconicFontDrawable;


public class MainActivity extends ActionBarActivity {
     private View iconbage;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iconbage= (View) findViewById(R.id.testicon);
        IconicFontDrawable iconicFontDrawable=new IconicFontDrawable(this.getApplicationContext());
        iconicFontDrawable.setIcon("gmd-vertical-align-top");
        iconicFontDrawable.setIconColor(getResources().getColor(R.color.red));
  iconbage.setBackground(iconicFontDrawable);
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
