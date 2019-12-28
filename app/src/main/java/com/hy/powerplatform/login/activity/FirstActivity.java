package com.hy.powerplatform.login.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.hy.powerplatform.R;
import com.hy.powerplatform.http.views.StatusBarUtils;


public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        new StatusBarUtils().setWindowStatusBarColor(FirstActivity.this, R.color.white);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                //你需要跳转的地方的代码
                Intent intent=new Intent(FirstActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); //延迟2秒跳转
    }
}
