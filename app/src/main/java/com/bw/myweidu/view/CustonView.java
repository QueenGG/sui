package com.bw.myweidu.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * _ヽ陌路离殇ゞ on 2018/11/6
 */
public class CustonView extends View {

    private int height;
    private int width;
    private int banheight;
    private  int banwight;

    public CustonView(Context context) {
        this(context,null);
    }

    public CustonView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        canvas.translate(banwight,banheight);
        paint.setColor(Color.BLUE);
        Rect rect = new Rect(-100,-100,100,100);
        canvas.drawRect(rect,paint);

        canvas.rotate(90);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        height = getMeasuredHeight();
        width = getMeasuredWidth();

        banheight=height/2;
        banwight=width/2;
    }
}
