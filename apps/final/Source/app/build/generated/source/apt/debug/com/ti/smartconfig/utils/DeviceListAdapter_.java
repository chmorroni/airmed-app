//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.3.1.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package com.ti.smartconfig.utils;

import android.content.Context;

public final class DeviceListAdapter_
    extends DeviceListAdapter
{
    private Context context_;

    private DeviceListAdapter_(Context context) {
        context_ = context;
        init_();
    }

    public static DeviceListAdapter_ getInstance_(Context context) {
        return new DeviceListAdapter_(context);
    }

    private void init_() {
        this.prefs = new SharedPreferencesInterface_(context_);
        this.context = context_;
        initAdapter();
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }
}