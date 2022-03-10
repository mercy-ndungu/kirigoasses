fun main (){
    mySchool("codeHive")
    values(36,5)
    greetings("Mercy", 23)


}
fun mySchool(name: String){
    var jina = "codeHive"
    var jina1 = jina[4]
    var jina2 = jina[5]
    var jina3 = jina[6]
    var jina4 = jina[7]
    var stmnt = ("$jina1$jina2$jina3$jina4")
    println(stmnt)


}
fun values(num1: Int,num2: Int): Int{
    var modulus = num1%num2
    println(modulus)
    return modulus
}
fun greetings (name:String,age:Int): String{
    var stmt= "Hi,my name is name and I am age years old."
    println(stmt)
    return stmt

}
fun stmt (word: String): String{
    var word = "Boutique"
    var length = (word.length)
    println(length)
    return word
}