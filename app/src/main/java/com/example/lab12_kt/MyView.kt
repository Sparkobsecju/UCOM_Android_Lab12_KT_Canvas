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
    }

    private fun paintBackground(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        canvas.drawPaint(paint)
    }
}
