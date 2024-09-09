import Shape
import kotlin.math.sqrt
class EquilateralTriangle (name: String) : Shape(name) {

    private var a: Double = 0.0;
    private var s: Double = 0.0;
    fun setDimensions (a: Double){
        this.a = a;
    }

    override fun getArea(): Double {
        s = (a*3)/2
        return sqrt(s*(s-a)*(s-a)*(s-a));
    }

    override fun printDimensions() {
        println("side a: $a, side b: $a, side c: $a")
    }


}