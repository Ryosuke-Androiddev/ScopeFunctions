fun main(){

    var number: Int? = null

    /** Don't do this
     * If (number != null){
     *     val x = number + 1 }
     *
     *     If number is null you will get error!*/

    // you have to use let{} to check if it is null or not!!

    /** if it is null you will get 3 but, if it is not let{} will do its function! */
    val x = number?.let {
        val number2 = it + 1
        println(number2)
    } ?: println(3)


    /** this is apply function! */

    val person = Person()
    person.name = "Hello"
    person.age = 2

    // scope function allows you to write code easily!!!
    val person2 = Person().apply {
        name = "Ryosuke"
        age = 4
    }

    /** this is with function! you don't have to write this key word!! */
    with(person){
        println(name)
        println(age)
    }


    val typeStringReturn: String = with(person){
       println(name)
       println(age)
       "Hello world!!"
    }
    println(typeStringReturn) //you can get String Value here from that with function!!
}