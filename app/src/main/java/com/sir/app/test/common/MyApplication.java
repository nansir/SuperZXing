package com.sir.app.test.common;

import com.sir.app.base.BaseApplication;
import com.sir.app.zxing.utils.ZXingLibrary;

/**
 * Created by zhuyinan on 2018/3/7.
 * Contact by 445181052@qq.com
 */
public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(getApplicationContext());
    }
}
