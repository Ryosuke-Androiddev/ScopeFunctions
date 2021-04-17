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



}