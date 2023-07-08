package geometry

import Expr

class Rectangle (val h:Int, val w:Int ){
    val isSquare : Boolean
        get(){
            return h == w
        }
}


