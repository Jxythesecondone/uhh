import java.awt.*;
import java.applet.*;

public class S extends Applet {

	String si;
	public void init() {
		int x=Integer.parseInt(getParameter("P"));
		int y=Integer.parseInt(getParameter("N"));
		int z=Integer.parseInt(getParameter("R"));
		float l=(x*y*z/100);
		si=String.valueOf(l);
	}
	public void pain(Graphics g) {
		g.drawString("Simple interest: ", 20, 30);
		g.drawString(si, 120, 30);
	}
}
