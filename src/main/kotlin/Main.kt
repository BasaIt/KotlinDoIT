import animals.Person
import com.sun.org.apache.xpath.internal.XPathAPI.eval

import paint.Color

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
}

fun max(a : Int, b : Int)
{
    return max(a,b)
}

fun recognize(c: Char) = when(c)
{
        in '0'..'9' -> "Is digit"
        in 'a'..'z' -> "It ' s  а  tetter"
        else -> "1 !  don 't know..."
}

