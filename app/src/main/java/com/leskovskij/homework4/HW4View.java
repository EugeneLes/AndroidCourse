package com.leskovskij.homework4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import com.leskovskij.androidcourse.R;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Eugene on 02.08.2017.
 */

public class HW4View extends View {

    private Paint clockPaint = new Paint();
    private Paint textPaint = new Paint();
    RectF acrRectF = new RectF();
    int width;
    int height;
    int cx;// = getWidth()/2;
    int cy;// = getHeight()/2;

    public HW4View(Context context) {
        super(context);
        initialize();
    }

    public HW4View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public HW4View(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public HW4View(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }
    private void initialize(){
        clockPaint.setAntiAlias(true);
        int color = ContextCompat.getColor(getContext(), R.color.colorBlack);
        clockPaint.setColor(color);
        clockPaint.setStyle(Paint.Style.STROKE);
        Resources r = getResources();
        float strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2,r.getDisplayMetrics());
        clockPaint.setStrokeWidth(strokeWidthInPx);

        textPaint.setAntiAlias(true);
//        int color = ContextCompat.getColor(getContext(), R.color.colorBlack);
        textPaint.setColor(color);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setTextSize(100);
        //Resources r = getResources();
        strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2,r.getDisplayMetrics());
        textPaint.setStrokeWidth(strokeWidthInPx);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float strokeWidth = clockPaint.getStrokeWidth();
        super.onDraw(canvas);
        width = getWidth();
        height = getHeight();
        int side = Math.min(width,height);
        int radius = side/2-5;
        cx = side/2;
        cy = side/2;
        canvas.drawCircle(cx,cy,radius, clockPaint);
        canvas.drawCircle(cx,cy,radius/20, clockPaint);

        float side2_5prc = side/40;
        float side5prc = side/20;
        float side10prc = side/10;
        float side8prc = side/13;
        float startX = cx;
        float startY = 5;
        float stopX = startX;
        float stopY = side5prc;
        for (int i = 0; i < 60; i++) {
            if (i%5==0) {
                clockPaint.setStrokeWidth(strokeWidth);
            }else {
                clockPaint.setStrokeWidth(strokeWidth/3);
            }
            canvas.drawLine(startX, startY, stopX, stopY, clockPaint);
            canvas.rotate(6,cx,cy);
        }
        textPaint.setTextSize(side8prc);
        canvas.drawText("12",cx-side5prc,side5prc+side8prc,textPaint);
        canvas.drawText("3",side-side10prc,cy+side2_5prc,textPaint);
        canvas.drawText("6",cx-side2_5prc,side-side5prc,textPaint);
        canvas.drawText("9",side5prc,cy+side2_5prc,textPaint);
        Calendar cal = Calendar.getInstance();
        

        canvas.drawLine(cx,cy+side10prc,cx,side10prc,clockPaint);


//        acrRectF.left = 0;
//        acrRectF.top = 0;
//        acrRectF.right = getWidth();
//        acrRectF.bottom = getHeight();
//        clockPaint.setStyle(Paint.Style.FILL);
//        canvas.drawArc(acrRectF,0,90,true,clockPaint);
//
//        canvas.drawRect(500,50,100,100,clockPaint); //need to use separate Paint for changing style
//        //canvas.rotate(30,midX,midY); //for homework1
    }
}
