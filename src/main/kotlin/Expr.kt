interface Expr {
    class Num(val value: Int) : Expr
    class Sum(val left:Expr, val right:Expr):Expr
        fun eval(e: Expr):Int
        {
            if (e is Expr.Num)
            {
                val n = e as Expr.Num
                return n.value
            }
            if(e is Expr.Sum)
            {
                return eval(e.left ) + eval(e.right)
            }
            throw IllegalArgumentException("Unknown Exception")

    }
}