package game.Character

import game.Weapon.AxeBehavior
import game.Weapon.WeaponBehavior

class King: Character() {
    override var weapon: WeaponBehavior = AxeBehavior()

    override fun fight() {
        println("나는 왕이로다!")
    }
}