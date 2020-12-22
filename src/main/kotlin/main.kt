fun main() {
    val greenTrapezoid = Figure(Green(),Trapezoid(2.0, 3.0, 4.0, 5.0))
    val orangeCircle = Figure(Orange(), Circle(20.0))
    println("Trapezoid square: " + greenTrapezoid.type.getSquare())
    println("Orange code: " + orangeCircle.color.getStringCode())
}