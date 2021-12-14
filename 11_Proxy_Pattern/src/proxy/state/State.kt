package proxy.state

import java.io.Serializable


interface State : Serializable {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()

}