package template.caffe.addhook

import java.io.BufferedReader
import java.io.InputStreamReader

class CoffeeWithHook: CaffeineBeverageWithHook() {
    override fun brew() {
        println("필터로 커피를 우려내는 중")
    }

    override fun addCondiments() {
        if (customerWantsDCondiments()) {
            println("설탕과 커피를 추가하는 중")
        }
    }

    override fun customerWantsDCondiments(): Boolean {
        val answer = getUserInput()
        return answer.lowercase().startsWith("y")
    }

    private fun getUserInput() : String {
        var answer: String?
        print("커피에 우유와 설탕을 넣어드릴까요? (y/n) ? : ")
        val br = BufferedReader(InputStreamReader(System.`in`))
        answer = br.readLine()
        return answer ?: "no"
    }
}