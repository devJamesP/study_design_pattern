package game.Character

import game.Weapon.BowAndArrowBehavior
import game.Weapon.WeaponBehavior

class Queen: Character() {
    override var weapon: WeaponBehavior = BowAndArrowBehavior()

    override fun fight() {
        println("오홋홋, 내가 바로 여왕이야.")
    }
}