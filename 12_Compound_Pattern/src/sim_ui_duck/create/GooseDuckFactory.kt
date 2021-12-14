package sim_ui_duck.create

import sim_ui_duck.duck.Quackable
import sim_ui_duck.goose.Goose
import sim_ui_duck.goose.GooseAdapter

class GooseDuckFactory : AbstractGooseFactory() {
    override fun createGooseDuck() : Quackable{
        return GooseAdapter(Goose())
    }
}