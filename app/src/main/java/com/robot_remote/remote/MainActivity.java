package com.robot_remote.remote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bn=null;
    TextView tx=null;
    public RockView mRockerViewXY;
    private RockView.Direction HIdirrction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设置为横屏
        setContentView(R.layout.activity_main);//注意这里的执行顺序

        mRockerViewXY =findViewById(R.id.rockerXY_View);//8方向
        if(mRockerViewXY!=null) {
            mRockerViewXY.setOnShakeListener(RockView.DirectionMode.DIRECTION_8, new RockView.OnShakeListener() {
                @Override
                public void onStart() {
                }

                @Override
                public void direction(RockView.Direction direction) {
                    HIdirrction=direction;
                }

                @Override
                public void onFinish() {
                }
            });
        }
    }
}