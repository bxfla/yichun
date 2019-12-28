package com.hy.powerplatform.login.module;

import com.hy.powerplatform.http.base.BaseDView;
import com.hy.powerplatform.http.base.BasePresenter;
import com.hy.powerplatform.login.bean.Login;


/**
 * @author: Allen.
 * @date: 2018/7/25
 * @description:
 */

public interface LoginContract {
    interface View extends BaseDView<presenter> {
        void setLoginMessage(String Message);
        void setLogin(Login login);
    }

    interface presenter extends BasePresenter {
        void getLogin(String userName,String passWord,String cid);
    }
}
