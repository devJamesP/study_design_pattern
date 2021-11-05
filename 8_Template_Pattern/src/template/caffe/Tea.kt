package template.caffe

class Tea: CaffeineBeverage() {
    override fun brew() {
        println("차를 우려내는 중")
    }

    override fun addCondiments() {
        println("레몬을 추가하는 중")
    }
}