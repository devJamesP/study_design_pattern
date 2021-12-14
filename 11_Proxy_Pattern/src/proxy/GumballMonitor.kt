package proxy

import state.GumballMachine
import java.rmi.RemoteException

class GumballMonitor(private val gumballMachine: GumballMachineRemote) {
    fun report() {
        try {
            println("뽑기 기계 위치: ${gumballMachine.getLocation()}")
            println("현재 재고: ${gumballMachine.getCount()} 개")
            println("현재 상태: ${gumballMachine.getState().javaClass.name}")
        } catch (e : RemoteException) {
            e.printStackTrace()
        }
    }
}