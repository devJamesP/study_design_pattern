package proxy.dynamic_proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class OwnerInvocationHandler(private val person: PersonBean) : InvocationHandler {
    override fun invoke(proxy: Any, method: Method, args: Array<out Any>): Any? {
        try {
            if (method.name.startsWith("get")) {
                return method.invoke(person, args)
            } else if (method.name == "setHotOrNotRating") {
                throw IllegalAccessException()
            } else if (method.name.startsWith("set")) {
                return method.invoke(person, args)
            }
        } catch (e: Error) {
            e.printStackTrace()
        }
        return null
    }
}