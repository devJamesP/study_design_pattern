package adapter.duck_turkey.turkey

class WildTurkey: Turkey {
    override fun gobble() {
        println("고블고블~")
    }

    override fun fly() {
        println("휘리릭")
    }
}