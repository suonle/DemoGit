

abstract class AquariumFish {
    abstract val color: String

//    class Shark : AquariumFish(), FishAction {
//        override val color = "grey"
//        override fun eat() {
//            println("hunt and eat fish")
//        }
//    }
    class Shark: FishAction, FishColor {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

//    class Plecostomus : AquariumFish(),FishAction {
//        override val color = "gold"
//        override fun eat() {
//            println("eat algae")
//        }
//    }
    class Plecostomus: FishAction, FishColor {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }
//    class Plecostomus:  FishAction, FishColor by GoldColor {
//        override fun eat() {
//            println("eat algae")
//        }
//    }
//class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
//    FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
//    class Plecostomus (fishColor: FishColor = GoldColor):
//        FishAction by PrintingFishAction("eat algae"),
//        FishColor by fishColor
    interface FishAction  {
        fun eat()
    }
    interface FishColor {
        val color: String
    }
    object GoldColor : FishColor {
        override val color = "gold"
    }
}
    fun makeFish() {
        val shark = Shark()
        val pleco = Plecostomus()
        println("Shark: ${shark.color}")
        shark.eat()
        println("Plecostomus: ${pleco.color}")
        pleco.eat()
    }

    fun main () {
        makeFish()
    }