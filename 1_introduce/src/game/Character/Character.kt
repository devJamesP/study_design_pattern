package game.Character

import game.Weapon.KnifeBehavior
import game.Weapon.WeaponBehavior

abstract class Character {
    abstract fun fight()
    open var weapon : WeaponBehavior = KnifeBehavior()

    fun performWeaponBehavior(weaponBehavior: WeaponBehavior) {
        weaponBehavior.useWeapon()
    }
}