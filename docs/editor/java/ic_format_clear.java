package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_format_clear extends SVGRenderer {

    public ic_format_clear(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(3.27f, 5.0f);
        mPath.lineTo(2.0f, 6.27f);
        mPath.rLineTo(6.97f, 6.97f);
        mPath.lineTo(6.5f, 19.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(1.57f, -3.66f);
        mPath.lineTo(16.73f, 21.0f);
        mPath.lineTo(18.0f, 19.73f);
        mPath.lineTo(3.55f, 5.27f);
        mPath.lineTo(3.27f, 5.0f);
        mPath.close();
        mPath.moveTo(3.27f, 5.0f);
        mPath.moveTo(6.0f, 5.0f);
        mPath.rLineTo(0f, 0.18f);
        mPath.lineTo(8.82f, 8.0f);
        mPath.rLineTo(2.4f, 0f);
        mPath.rLineTo(-0.72f, 1.68f);
        mPath.rLineTo(2.1f, 2.1f);
        mPath.lineTo(14.21f, 8.0f);
        mPath.lineTo(20.0f, 8.0f);
        mPath.lineTo(20.0f, 5.0f);
        mPath.lineTo(6.0f, 5.0f);
        mPath.close();
        mPath.moveTo(6.0f, 5.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}