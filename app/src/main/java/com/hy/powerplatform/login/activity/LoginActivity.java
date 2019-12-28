package com.hy.powerplatform.login.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.hy.powerplatform.R;
import com.hy.powerplatform.SharedPreferencesHelper;
import com.hy.powerplatform.http.base.AlertDialogUtil;
import com.hy.powerplatform.http.base.BaseActivity;
import com.hy.powerplatform.http.views.Header;
import com.hy.powerplatform.login.bean.Login;
import com.hy.powerplatform.login.module.LoginContract;
import com.hy.powerplatform.login.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View{
    @BindView(R.id.header)
    Header header;
    @BindView(R.id.tvHeard)
    TextView tvHeard;
    @BindView(R.id.et_LoginName)
    EditText etLoginName;
    @BindView(R.id.et_LoginPassword)
    EditText etLoginPassword;
    @BindView(R.id.btn_Login)
    Button btnLogin;
    @BindView(R.id.scrollView)
    ScrollView scrollView;

    private static boolean isExit = false;
    AlertDialogUtil alertDialogUtil;
    LoginPresenter loginPresenter;
    SharedPreferencesHelper sharedPreferencesHelper;
    String userName, userName1, userPassword, userPassword1, cid;

    //推出程序
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };

    //推出程序
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
//            alertDialogUtil.showDialog1("您确定要退出程序吗", new AlertDialogCallBack() {
//                @Override
//                public void select(String data) {
//
//                }
//
//                @Override
//                public void confirm() {
//                    finish();
//                }
//
//                @Override
//                public void cancel() {
//
//                }
//            });
            Toast.makeText(this, "再点一次退出程序", Toast.LENGTH_SHORT).show();
            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
            System.exit(0);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        sharedPreferencesHelper = new SharedPreferencesHelper(this, "login");
        loginPresenter = new LoginPresenter(this,this);
        alertDialogUtil = new AlertDialogUtil(this);
        userName = sharedPreferencesHelper.getData(this, "userName", "");
        userPassword = sharedPreferencesHelper.getData(this, "userPwd", "");
        cid = sharedPreferencesHelper.getData(this, "cid", "");
        Log.i("loginXXX", cid);
        if (!userName.isEmpty()) {
            etLoginName.setText(userName);
        }
        if (!userPassword.isEmpty()) {
            etLoginPassword.setText(userPassword);
        }
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    protected boolean isHasHeader() {
        return true;
    }

    @Override
    protected void rightClient() {

    }

    @OnClick(R.id.btn_Login)
    public void onViewClicked() {
        userName1 = etLoginName.getText().toString().trim();
        userPassword1 = etLoginPassword.getText().toString().trim();
        if (userName1.equals("") && userPassword1.equals("")) {
            alertDialogUtil.showSmallDialog("用户名和密码不能为空");
        }else {
            loginPresenter.getLogin(userName1,userPassword1,cid);
        }
    }

    @Override
    public void setLoginMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setLogin(Login login) {
        if (login.isSuccess()) {
            sharedPreferencesHelper.saveData(LoginActivity.this, "userName", userName1);
            sharedPreferencesHelper.saveData(LoginActivity.this, "userPwd", userPassword1);
//            String cookieString = connection.getHeaderField("Set-Cookie");
//            cookieString = cookieString.substring(0, cookieString.indexOf(";"));
//            sharedPreferencesHelper.saveData(LoginActivity.this, "session", cookieString);
            sharedPreferencesHelper.saveData(LoginActivity.this, "userCode", login.getUserCode());
            sharedPreferencesHelper.saveData(LoginActivity.this, "userStatus", login.getUsername());
            sharedPreferencesHelper.saveData(LoginActivity.this, "userId", login.getUserId());
            sharedPreferencesHelper.saveData(LoginActivity.this, "rolues", login.getRolues());
            sharedPreferencesHelper.saveData(LoginActivity.this, "rights", login.getRights());
            sharedPreferencesHelper.saveData(LoginActivity.this, "roleName", login.getRoleName());
            if (login.getSuperRoleName() != null) {
                sharedPreferencesHelper.saveData(LoginActivity.this, "superRoleName", login.getSuperRoleName());
            }
            if (login.getDepName() == null || login.getDepName().equals("null") || login.getDepName().equals("")) {
                sharedPreferencesHelper.saveData(LoginActivity.this, "depName", "宜春公交集团有限公司");
                sharedPreferencesHelper.saveData(LoginActivity.this, "depId", "378");
            } else {
                sharedPreferencesHelper.saveData(LoginActivity.this, "depName", login.getDepName());
                sharedPreferencesHelper.saveData(LoginActivity.this, "depId", login.getDepName());
            }
            sharedPreferencesHelper.saveData(LoginActivity.this, "myAge", login.getEmpprofile().getAge());
            sharedPreferencesHelper.saveData(LoginActivity.this, "mySex", login.getEmpprofile().getSex());
            sharedPreferencesHelper.saveData(LoginActivity.this, "myMobile", login.getEmpprofile().getMobile());
            sharedPreferencesHelper.saveData(LoginActivity.this, "myIcCard",login.getEmpprofile().getIdCard());
            sharedPreferencesHelper.saveData(LoginActivity.this, "myAddress", login.getEmpprofile().getAddress());

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
        }
    }
}
