package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val res: MutableList<String> = mutableListOf()

        val neighbours = mapOf(
            '1' to arrayOf("2","4"),
            '2' to arrayOf("1","3","5"),
            '3' to arrayOf("2","6"),
            '4' to arrayOf("1","5","7"),
            '5' to arrayOf("2","4","6","8"),
            '6' to arrayOf("3","5","9"),
            '7' to arrayOf("4","8"),
            '8' to arrayOf("5","7","9","0"),
            '9' to arrayOf("6","8"),
            '0' to arrayOf("8")
        )

        for (i in number.indices) {
            val list = neighbours[number[i]]
            if (list != null) {
                for (ch in list) {
                    res.add(number.substring(0, i) + ch + number.substring(i + 1))
                }
            } else {
                return null
            }
        }

        return res.toTypedArray()
    }
}
