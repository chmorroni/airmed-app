//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.3.1.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package com.ti.smartconfig;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.ti.smartconfig.utils.MDnsHelper_;
import com.ti.smartconfig.utils.Popup.PopUpCallback;
import com.ti.smartconfig.utils.Popup.PopupType;
import com.ti.smartconfig.utils.SharedPreferencesInterface_;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.UiThreadExecutor;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.builder.PostActivityStarter;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

@SuppressLint({
    "NewApi"
})
public final class MainActivity_
    extends MainActivity
    implements HasViews, OnViewChangedListener
{
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(com.ti.smartconfig.R.layout.activity_main);
    }

    @Override
    public<T extends View> T internalFindViewById(int id) {
        return ((T) this.findViewById(id));
    }

    private void init_(Bundle savedInstanceState) {
        this.prefs = new SharedPreferencesInterface_(this);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        this.mDnsHelper = MDnsHelper_.getInstance_(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MainActivity_.IntentBuilder_ intent(Context context) {
        return new MainActivity_.IntentBuilder_(context);
    }

    public static MainActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MainActivity_.IntentBuilder_(fragment);
    }

    public static MainActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MainActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        this.tabhost = hasViews.internalFindViewById(R.id.tabhost);
        this.real_tab_content = hasViews.internalFindViewById(com.ti.smartconfig.R.id.real_tab_content);
        this.tabs = hasViews.internalFindViewById(R.id.tabs);
        afterViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(com.ti.smartconfig.R.menu.activity_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case  47 :
            {
                MainActivity_.this.onSettingsResult(resultCode, data);
                break;
            }
        }
    }

    @Override
    public void showSuccessDialog(final String mainText, final String leftButtonText, final String rightButtonText, final PopupType popupType, final PopUpCallback callback, final String headline) {
        UiThreadExecutor.runTask("", new Runnable() {

            @Override
            public void run() {
                MainActivity_.super.showSuccessDialog(mainText, leftButtonText, rightButtonText, popupType, callback, headline);
            }
        }
        , 0L);
    }

    @Override
    public void showTimeoutPopup(final WifiConfiguration configuration, final WifiManager wifiManager) {
        UiThreadExecutor.runTask("", new Runnable() {

            @Override
            public void run() {
                MainActivity_.super.showTimeoutPopup(configuration, wifiManager);
            }
        }
        , 0L);
    }

    @Override
    public void show3GDialog() {
        UiThreadExecutor.runTask("", new Runnable() {

            @Override
            public void run() {
                MainActivity_.super.show3GDialog();
            }
        }
        , 0L);
    }

    @Override
    void showToastWithMessage(final String msg) {
        UiThreadExecutor.runTask("", new Runnable() {

            @Override
            public void run() {
                MainActivity_.super.showToastWithMessage(msg);
            }
        }
        , 0L);
    }

    @Override
    public void scanForDevices() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0L, "") {

            @Override
            public void execute() {
                try {
                    MainActivity_.super.scanForDevices();
                } catch (final Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }
        }
        );
    }

    @Override
    public void stopScanning() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0L, "") {

            @Override
            public void execute() {
                try {
                    MainActivity_.super.stopScanning();
                } catch (final Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }
        }
        );
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MainActivity_.IntentBuilder_>
    {
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MainActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MainActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MainActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public PostActivityStarter startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode, lastOptions);
                } else {
                    if (context instanceof Activity) {
                        Activity activity = ((Activity) context);
                        ActivityCompat.startActivityForResult(activity, intent, requestCode, lastOptions);
                    } else {
                        context.startActivity(intent, lastOptions);
                    }
                }
            }
            return new PostActivityStarter(context);
        }
    }
}
