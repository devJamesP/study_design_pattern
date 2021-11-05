package template.caffe.addhook

abstract class CaffeineBeverageWithHook {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }
    abstract fun brew()
    abstract fun addCondiments()

    fun boilWater() {
        println("물 끓이는 중")
    }
    fun pourInCup() {
        println("컵에 따르는 중")
    }

    // 이 메소드는 서브클래스에 따라 필요에 의해 오버라이드 할 수 있는 메소드이므로 후크이다!
    // 별 내용 없이 true만 반환 할 뿐!!
    open fun customerWantsDCondiments(): Boolean {
        return true
    }
}