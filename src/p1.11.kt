class Matrix(
    private val data: Array<IntArray>,
    private val rows: Int,
    private val cols: Int
) {
    fun addMatrix(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Addition ke liye size same hona chahiye" }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }
    fun subtractMatrix(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Subtraction ke liye size same hona chahiye" }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }
    fun multiplyMatrix(other: Matrix): Matrix {
        require(cols == other.rows) { "Multiplication ke liye size compatible hona chahiye" }
        val result = Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, rows, other.cols)
    }
    override fun toString(): String {
        val builder = StringBuilder()
        for (i in 0 until rows) {
            builder.append("[ ")
            for (j in 0 until cols) {
                builder.append("${data[i][j]} ")
            }
            builder.append("]\n")
        }
        return builder.toString()
    }
}
fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("*************** MATRIX ADDITION ***************")
    println("Matrix 1:\n$secondMatrix1")
    println("Matrix 2:\n$secondMatrix")
    val addResult = secondMatrix1.addMatrix(secondMatrix)
    println("Result of Addition:\n$addResult")

    println("*************** MATRIX SUBTRACTION ***************")
    println("Matrix 1:\n$secondMatrix1")
    println("Matrix 2:\n$secondMatrix")
    val subResult = secondMatrix1.subtractMatrix(secondMatrix)
    println("Result of Subtraction:\n$subResult")

    println("*************** MATRIX MULTIPLICATION ***************")
    println("Matrix 1:\n$firstMatrix")
    println("Matrix 2:\n$secondMatrix")
    val mulResult = firstMatrix.multiplyMatrix(secondMatrix)
    println("Result of Multiplication:\n$mulResult")
}