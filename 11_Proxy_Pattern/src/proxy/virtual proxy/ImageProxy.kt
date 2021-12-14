package proxy.`virtual proxy`

import java.awt.Component
import java.awt.Graphics
import java.net.URL
import javax.swing.Icon
import javax.swing.ImageIcon

class ImageProxy(private val imageURL: URL): Icon {
    private var imageIcon : ImageIcon? = null
    private var retrievalThread : Thread? = null
    private var retrieving : Boolean = false

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        if (imageIcon != null) {
            imageIcon!!.paintIcon(c, g, x, y)
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190)
            if (retrieving.not()) {
                retrieving = true
                retrievalThread = Thread {
                    try {
                        imageIcon = ImageIcon(imageURL, "CD Cover")
                        c.repaint()
                    } catch (e: Error) {
                        e.printStackTrace()
                    }
                }
                retrievalThread?.start()
            }
        }
    }

    override fun getIconWidth(): Int {
        imageIcon?.let {
            return it.iconWidth
        }
        return 800
    }

    override fun getIconHeight(): Int {
        imageIcon?.let {
            return it.iconHeight
        }
        return 600
    }
}