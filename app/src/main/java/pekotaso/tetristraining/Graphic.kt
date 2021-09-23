package pekotaso.tetristraining

import android.content.Context
import android.graphics.*
import android.view.View
import java.util.*

class Graphic(context: Context): View(context) {
    private var paint: Paint = Paint()
    val block = Block(BlockTypeA)
    var blockSleepCnt = 0

    override fun onDraw(canvas: Canvas) {

        // ブロックを表示
        drawBlock(canvas)

        // フィールドを表示
        drawField(canvas)

        reDraw()
    }

    private fun reDraw() {
        invalidate()
    }

    private fun drawBlock(canvas: Canvas) {
        blockSleepCnt += 1
        if (blockSleepCnt > BLOCKDOWNCNT) {
            updateBlockPos(0, BLOCKSPACE)
            blockSleepCnt = 0
        }
        block.draw(canvas)
    }

    fun updateBlockPos(x: Int, y: Int) {
        block.updatePos(x,y)

    }

    private fun drawField(canvas: Canvas) {
        val field = Field()
        field.draw(canvas, context)
    }
}