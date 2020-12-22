class Circle(private val radius:Double): Type {
    override fun getSquare(): Double {
        return Math.PI * radius * radius;
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius;
    }
}