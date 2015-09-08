package Navigation;

import io.appium.java_client.android.AndroidKeyCode;
import Appium.infrastructure.Driver;

public class DeviceNavigation {
	public static void GoHome(){
	Driver.Instance.sendKeyEvent(AndroidKeyCode.HOME);
	Driver.Instance.sendKeyEvent(AndroidKeyCode.BACK);
	
	}
	
	public static void GoBack(){
				Driver.Instance.sendKeyEvent(AndroidKeyCode.BACK);
		
		}
	

}
