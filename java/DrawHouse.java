import java.awt.*;
import java.applet.*;

public class S extends Applet {
	public void pain(Graphics g) {
		g.drawRect(200, 200, 500, 500);
		g.drawLine(200, 200, 450, 10);
		g.drawLine(450, 700, 200);
		g.setColor(Color.blue);
		g.fillRect(400, 400, 200, 400);
		g.fillRect(250, 300, 100, 100);
	}
}