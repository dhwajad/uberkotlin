class Robot {

    val left = "left"
    val right = "right"

    infix fun turns(direction: String) = println("turns $direction")

    infix fun operate(func: Robot.(Robot) -> Unit) {
        this.func(this)
    }
}

val robot = Robot()

robot operate {
   it turns left
    it turns right
}