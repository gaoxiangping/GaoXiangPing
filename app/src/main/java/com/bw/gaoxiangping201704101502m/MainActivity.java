package com.bw.gaoxiangping201704101502m;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Handler handler =new Handler(){
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        float i=20;
        cv.setListener(i++);
        handler.sendEmptyMessageDelayed(0,1000);
    }
};
    private CuostomView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv = (CuostomView) findViewById(R.id.custom_id);

        handler.sendEmptyMessageDelayed(1,1000);
    }
}
