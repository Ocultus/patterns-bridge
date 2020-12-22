class Orange: Color {
    override fun getStringCode(): String {
        return "#ffa500"
    }

    override fun getNumberCode(): IntArray {
        return intArrayOf(255,165,0)
    }
}