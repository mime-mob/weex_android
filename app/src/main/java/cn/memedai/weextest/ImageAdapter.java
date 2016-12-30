package cn.memedai.weextest;

import android.widget.ImageView;

import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

/**
 * <p>weex的图片加载是可以通过native的方式去实现的，以提高效率
 *  可以通过ImageLoader ，Fresco，Glide 等实现图片加载
 *
 * @author fengwl
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class ImageAdapter implements IWXImgLoaderAdapter {
    @Override
    public void setImage(String url, ImageView view, WXImageQuality quality, WXImageStrategy strategy) {
        // 实现图片加载
    }
}
