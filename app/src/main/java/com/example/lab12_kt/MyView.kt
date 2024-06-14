package com.example.lab12_kt

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class MyView(context: Context, attributeView: AttributeSet?, defaultStyle: Int) : View(context) {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attributeView: AttributeSet?) : this(context, attributeView, 0)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paintBackground(canvas)
//        paintCircle(canvas)
//        paintOval(canvas)
        paintLine(canvas)
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
        paint.color = Color.RED
        paint.isAntiAlias = true // 抗鋸齒
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
