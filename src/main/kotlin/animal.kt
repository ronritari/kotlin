abstract class animal(
    val name: String,
    val legCount: Int= 4
) {
    //code will be executed when called on the instance of this class
    init {
        println("Hello my name is $name")
    }
}