package template.caffe.addhook

import template.caffe.CaffeineBeverage
import java.io.BufferedReader
import java.io.InputStreamReader

class TeaWithHook: CaffeineBeverageWithHook() {
    override fun brew() {
        println("차를 우려내는 중")
    }

    override fun addCondiments() {
        if (customerWantsDCondiments()) {
            println("차에 레몬을 넣는 중")
        }
    }

    override fun customerWantsDCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }

    private fun getUserInput() : String {
        val answer: String?
        print("차에 레몬을 넣어드릴까요? (y/n) ? : ")
        val br = BufferedReader(InputStreamReader(System.`in`))
        return br.use { bufReader ->
            answer = bufReader.readLine()
            return@use answer ?: "no"
        }
    }
}