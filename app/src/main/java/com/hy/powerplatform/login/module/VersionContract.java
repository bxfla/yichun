package com.hy.powerplatform.login.module;

import com.hy.powerplatform.http.base.BaseDView;
import com.hy.powerplatform.http.base.BasePresenter;
import com.hy.powerplatform.login.bean.Version;


/**
 * @author: Allen.
 * @date: 2018/7/25
 * @description:
 */

public interface VersionContract {
    interface View extends BaseDView<presenter> {
        void setVersionMessage(String Message);
        void setVersion(Version login);
    }

    interface presenter extends BasePresenter {
        void getVersion();
    }
}
