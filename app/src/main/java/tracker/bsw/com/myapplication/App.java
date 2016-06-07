package tracker.bsw.com.myapplication;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by baishiwei on 2016/5/12.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
