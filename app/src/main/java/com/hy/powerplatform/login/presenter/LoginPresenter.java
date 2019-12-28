package com.hy.powerplatform.login.presenter;

import android.content.Context;

import com.hy.powerplatform.http.base.BaseObserverNoEntry;
import com.hy.powerplatform.http.utils.MainUtil;
import com.hy.powerplatform.http.utils.RetrofitUtil;
import com.hy.powerplatform.login.bean.Login;
import com.hy.powerplatform.login.module.LoginContract;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * @author: Allen.
 * @date: 2018/7/25
 * @description:
 */

public class LoginPresenter implements LoginContract.presenter {

    private Context context;
    private LoginContract.View view;

    public LoginPresenter(Context context, LoginContract.View view) {
        this.context = context;
        this.view = view;
    }

    /**
     * 登录
     *
     * @param userName
     * @param passWord
     */
    @Override
    public void getLogin(String userName, String passWord, String cid) {
        RetrofitUtil.getInstance().initRetrofitGetSession().userLogin(userName, passWord, "")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserverNoEntry<Login>(context, MainUtil.loadLogin) {
                    @Override
                    protected void onSuccees(Login t) throws Exception {
                        if (t.isSuccess()) {
                            view.setLogin(t);
                        } else {
                            view.setLoginMessage("error:" + "登陆失败");
                        }
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        view.setLoginMessage("失败了----->" + e.getMessage());
                    }
                });
    }
}
