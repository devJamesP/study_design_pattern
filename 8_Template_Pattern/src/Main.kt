import template.caffe.Coffee
import template.caffe.Tea
import template.caffe.addhook.CoffeeWithHook
import template.caffe.addhook.TeaWithHook
import template.duck.Duck
import template.sort
import java.applet.Applet
import java.awt.Graphics
import javax.swing.JFrame

/* 기본 사용 */
//fun main() {
//    val myTea = Tea()
//    val myCoffee = Coffee()
//
//    myTea.prepareRecipe()
//    myCoffee.prepareRecipe()
//}

/* Hook 사용 */
//fun main() {
//
//    val myCoffee = CoffeeWithHook()
//    myCoffee.prepareRecipe()
//
//    val myTea = TeaWithHook()
//    myTea.prepareRecipe()
//}

/* Comparable 구현 객체 비교 (Duck) */
//fun main() {
//    val ducks: List<Duck> = listOf(
//        Duck("Daffy", 8),
//        Duck("Dewey", 2),
//        Duck("Howard", 7),
//        Duck("Louie", 2),
//        Duck("Donald", 10),
//        Duck("Huey", 2),
//    )
//
//    println("정렬 전 : ")
//    ducks.forEach {
//        println("${it.name} : ${it.weight}")
//    }
//
//    println("\n정렬 후 : ")
//    sort(ducks)
//    ducks.forEach {
//        println("${it.name} : ${it.weight}")
//    }
//}

/* 스윙 프레임 */
//class MyFrame(title: String) : JFrame(title) {
//    init {
//        this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
//        setSize(300, 300)
//        isVisible = true
//    }
//
//    // hook 메소드
//    override fun paint(g: Graphics?) {
//        super.paint(g)
//        val msg = "내가 최고!"
//        graphics.drawString(msg, 100, 100)
//    }
//}
//fun main() {
//    val myFrame= MyFrame("헬로우~~")
//}


/* 애플릿 */
class MyApplet : Applet() {
    private var message = ""


    // hook 메소드들

    override fun init() {
        message = "안녕하세요. 제가 왔어요!!"
        repaint()
    }

    override fun start() {
        message = "시작 중..."
        repaint()
    }

    override fun stop() {
        message = "저를 떠나려 하시는군요..."
        repaint()
    }

    override fun destroy() {
        // 애플릿이 제거됨...
    }

    override fun paint(g: Graphics?) {
        g?.drawString(message, 5, 15)
    }
}



