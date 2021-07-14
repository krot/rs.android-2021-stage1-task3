package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        return decomposer(number.toLong(), number.toLong() * number)?.dropLast(1)?.toTypedArray()
    }

    private fun decomposer(n: Long, remain: Long): MutableList<Int>? {
        if (remain == 0L) return mutableListOf(n.toInt())

        for (i in n - 1 downTo 1) {
            if (remain - i * i >= 0)
                decomposer(i, remain - i * i)?.apply {
                    add(n.toInt())
                    return this
                }
        }
        return null
    }
}
