package cn.memedai.weextest;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * <p>write the description
 *
 * @author fengwl
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class WXTestApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
