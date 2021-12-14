package proxy

import proxy.state.State
import java.rmi.Remote
import java.rmi.RemoteException

interface GumballMachineRemote: Remote {
    fun getCount(): Int = throw RemoteException()
    fun getLocation(): String = throw RemoteException()
    fun getState(): State = throw RemoteException()
}