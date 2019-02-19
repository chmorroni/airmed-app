//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.ti.smartconfig.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ti.smartconfig.R.id;
import com.ti.smartconfig.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class DevicePickPopUpView_
    extends DevicePickPopUpView
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    public DevicePickPopUpView_(Context context) {
        super(context);
        init_();
    }

    public static DevicePickPopUpView build(Context context) {
        DevicePickPopUpView_ instance = new DevicePickPopUpView_(context);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.device_pick_pop_up_view, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        pick_pop_up_list = ((ListView) hasViews.findViewById(id.pick_pop_up_list));
        scan_results_pop_up_pas_editText = ((EditText) hasViews.findViewById(id.scan_results_pop_up_pas_editText));
        pick_pop_up_buttons_ok_button = ((ImageView) hasViews.findViewById(id.pick_pop_up_buttons_ok_button));
        pick_pop_up_loader = ((ProgressBar) hasViews.findViewById(id.pick_pop_up_loader));
        scan_results_pop_up_password_layout = ((RelativeLayout) hasViews.findViewById(id.scan_results_pop_up_password_layout));
        scan_checkbox = ((CheckBox) hasViews.findViewById(id.scan_checkbox));
        pick_pop_up_buttons_rescan_button = ((ImageView) hasViews.findViewById(id.pick_pop_up_buttons_rescan_button));
        if (pick_pop_up_buttons_ok_button!= null) {
            pick_pop_up_buttons_ok_button.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    DevicePickPopUpView_.this.pick_pop_up_buttons_ok_button();
                }

            }
            );
        }
        if (pick_pop_up_buttons_rescan_button!= null) {
            pick_pop_up_buttons_rescan_button.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    DevicePickPopUpView_.this.pick_pop_up_buttons_rescan_button();
                }

            }
            );
        }
        afterViews();
    }

    @Override
    public void showToastWithMessage(final String msg) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                DevicePickPopUpView_.super.showToastWithMessage(msg);
            }

        }
        );
    }

    @Override
    public void startWifiScan() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                DevicePickPopUpView_.super.startWifiScan();
            }

        }
        );
    }

    @Override
    public void print(final String msg) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                DevicePickPopUpView_.super.print(msg);
            }

        }
        );
    }

    @Override
    public void checkForPasswordLayout(final String ssid) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                DevicePickPopUpView_.super.checkForPasswordLayout(ssid);
            }

        }
        );
    }

}