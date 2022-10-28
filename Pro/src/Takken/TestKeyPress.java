package Takken;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

public class TestKeyPress implements NativeKeyListener, NativeMouseInputListener {/* from w w w . j a v a 2 s . c o m */

	private String path;

	public TestKeyPress() {
		path = System.getProperty("user.dir");
	}

	public static void main(String arg[]) {
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
	}
		TestKeyPress test = new TestKeyPress();
		GlobalScreen.addNativeKeyListener(test);
		// GlobalScreen.addNativeMouseListener(test);
		// GlobalScreen.addNativeMouseMotionListener(test);
	}

	public void nativeKeyPressed(NativeKeyEvent e) {
		System.err.println(e.getKeyCode());
		System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
		write("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
		//u : 85 i : 73 j : 74 k : 75 o : 79 l : 76
		
		if (e.getKeyCode() == NativeKeyEvent.VC_Z) { //근너클
			//chopoug();
			KeyPress(68);
			KeyPress(68);
			try {
				Robot r = new Robot();
				Thread.sleep(18);
				r.keyPress(68);
				KeyPress(73);
				r.keyRelease(68);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}else if (e.getKeyCode() == NativeKeyEvent.VC_X) {
			KeyPress(65);
			KeyPress(65);
			try {
				Robot r = new Robot();
				Thread.sleep(18);
				r.keyPress(65);
				KeyPress(73);
				r.keyRelease(65);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
			try {
				GlobalScreen.unregisterNativeHook();
			} catch (NativeHookException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void chopouglong() { //초풍
//		OPkeycom(6);
		keycom(6);
		OPkeycom(6);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ORkeycom(6);
		OPkeycom(2);
		
		OPkeycom(3);
		
		OnKeyNowPress(73);
		OnKeyRea(73);
		
		ORkeycom(2);
		ORkeycom(3);
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void chopoug() { //초풍
		keycom(6);
		OPkeycom(2);
		OPkeycom(3);
		
		OnKeyNowPress(73);
		ORNowkeycom(2);
		ORNowkeycom(3);
		OnKeyNowNowRea(73);
		
		try {
			Thread.sleep(540);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ragi() { //기스 레이지 스톰
		OPkeycom(1);
		OPkeycom(6);
		ORkeycom(1);
		OPkeycom(2);
		ORkeycom(6);
		OPkeycom(4);
		ORkeycom(2);
		OPkeycom(3);
		ORkeycom(4);
		OnKeyPress(79);
		ORkeycom(3);
		OnKeyRea(79);
	}

	public void ORNowkeycom(int key) {
		switch (key) {
			case 1: {
				OnDKeyNowRea(65, 83);
				break;
			}
			case 2: {
				OnKeyNowRea(83);
				break;
			}
			case 3: {
				OnDKeyNowRea(83, 68);
				break;
			}
			case 4: {
				OnKeyNowRea(65);
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				OnKeyNowRea(68);
				break;
			}
			case 7: {
				OnDKeyNowRea(65, 87);
				break;
			}
			case 8: {
				OnKeyNowRea(87);
				break;
			}
			case 9: {
				OnDKeyNowRea(87, 68);
				break;
			}
		}
	}
	public void bunner() {
//    	if (e.getKeyCode() == NativeKeyEvent.VC_Z) { //근너클
//			KeyPress(68);
//			KeyPress(68);
//			try {
//				Robot r = new Robot();
//				Thread.sleep(18);
//				r.keyPress(68);
//				KeyPress(73);
//				r.keyRelease(68);
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}else if (e.getKeyCode() == NativeKeyEvent.VC_X) {
//			KeyPress(65);
//			KeyPress(65);
//			try {
//				Robot r = new Robot();
//				Thread.sleep(18);
//				r.keyPress(65);
//				KeyPress(73);
//				r.keyRelease(65);
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
	}
	
	public void ORkeycom(int key) {
		switch (key) {
			case 1: {
				OnDKeyRea(65, 83);
				break;
			}
			case 2: {
				OnKeyRea(83);
				break;
			}
			case 3: {
				OnDKeyRea(83, 68);
				break;
			}
			case 4: {
				OnKeyRea(65);
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				OnKeyRea(68);
				break;
			}
			case 7: {
				OnDKeyRea(65, 87);
				break;
			}
			case 8: {
				OnKeyRea(87);
				break;
			}
			case 9: {
				OnDKeyRea(87, 68);
				break;
			}
		}
	}

	public void OnKeyNowPress(int key) {
		try {
			Robot r = new Robot();
			Thread.sleep(5);
			r.keyPress(key);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	public void OnKeyNowRea(int key) {
		try {
			Robot r = new Robot();
			Thread.sleep(11);
			r.keyRelease(key);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	public void OnKeyNowNowRea(int key) {
		try {
			Robot r = new Robot();
			Thread.sleep(1);
			r.keyRelease(key);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	
	public void OnDKeyNowPress(int key, int key2) {
		try {
			Robot r = new Robot();
			Thread.sleep(1);
			r.keyPress(key);
			r.keyPress(key2);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	public void OnDKeyNowRea(int key, int key2) {
		try {
			Robot r = new Robot();
			Thread.sleep(5);
			r.keyRelease(key);
			r.keyRelease(key2);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	public void OPkeycom(int key) {
		switch (key) {
			case 1: {
				OnDKeyPress(65, 83);
				break;
			}
			case 2: {
				OnKeyPress(83);
				break;
			}
			case 3: {
				OnDKeyPress(83, 68);
				break;
			}
			case 4: {
				OnKeyPress(65);
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				OnKeyPress(68);
				break;
			}
			case 7: {
				OnDKeyPress(65, 87);
				break;
			}
			case 8: {
				OnKeyPress(87);
				break;
			}
			case 9: {
				OnDKeyPress(87, 68);
				break;
			}
		}
	}
	public void keycom(int key) {
		switch (key) {
			case 1: {
				DKeyPress(65, 83);
				break;
			}
			case 2: {
				KeyPress(83);
				break;
			}
			case 3: {
				DKeyPress(83, 68);
				break;
			}
			case 4: {
				KeyPress(65);
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				KeyPress(68);
				break;
			}
			case 7: {
				DKeyPress(65, 87);
				break;
			}
			case 8: {
				KeyPress(87);
				break;
			}
			case 9: {
				DKeyPress(87, 68);
				break;
			}
		}
	}

	public void OnDKeyPress(int key, int key2) {
		try {
			Robot r = new Robot();
			Thread.sleep(15);
			r.keyPress(key);
			r.keyPress(key2);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

	public void OnKeyPress(int key) {
		try {
			Robot r = new Robot();
			Thread.sleep(15);
			r.keyPress(key);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	public void OnDKeyRea(int key, int key2) {
		try {
			Robot r = new Robot();
			Thread.sleep(19);
			r.keyRelease(key);
			r.keyRelease(key2);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

	public void OnKeyRea(int key) {
		try {
			Robot r = new Robot();
			Thread.sleep(19);
			r.keyRelease(key);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
	public void DKeyPress(int key, int key2) {
		try {
			Robot r = new Robot();
			Thread.sleep(18);
			r.keyPress(key);
			r.keyPress(key2);
			Thread.sleep(19);
			r.keyRelease(key);
			r.keyRelease(key2);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

	public void KeyPress(int key) {
		try {
			Robot r = new Robot();
			Thread.sleep(18);
			r.keyPress(key);
			Thread.sleep(19);
			r.keyRelease(key);
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

	public void nativeKeyReleased(NativeKeyEvent e) {
	}

	public void nativeKeyTyped(NativeKeyEvent e) {
	}

	@Override
	public void nativeMouseClicked(NativeMouseEvent e) {

		System.out.println("mouse clicked:" + e.getX());
	}

	@Override
	public void nativeMousePressed(NativeMouseEvent e) {

		System.out.println("mouse Press:" + e.getButton());
	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent e) {

		System.out.println("mouse Release:" + e.getButton());
	}

	@Override
	public void nativeMouseMoved(NativeMouseEvent e) {

		// System.out.println("mouse move" + e.getX());

	}

	@Override
	public void nativeMouseDragged(NativeMouseEvent e) {

		System.out.println("mouse Dragge:" + e.getX() + "," + e.getY());
	}

	private void write(String i) {
		BufferedWriter bufferedWriter = null;
		Date date = Calendar.getInstance().getTime();
		try {
			bufferedWriter = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(path + "\\log2.txt", true), "BIG5"));
			bufferedWriter.write(date.toString() + ":" + i + "\r\n");
			close(bufferedWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bufferedWriter);
		}

	}

	private void close(BufferedWriter w) {
		try {
			if (w != null) {
				w.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}