package rmi

import java.rmi.Naming
import java.rmi.Remote

class MyRemoteClient {
    fun go() {
        try {
            val service = Naming.lookup("rmi://127.0.0.1/RemoteHello") as MyRemote
            val s = service.sayHello()

            println(s)
        } catch (e : Error) {
            e.printStackTrace()
        }
    }

    companion object {
        fun main() {
            MyRemoteClient().go()
        }
    }
}