import kotlin.math.sqrt

class Trapezoid(private val a:Double, private val b:Double, private val c:Double, private val d: Double): Type {
    override fun getSquare(): Number {
        return (a + b)/2 * sqrt(c*c-1/4*((c*c-d*d)/(b-a)+b-a))
    }

    override fun getPerimeter(): Number {
        return a + b + c + d
    }
}