package com.example.lab12_kt

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView(context: MainActivity, attributeView: AttributeSet?, defaultStyle: Int) : View(context) {

    constructor(context: MainActivity) : this(context, null)
    constructor(context: MainActivity, attributeView: AttributeSet?) : this(context, attributeView, 0)

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
