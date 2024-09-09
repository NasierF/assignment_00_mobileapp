import Shape
import kotlin.math.PI
class Circle (name: String) : Shape(name) {

    private var radius: Double = 0.0;


    fun setDimensions (radius: Double){
        this.radius = radius;


    }

    override fun getArea(): Double {
        return PI * radius *radius;
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }


}