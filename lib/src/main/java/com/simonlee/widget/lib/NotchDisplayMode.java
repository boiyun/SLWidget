package com.simonlee.widget.lib;

import android.os.Build;
import android.support.annotation.IntDef;
import android.support.annotation.RequiresApi;
import android.view.WindowManager;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.simonlee.widget.lib.NotchDisplayMode.MODE_DEFAULT;
import static com.simonlee.widget.lib.NotchDisplayMode.MODE_SHORT_EDGES;
import static com.simonlee.widget.lib.NotchDisplayMode.MODE_NEVER;

/**
 * @author Simon Lee
 * @e-mail jmlixiaomeng@163.com
 * @github https://github.com/Simon-Leeeeeeeee/SLWidget
 * @createdTime 2020/7/19
 */

@RequiresApi(api = Build.VERSION_CODES.P)
@IntDef({MODE_DEFAULT, MODE_SHORT_EDGES, MODE_NEVER})
@Retention(RetentionPolicy.SOURCE)
public @interface NotchDisplayMode {

    /**
     * 默认：非全屏可使用凹槽区域，全屏不可使用
     */
    int MODE_DEFAULT = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT;

    /**
     * 适配异形屏：全屏/非全屏均可使用凹槽区域
     */
    int MODE_SHORT_EDGES = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

    /**
     * 不适配异形屏：不可使用凹槽区域
     */
    int MODE_NEVER = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER;
}
