package template.caffe

abstract class CaffeineBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourlnCup()
        addCondiments()
    }
    fun boilWater() {
        println("물 끓이는 중")
    }
    abstract fun brew()
    fun pourlnCup() {
        println("컵에 따르는 중")
    }
    abstract fun addCondiments()
}