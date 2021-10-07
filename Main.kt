package machine

class CoffeeMachine {
    companion object {
        var water = 400
        var milk = 540
        var coffeeBeans = 120
        var cups = 9
        var money = 550
    }

    fun buyCoffee() {
        println()
        println("1 - espresso")
        println("2 - latte")
        println("3 - cappuccino")
        println("back - to main menu")
        println("What do you want to buy? : ")
        when (readLine()!!) {
            "1" -> {
                if (water < 250) {
                    println("Sorry, not enough water!")
                } else if (coffeeBeans < 16) {
                    println("Sorry, not enough coffee beans!")
                } else if (cups < 1) {
                    println("Sorry, not enough cups!")
                } else {
                    println("I have enough, making you a coffee!")
                    water -= 250
                    coffeeBeans -= 16
                    money += 4
                    cups--
                }
                println()
            }
            "2" -> {
                if (water < 350) {
                    println("Sorry, not enough water!")
                } else if (coffeeBeans < 20) {
                    println("Sorry, not enough coffee beans!")
                } else if (cups < 1) {
                    println("Sorry, not enough cups!")
                } else if (milk < 75) {
                    println("Sorry, not enough milk!")
                } else {
                    println("I have enough, making you a coffee!")
                    water -= 350
                    coffeeBeans -= 20
                    milk -= 75
                    money += 7
                    cups--
                }
                println()
            }
            "3" -> {
                if (water < 200) {
                    println("Sorry, not enough water!")
                } else if (coffeeBeans < 12) {
                    println("Sorry, not enough coffee beans!")
                } else if (cups < 1) {
                    println("Sorry, not enough cups!")
                } else if (milk < 100) {
                    println("Sorry, not enough milk!")
                } else {
                    println("I have enough, making you a coffee!")
                    water -= 200
                    coffeeBeans -= 12
                    milk -= 100
                    money += 6
                    cups--
                }
                println()
            }
            else -> {
            }
        }
    }

    fun displayRemaining() {
        println()
        println(
            """ |The coffee machine has:
                |$water of water
                |$milk of milk
                |$coffeeBeans of coffee beans
                |$cups of disposable cups
                |$money of money""".trimMargin()
        )
        println()
    }

    fun fillCoffee() {
        println()
        println("Write how many ml of water do you want to add: ")
        val addWater = readLine()!!.toInt()
        println("Write how many ml of milk do you want to add: ")
        val addMilk = readLine()!!.toInt()
        println("Write how many grams of coffee beans do you want to add: ")
        val addCoffeeBeans = readLine()!!.toInt()
        println("Write how many disposable cups of coffee do you want to add: ")
        val addCups = readLine()!!.toInt()

        water += addWater
        milk += addMilk
        coffeeBeans += addCoffeeBeans
        cups += addCups
        println()
    }

    fun takeMoney() {
        println()
        println("I gave you \$$money")
        money = 0
        println()
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()

    while (true) {
        println("Write action (buy, fill, take, remaining, exit): ")
        when (readLine()!!) {
            "buy" -> {
                coffeeMachine.buyCoffee()
            }
            "fill" -> {
                coffeeMachine.fillCoffee()
            }
            "take" -> {
                coffeeMachine.takeMoney()
            }
            "remaining" -> {
                coffeeMachine.displayRemaining()
            }
            "exit" -> {
                break
            }
        }
    }
}


