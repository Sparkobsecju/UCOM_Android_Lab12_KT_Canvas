package com.example.lab12_kt

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView(context: Context, attributeView: AttributeSet?, defaultStyle: Int) : View(context) {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attributeView: AttributeSet?) : this(context, attributeView, 0)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paintBackground(canvas)
        paintCircle(canvas)
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
