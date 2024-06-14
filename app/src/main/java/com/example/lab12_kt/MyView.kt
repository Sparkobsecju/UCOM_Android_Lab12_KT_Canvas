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
        //canvas.translate(50f, 500f)
        //canvas.rotate(45f)
        canvas.rotate(90f, 600f, 600f)
        //canvas.scale(2.0f, 3.0f)
        paintCircle(canvas)
        paintOval(canvas)
        paintLine(canvas)
        paintPath(canvas)
        paintPath2(canvas)
        paintText(canvas)
    }

    companion object {
        const val TEXT =
            "Kotlin是一種在Java虛擬機上執行的靜態型別程式語言，它也可以被編譯成為JavaScript原始碼。它主要是由俄羅斯聖彼得堡的JetBrains開發團隊所發展出來的程式語言，其名稱來自於聖彼得堡附近的科特林島。[2]2012年1月，著名期刊《Dr. Dobb's Journal》中Kotlin被認定為該月的最佳語言。[3]雖然與Java語法並不相容，但在JVM環境中Kotlin被設計成可以和Java程式碼相互運作，並可以重複使用如Java集合框架等的現有Java參照的函式庫。Hathibelagal寫道，「如果你正在為Android開發尋找一種替代程式語言，那麼應該試下Kotlin。它很容易在Android專案中替代Java或者同Java一起使用。」"
    }

    private fun paintText(canvas: Canvas) {
        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        paint.textSize = 40f
        val path = Path()
        path.moveTo(50f, 50f)
        path.quadTo(1500f, -200f, 1000f, 2000f)
        canvas.drawTextOnPath(TEXT, path, 0f, 0f, paint)
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