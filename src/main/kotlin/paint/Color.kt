package paint

enum class Color(var r : Int,
                 var g : Int,
                 var b : Int) {
    RED(250, 0, 0), YELLOW(255, 255, 0),
    BLUE(0, 0, 255), BLACK(0, 0, 0),
    ORANGE(255, 165, 0);

    fun rgb() = (r * 256 + g) * 256 + b


    fun getMnemonic(c1: Color, c2: Color) =
        when(setOf(c1, c2)) {
            setOf(c1, c2)->"ORANGE"

            else -> {}
        }
}
