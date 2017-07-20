package com.example.abc.trans;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;




public class MainActivity extends AppCompatActivity {
    ViewGroup vipullayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      

        setContentView(R.layout.activity_main);
        vipullayout = (RelativeLayout) findViewById(R.id.vipullayout);
        vipullayout.setOnTouchListener(
                        new RelativeLayout.OnTouchListener(){
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {
                                 moveButton();
                                return true;
                            }
                        }

        );


    }
    public  void moveButton(){
        View vipulbutton = findViewById(R.id.vipulbutton);
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT );
         positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM ,RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        vipulbutton.setLayoutParams(positionRules);
        ViewGroup.LayoutParams sizeRules = vipulbutton.getLayoutParams();
        sizeRules.width= 450;
        sizeRules.height= 400;
        vipulbutton.setLayoutParams(sizeRules);
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
