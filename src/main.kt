fun main(){


var a=numbers(arrayOf(1,2,4,8,4,6,) )
    println(a)
println(mixed (arrayOf("Nyakuar", 4.6,4.6,1.4)))

var t=character(arrayOf('a','b' , 'd', 'e', 'g', 'h', 'u','i'))
 println(t)

}

fun Intergers(a:Array<Int>): Int{
    var x  = 1
    a.forEach { a ->
        x *=a
    }

return x

 }



fun mixed(nums: Array<Any>): Double{
    var sum = 0.0
    nums.forEach { numb ->
        if(numb is Double||numb is  Float)
            sum+=numb.toString().toDouble()

      }
    return sum
}


fun character(names: Array<Char>):Int{
    var sums = 0
    names.forEach { names  ->
        if (names=='a'||  names=='e'|| names=='i'|| names=='o'|| names=='u')
            sums++

    }
    return sums
}



