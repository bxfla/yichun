package com.hy.powerplatform;


import com.hy.powerplatform.login.bean.Login;
import com.hy.powerplatform.login.bean.Version;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * @author: Allen.
 * @date: 2018/7/25
 * @description:
 */

public interface AllApi {

    /**
     * 登录
     */
    @FormUrlEncoded
    @POST(ApiAddress.userLogin)
    Observable<Login> userLogin(@Field("username") String username, @Field("password") String password, @Field("clientid") String clientid);

    /**
     * 获取版本
     */
    @GET(ApiAddress.version)
    Observable<Version> getVersion();
}
