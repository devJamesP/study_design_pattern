package rmi

import java.rmi.Remote
import java.rmi.RemoteException

interface MyRemote : Remote {
    fun sayHello() : String = throw RemoteException()
}