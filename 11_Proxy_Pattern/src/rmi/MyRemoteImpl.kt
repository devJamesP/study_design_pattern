package rmi

import java.rmi.Naming
import java.rmi.server.UnicastRemoteObject



class MyRemoteImpl: UnicastRemoteObject(), MyRemote {
    override fun sayHello(): String {
        return "Server says, `hey!`"
    }

    companion object {
        fun main() {
            try {
                // 서버: 원격 서비스에서는 RMI 레지스트리(서버)에 스토브를 등록한다.
                val service : MyRemote = MyRemoteImpl()
                Naming.rebind("RemoteHello", service)
            } catch (e : Error) {
                e.printStackTrace()
            }
        }
    }
}