
package com.example.zhouyu.thisbook.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.zhouyu.thisbook.R;

public class GuideActivity extends Activity {
    RelativeLayout guide_Layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        guide_Layout = (RelativeLayout)findViewById(R.id.activity_guide);


    }
}
