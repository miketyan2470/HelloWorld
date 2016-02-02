/*File: HelloGraphics.java
 *Program will display "Hello World!" as a Graphics Program
 */

package javaCh2;

import acm.graphics.*;
import acm.program.*;

public class HelloGraphics extends GraphicsProgram {
	
	public void run() {
		add(new GLabel("Hello World!",100,75));
	}
	
}