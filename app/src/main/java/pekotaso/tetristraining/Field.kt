package pekotaso.tetristraining

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Point
import android.view.WindowManager

// フィールドに関する処理を行うクラス
class Field {
    private var paint: Paint = Paint()
    fun draw(canvas: Canvas, context: Context) {

//        val wm: WindowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
//        val disp = wm.defaultDisplay
//        disp.getSize(size)
//        val size = Point()

        val startX = FIELDSTARTX
        val startY = FIELDSTARTY
        val height = FIELDHEIGHT
        val width = FIELDWIDTH
        val sqSize = SQUARESIZE
        for (i in 0..height/sqSize) {
            paint.style = Paint.Style.STROKE
            paint.color = Color.argb(255, 190,200,255)
            paint.strokeWidth = 10f
            canvas.drawLine(startX, startY+i*sqSize,startX+width,startY+i*sqSize, paint)

        }

        for (i in 0..width/sqSize) {
            paint.style = Paint.Style.STROKE
            paint.color = Color.argb(255, 190,200,255)
            paint.strokeWidth = 10f
            canvas.drawLine(startX+i*sqSize, startY,startX+i*sqSize,startY+height, paint)
        }
    }
}