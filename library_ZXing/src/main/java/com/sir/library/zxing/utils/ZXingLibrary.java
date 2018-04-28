package com.sir.library.zxing.utils;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by zhuyinan on 2016/6/20.
 * Contact by 445181052@qq.com
 */
public class ZXingLibrary {
    public static void initDisplayOpinion(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        DisplayUtil.density = dm.density;
        DisplayUtil.densityDPI = dm.densityDpi;
        DisplayUtil.screenWidthPx = dm.widthPixels;
        DisplayUtil.screenhightPx = dm.heightPixels;
        DisplayUtil.screenWidthDip = DisplayUtil.px2dip(context, dm.widthPixels);
        DisplayUtil.screenHightDip = DisplayUtil.px2dip(context, dm.heightPixels);
    }
}
