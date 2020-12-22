class Green: Color{
    override fun getStringCode(): String {
        return "#008000"
    }

    override fun getNumberCode(): IntArray {
        return intArrayOf(0,255,255)
    }
}