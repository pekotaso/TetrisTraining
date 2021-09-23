package pekotaso.tetristraining

/**
 * Block
 */
// 四角形のサイズ
val BLOCKSIZE = 80
// 間隔
val BLOCKSPACE = 20+BLOCKSIZE
// ブロックの表示開始位置 x
val BLOCKSTARTX = 210
// ブロックの表示開始位置 y
val BLOCKSTARTY = 210

/**
 * Field
 */
// 表示開始位置
val FIELDSTARTX = 200f
// 表示開始位置
val FIELDSTARTY = 300f
// フィールドの高さ
val FIELDHEIGHT = 1000
// フィールドの幅
val FIELDWIDTH = 700
//  フィールドのマスの大きさ
val SQUARESIZE = 100

// ブロックの落下速度
val BLOCKDOWNCNT = 50

// 表示開始位置からのオフセットを配列で持つ
val BlockTypeA = arrayOf(
        intArrayOf(0,0),
        intArrayOf(BLOCKSPACE,0),
        intArrayOf(BLOCKSPACE*2,0),
        intArrayOf(0,-BLOCKSPACE)
)

val BlockTypeB = arrayOf(
        intArrayOf(0,0),
        intArrayOf(BLOCKSPACE,0),
        intArrayOf(BLOCKSPACE*2,0),
        intArrayOf(BLOCKSPACE*3,0)
)

val BlockTypeC = arrayOf(
        intArrayOf(0,0),
        intArrayOf(BLOCKSPACE,0),
        intArrayOf(BLOCKSPACE*2,0),
        intArrayOf(BLOCKSPACE,-BLOCKSPACE)
)

val BlockTypeD = arrayOf(
        intArrayOf(0,0),
        intArrayOf(BLOCKSPACE,0),
        intArrayOf(BLOCKSPACE,-BLOCKSPACE),
        intArrayOf(0,-BLOCKSPACE)
)
