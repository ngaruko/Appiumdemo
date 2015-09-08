package EfleetSuite.screens;

import java.util.concurrent.TimeUnit;

import Appium.infrastructure.Driver;

public class EfsScreen {

	public static void SignInEfs() {

		// wait
		/*
		 * WebElement okButton = Driver.Instance
		 * .findElementById("biz.iseinc.eFleetSuite:id/hosDownloadDataButtonOk"
		 * );
		 * 
		 * 
		 * // Wait for the application page to load (takes some time, throws an
		 * // error if no wait). WebDriverWait wait = new
		 * WebDriverWait(Driver.Instance, 20);
		 * wait.until(ExpectedConditions.visibilityOf(okButton));
		 */

		Driver.Instance.manage().timeouts()
				.implicitlyWait(10, TimeUnit.SECONDS);

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/hosDownloadDataButtonOk").click();
		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/btnDriverPreview").click();
		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/shipmentstxtAddShipment").sendKeys(
				"ABC235");
		Driver.Instance.hideKeyboard();
		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/shipmentsbtnAddShipment").click();

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/shipmentsbtnDoneShipment").click();

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/dvirConfirmDataButtonRequest")
				.click();

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/dvirConfirmDataButtonOk").click();

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/review_dvir_btnNext").click();

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/repairedbtnYes").click();

		Driver.Instance.findElementById(
				"biz.iseinc.eFleetSuite:id/repairedbtnDone").click();

	}
}
