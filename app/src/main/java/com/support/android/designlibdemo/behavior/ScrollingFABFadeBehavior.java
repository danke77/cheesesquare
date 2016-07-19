package com.support.android.designlibdemo.behavior;

import android.content.Context;
import android.util.AttributeSet;

import com.support.android.designlibdemo.R;

/**
 * @author danke (https://github.com/danke77)
 * @date 16/7/9
 */
public class ScrollingFABFadeBehavior extends AbsScrollingFABBehavior {

    public ScrollingFABFadeBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getFABHideAnimationRes() {
        return R.anim.behavior_fade_out;
    }

    @Override
    protected int getFABShowAnimationRes() {
        return R.anim.behavior_fade_in;
    }
}
