package com.bw.gaoxiangping201704101502m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/4/10.
 */

public class CuostomView extends View {

    private Paint paint;
    private float j=270;

    public CuostomView(Context context) {
        super(context);
    }

    public CuostomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();

    }

    public CuostomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float w = getWidth() / 2;
        float h = getHeight() / 2;
        float r = 150;
        int i = 80;

        paint.setAntiAlias(true);
        paint.setStrokeWidth(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawCircle(w, h, r, paint);

        paint.setColor(Color.BLUE);

        RectF rectF = new RectF();
        rectF.set(w - (r), h - (r), w + (r), h + (r));

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i);
        paint.setColor(Color.BLUE);

        canvas.drawArc(rectF, 0, j, false, paint);

        paint.setTextSize(60);
        paint.setStyle(Paint.Style.FILL);
        int num = 78;
        String text = num + "%";
        //得到矩形对象
        Rect bounds = new Rect();
        //测量文本的宽，高
        paint.getTextBounds(text, 0, text.length(), bounds);
        //画出文本，让文本居中
        canvas.drawText(text, getMeasuredWidth() / 2 - bounds.width() / 2,

                getMeasuredHeight() / 2 + bounds.height() / 2, paint);


    }



    public void setListener(float j) {

        this.j = j;
    }
}
