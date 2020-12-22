class Square(private val side: Double) : Type {
    override fun getSquare(): Number {
        return side * side
    }

    override fun getPerimeter(): Number {
        return 4 * side
    }
}