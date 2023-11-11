Laba 1 
Agalakov Daniel VTI

fun main() {
       // 1
    
    var a = 5
    var b = 6
    
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    
    if(a > b) {
        println("$a, больше чем  $b")
    } else println("$b, больше чем  $a")
    
    
   // 2
    var integerValue = 2
    
      if(integerValue % 2 == 0) {
        println("Число четное")
    } else println("Число не четное")
      
     // 3
     

     for(i in 1..5) {
         for(a in 1..5) {
         	print("${i * a} \t")
     	}
        println()
     }
     
     println(' ')
     var number = 5;
     while(number > 0) {
         println(number * number);
         number--
     }
}

4
data class Card(val rank: String, val suit: String)

class Deck {
    val cards = mutableListOf<Card>()

    init {
        val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т")
        val suits = listOf("Червы", "Бубны", "Трефы", "Пики")

        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
    }

    fun printDeck() {
        cards.forEach { println("${it.rank} ${it.suit}") }
    }

    fun sortDeck() {
        cards.sortWith(compareBy({ it.suit }, { rankToInt(it.rank) }))
    }

    private fun rankToInt(rank: String): Int {
        return when (rank) {
            "2" -> 2
            "3" -> 3
            "4" -> 4
            "5" -> 5
            "6" -> 6
            "7" -> 7
            "8" -> 8
            "9" -> 9
            "10" -> 10
            "В" -> 11
            "Д" -> 12
            "К" -> 13
            "Т" -> 14
            else -> 0
        }
    }
}

fun main() {
    val deck = Deck()
    println("Исходная колода:")
    deck.printDeck()

    deck.sortDeck()
    println("\nОтсортированная колода:")
    deck.printDeck()
}
