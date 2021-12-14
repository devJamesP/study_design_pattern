import proxy.GumballMonitor
import rmi.MyRemote
import rmi.MyRemoteImpl
import state.GumballMachine
import java.rmi.Naming

fun main(args: Array<String>) {
    val gumballMachine = GumballMachine(10, "seoul")
    try {
        Naming.rebind("//seoul/gumballmachine/", gumballMachine)
    } catch (e : Error) {
        e.printStackTrace()
    }
}