fun main () {

    val x: Point = Point()
    x.coordinate_x = 3F

    x.printcoordinates()

    val y: Point = Point()
    y.coordinate_y = 6F

    y.printcoordinates()
    println(x.coordinate_x/y.coordinate_y)

    println(x.toString())
    println(y.toString())
    println(x.coordinate_x == y.coordinate_y)

}

class Point {

    var coordinate_x: Float = 2F
    var coordinate_y: Float = 1F

    fun printcoordinates() {
        println("$coordinate_x $coordinate_y")
    }
          override fun toString(): String {
            return "$coordinate_x/$coordinate_y"

          }
    override fun equals(other: Any?): Boolean {
        if (this.coordinate_x == this.coordinate_y) {
            return true
        }
        return false
    }

    }


