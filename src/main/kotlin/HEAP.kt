package org.example

abstract class Bebe {
    private var name: String = "Por ingresar"

    fun getName(): String {
        return name
    }
    fun setName(name: String) {
        this.name = name
    }
    abstract fun cry()
    open fun sleep() {
        println("$name está durmiendo.")
    }
}

class Niece : Bebe() { //hereda de clase bebe
    override fun cry() {
        println("Rápido! ${getName()} quiere un abrazo.")
    }
    override fun sleep() {
        println("Shhh... ${getName()} está durmiendo.")
    }
}

fun main() {
    val myNiece = Niece()
    myNiece.setName("Sophia")
    println("Mi sobrinita se llama: ${myNiece.getName()}")

    myNiece.cry() //invocamos
    myNiece.sleep()
}
