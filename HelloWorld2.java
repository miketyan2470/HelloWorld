/*File: HelloTest
 *Program tests programming exercises from Chapter 2
 *in Art and Science of Java textbook
 */

package javaCh2;

import acm.graphics.*;
import acm.program.*;

public class HelloWorld2 extends GraphicsProgram {
	
	public void run() {
		add(new GLabel("Hello World!",300,250));
		add(new GLabel("Mike Tyan - 01.21.16",600,400));
	}
	
}