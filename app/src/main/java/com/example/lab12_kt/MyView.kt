package com.example.lab12_kt

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class MyView(context: Context, attributeSet: AttributeSet?, defaultStyle: Int) :
    View(context, attributeSet, defaultStyle) {

    constructor(context: Context) : this(context, null, 0)
    constructor(context: Context, attributeSet: AttributeSet?) : this(context, attributeSet, 0)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paintBackground(canvas)
        //paintCircle(canvas)
        //paintOval(canvas)
        //paintLine(canvas)
        //paintPath(canvas)
        paintPath2(canvas)
    }

    private fun paintPath2(canvas: Canvas) {

        for (i in 0..40) {
            val paint = Paint()
            paint.style = Paint.Style.STROKE
            paint.color = Color.argb(255, 255 - 6 * i, 0, 0 + 6 * i)
            paint.strokeWidth = 8f
            val path = Path()
            path.moveTo(100f, 100f)
            path.quadTo(550f, -100f + 50 * i, 1000f, 100f)
            canvas.drawPath(path, paint)
        }
    }

    private fun paintPath(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 8f
        val path = Path()
        path.moveTo(100f, 100f)
        path.lineTo(100f, 500f)
        path.lineTo(500f, 500f)
        //path.close()
        canvas.drawPath(path, paint)

    }

    private fun paintLine(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        paint.strokeWidth = 30f
        paint.strokeCap = Paint.Cap.BUTT
        canvas.drawLine(100f, 100f, 100f, 500f, paint)
        canvas.drawLine(100f, 100f, 500f, 100f, paint)
        paint.strokeCap = Paint.Cap.SQUARE
        canvas.drawLine(150f, 150f, 150f, 550f, paint)
        canvas.drawLine(150f, 150f, 550f, 150f, paint)
        paint.strokeCap = Paint.Cap.ROUND
        canvas.drawLine(200f, 200f, 200f, 600f, paint)
        canvas.drawLine(200f, 200f, 600f, 200f, paint)

    }

    private fun paintOval(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        val rectF: RectF = RectF(50f, 50f, 1050f, 500f)
        canvas.drawOval(rectF, paint)
        paint.color = Color.BLUE
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 10f
        val rectF2: RectF = RectF(50f, 350f, 1050f, 800f)
        canvas.drawArc(rectF2, 0f, 90f, true, paint)
        val rectF3: RectF = RectF(50f, 550f, 1050f, 1000f)
        canvas.drawArc(rectF3, 90f, 90f, false, paint)

    }

    private fun paintCircle(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        paint.isAntiAlias = true
        canvas.drawCircle(300f, 300f, 200f, paint)
        paint.color = Color.BLUE
        paint.isAntiAlias = false
        canvas.drawCircle(400f, 400f, 200f, paint)

    }

    private fun paintBackground(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        canvas.drawPaint(paint)
    }
}