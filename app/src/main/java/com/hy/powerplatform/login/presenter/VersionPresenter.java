package com.hy.powerplatform.login.presenter;

import android.content.Context;

import com.hy.powerplatform.http.base.BaseObserverNoEntry;
import com.hy.powerplatform.http.utils.MainUtil;
import com.hy.powerplatform.http.utils.RetrofitUtil;
import com.hy.powerplatform.login.bean.Version;
import com.hy.powerplatform.login.module.VersionContract;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * @author: Allen.
 * @date: 2018/7/25
 * @description:
 */

public class VersionPresenter implements VersionContract.presenter {

    private Context context;
    private VersionContract.View view;

    public VersionPresenter(Context context, VersionContract.View view) {
        this.context = context;
        this.view = view;
    }

    /**
     * 获取版本
     *
     */
    @Override
    public void getVersion() {
        RetrofitUtil.getInstance().initRetrofitGetSession().getVersion()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserverNoEntry<Version>(context, MainUtil.loadLogin) {
                    @Override
                    protected void onSuccees(Version t) throws Exception {
                        if (t.isSuccess()) {
                            view.setVersion(t);
                        } else {
                            view.setVersionMessage("error:" + "获取版本号失败");
                        }
                    }

                    @Override
                    protected void onFailure(Throwable e, boolean isNetWorkError) throws Exception {
                        view.setVersionMessage("error:" + "获取版本号失败");
                    }
                });
    }
}
