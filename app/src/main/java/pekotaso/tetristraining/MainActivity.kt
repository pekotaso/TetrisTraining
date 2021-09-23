package pekotaso.tetristraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {

    var graphic: Graphic? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        graphic = Graphic(this)
        setContentView(graphic!!)
    }

    // タップを検知 タップされた場所によって移動方向を決定
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                val x = event.getX()
                val y = event.getY()
                if (x <= FIELDSTARTX) {
                    graphic?.updateBlockPos(-BLOCKSPACE, 0)
                } else if (x >= FIELDSTARTX+FIELDWIDTH) {
                    graphic?.updateBlockPos(BLOCKSPACE, 0)
                } else if (y >= FIELDSTARTY+ FIELDHEIGHT) {
                    graphic?.updateBlockPos(0, BLOCKSPACE)
                }
            }
        }
        return true
    }
}
