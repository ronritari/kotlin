fun main(){
    //val can be assigned only once var can be reassigned
    val bigNumber=3L
    val preciseDecimal=3.33
    val decimal=3.33f
    val iLoveVegetables=false
    val iLovePizza=true
    val iAmALetter='a'


    val x = 3f/4f
    //modular keeps the remaining value witch is one
    val modular = 10 %3
    println("the value of x is $x")
    println("the value of x is $modular")
    val amIAnAdoult = true
    val amIAnprogrammer = true
    val amIAnAdultProgrammer =amIAnAdoult && amIAnprogrammer
    println(amIAnAdultProgrammer)
    //checks if adult and programmer are the same boolean
    val amIAnAdultProgrammer2 =amIAnAdoult == amIAnprogrammer
    println(amIAnAdultProgrammer2)

    //if conditions can be assigned to val
    val y = if(x == 0.70f) 0.75 else "lol"
    println("the value of x is $y")

    val NULL: Int? = null
    //int inputs must be defined
    //user input can be called by readLine
    /*val number1= readLine() ?: "0" //if input null 0 will be assigned
    val number2= readLine() ?: "0"  // ?: is basically if statement
    //!! ignores if a null but will crash if null
    //number1?.toInt() will execute only if int is not null(is better)
    val result= number1!!.toInt() + number2!!.toInt()
    print(result)*/

    //no items can be added to this list
    val shoppingList = listOf<String>("Lamborgihini", "penthouse", "rolex")
    println(shoppingList[0]) //0 is index

    //mutable list can be changed
    val shoppingList2 = mutableListOf("Lamborgihini", "penthouse", "rolex")//vriable dosent need to be defined
    shoppingList2.add("ferrari")//adds ferrari string
    //while loop    .size gives size of array index
    /*var number = 0
    while(number < shoppingList2.size){
        println(shoppingList[number])
        number++
    }*/
        //shopping item is name of the array variable
    for (item in shoppingList2){
        println(item)
    }
    //will print numbers between 1-100
    for (i in 1..10){
        println(i)
    }
    //when is if you wanna make an if condition depending on a single condition
    val lol=3
    when(lol){
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else ->{
            println("x is not in the range of 1-10")
        }
    }

    print10numbers()
    val bool= isEven(5)
    println(bool)

    //same result
    val odd =9
    println(odd.isOdd())
    //gives values to animal class
    //val Dog = animal("dog")
    val b =dog()
    b.bark()

    val cat= Cat()
    cat.meaw()

    //open class can have added stuff but abstract class cannot create new
   // val Animal_= animal()

    //anonymus classes will only be accsessed in said function
    val bear = object: animal("camembear"){
        //makesound() need override
    }
    //exeptions if user dosent put an int
    //val numb = readLine() ?: "0"
    val parsedNumber = try{
       // numb.toInt()
    }catch(e: Exception){ //if try dosent work it will assign 0
        0
    }
    println(parsedNumber)

        //lambda fuction will check array contents
    val lista = listOf("kotlin", "homo", "just",)
    val count = lista.customCount{ currentString->
        currentString.length ==4 //checks if length of string is 4
    }
    println(count)//will print 2
}

//List<String> extend the type of list. function is called customCount
//specify the function type function: (String)-> Boolean    return int
fun List<String>.customCount(function: (String)-> Boolean): Int{
    var counter=0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}
/*
will allow to use fuction to any type of list
fun <T>List<T>.customCount(function: (T)-> Boolean): Int{
    var counter=0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}*/

//fun name(variable: type): return value{ this works with int numbers
fun Int.isOdd(): Boolean{
    return this % 2==1
}
//fun name(variable: type): return value{
fun isEven(num: Int): Boolean{
    return num % 2==0
}

fun print10numbers(){
    for (i in 1..10){
        print(i)
    }
}