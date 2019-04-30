//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.3.1.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package com.ti.smartconfig.utils;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.ti.smartconfig.R;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 */
@SuppressWarnings("unused")
public final class Popup_
    extends Popup
    implements HasViews, OnViewChangedListener
{
    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public Popup_(Context context) {
        super(context);
        init_();
    }

    public static Popup build(Context context) {
        Popup_ instance = new Popup_(context);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The alreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <code>&lt;merge /&gt;</code> tag.
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), R.layout.popup_layout, this);
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
    public<T extends View> T internalFindViewById(int id) {
        return ((T) this.findViewById(id));
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        this.popup_leftButton_text = hasViews.internalFindViewById(R.id.popup_leftButton_text);
        this.popup_rightButton_text = hasViews.internalFindViewById(R.id.popup_rightButton_text);
        this.popup_right_button_layout = hasViews.internalFindViewById(R.id.popup_right_button_layout);
        this.popup_text = hasViews.internalFindViewById(R.id.popup_text);
        this.popup_text_headline = hasViews.internalFindViewById(R.id.popup_text_headline);
        this.popup_status_image = hasViews.internalFindViewById(R.id.popup_status_image);
        this.popup_buttons_layout = hasViews.internalFindViewById(R.id.popup_buttons_layout);
        View view_popup_leftButton = hasViews.internalFindViewById(R.id.popup_leftButton);

        if (view_popup_leftButton!= null) {
            view_popup_leftButton.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Popup_.this.popup_leftButton();
                }
            }
            );
        }
        if (this.popup_rightButton_text!= null) {
            this.popup_rightButton_text.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Popup_.this.popup_rightButton_text();
                }
            }
            );
        }
        afterViews();
    }
}