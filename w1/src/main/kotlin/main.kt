
open class Human(val name: String, var mana: Boolean){
    open fun attack(){
        println("$name use first attack")
    }
    open fun haveMana(){
        if(mana===true){
            println("$name have mana.")
        }
        else{
            println("$name doesn't have mana.")
        }
    }


}

class Mage(name: String,mana: Boolean):Human(name,mana){
    override fun attack(){
        println("$name use Fireball !")
    }

}

fun main(args: Array<String>) {
    //Q4
    val human=Human("Sara", false)
    human.attack()
    //Q5
    val mage=Mage("Lin", true)
    mage.attack()
    //Q6
    human.haveMana()

}