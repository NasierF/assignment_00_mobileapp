fun main() {
    val square: Shape = squareHandler()
    val circle: Shape = circleHandler()
    val triangle: Shape = triangleHandler()
    val equilateralTriangle: Shape = equilateralTriangleHandler()

    println("Square name: ${square.name}")
    (square as Square).printDimensions()
    println("Square area: ${square.getArea()}")

    println("Circle name: ${circle.name}")
    (circle as Circle).printDimensions()
    println("Circle area: ${circle.getArea()}")

    println("Triangle name: ${triangle.name}")
    (triangle as Triangle).printDimensions()
    println("Triangle area: ${triangle.getArea()}")

    println("Equilateral triangle name: ${equilateralTriangle.name}")
    (equilateralTriangle as EquilateralTriangle).printDimensions()
    println("Equilateral triangle area: ${equilateralTriangle.getArea()}")
}

//made functions to make code cleaner visually
fun squareHandler(): Square{
    val square = Square("demoSquare");
    println("Enter the length for your square:")
    val squareLength = readLine()?.toDoubleOrNull() ?: 0.0

    println("Enter the Height for your square:")
    val squareHeight = readLine()?.toDoubleOrNull() ?: 0.0

    square.setDimensions(squareLength, squareHeight)
    return square

}

fun circleHandler(): Circle{
    val circle = Circle("demoCircle")

    println("Enter the radius for your circle:")
    val radius = readLine()?.toDoubleOrNull() ?: 0.0

    circle.setDimensions(radius)
    return circle
}

fun triangleHandler(): Triangle{
    val triangle = Triangle("demoTriangle")

    println("Enter the 3 sides of your triangle:")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    val b = readLine()?.toDoubleOrNull() ?: 0.0
    val c = readLine()?.toDoubleOrNull() ?: 0.0

    triangle.setDimensions(a, b, c)
    return triangle
}

fun equilateralTriangleHandler(): EquilateralTriangle{
    val equilateralTriangle = EquilateralTriangle("demoEquilateralTriangle")

    println("Enter a side length for your equilateral triangle:")
    val a = readLine()?.toDoubleOrNull() ?: 0.0

    equilateralTriangle.setDimensions(a)
    return equilateralTriangle
}
