package subtask1

class Combinator {

    private fun calc(n: Int, k: Int): Int {
        return if (n / 2 >= k) {
            (factorial(n, n - k + 1) / factorial(k)).toInt()
        } else {
            (factorial(n, k + 1) / factorial(n - k)).toInt()
        }
    }

    private fun factorial(number: Int, start: Int = 1): Long {
        var num = start.toLong()
        for (i in start + 1..number) {
            num *= i
        }
        return num
    }

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for (i in 1..array[1]) {
            if (calc(array[1], i) == array[0]) {
                return i
            }
        }
        return null
    }
}
