import Shape
import kotlin.math.sqrt
class Triangle (name: String) : Shape(name) {

    private var a: Double = 0.0;
    private var b: Double = 0.0;
    private var c: Double = 0.0;
    private var s: Double = 0.0;
    fun setDimensions (a: Double,  b: Double, c: Double){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    override fun getArea(): Double {
        s = (a+b+c)/2
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }

    override fun printDimensions() {
        println("side a: $a, side b: $b, side c: $c")
    }


}