package com.example.lab12_kt

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class MyView(context: MainActivity): View(context) {
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
