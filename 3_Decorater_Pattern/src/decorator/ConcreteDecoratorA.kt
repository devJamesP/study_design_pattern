package decorator

class ConcreteDecoratorA: Decorator() {
    private lateinit var wrappedObj: Component

    override fun methodA() {
        super.methodA()
    }

    override fun methodB() {
        super.methodB()
    }
    fun newBehaviorA() {

    }
}