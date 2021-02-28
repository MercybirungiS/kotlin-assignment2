fun main() {
    name()
    var modulus=modulus(7,3)
    println(modulus)
    var add=addition(1,3,5,7)
    println(add )
    interestingFact()
}
fun name () {
    var name=("hello mercy")
    println(name )
}
fun modulus (a:Int,b:Int):Int{
    var modulus=a%b
    return modulus
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int ):Int {
    var add=num1 + num2 + num3 + num4
    return add
}
fun interestingFact(){
    var interestingFact=("i never give up")
    println(interestingFact)
}