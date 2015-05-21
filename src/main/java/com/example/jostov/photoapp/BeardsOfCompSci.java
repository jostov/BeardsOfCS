package com.example.jostov.photoapp;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BeardsOfCompSci extends Activity{
    int i = 2;
    int[] imageID = {   R.drawable.download,
                        R.drawable.gosling,
                        R.drawable.grace,
                        R.drawable.kernighan,
                        R.drawable.ritchie
                    };
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gallery);
        iv = (ImageView) findViewById(R.id.image);
        iv.setImageResource(imageID[i]);
    }
    protected void reelManager(boolean tf){
        i = (tf)?(i+1)%5:(i==0)?4:i-1;
        iv.setImageResource(imageID[i]);
    }
    public void advance(View v){reelManager(true);}
    public void rewind(View v){reelManager(false);}
}
