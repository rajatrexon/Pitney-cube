package com.pb.pbcube;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pb.pbcube.response.PbCubeResponse;
import com.pb.pbcube.service.PbCubeServiceImpl;

class PbCubeDriverTest {

	@Mock
	PbCubeServiceImpl mock;

	@InjectMocks
	PbCubeDriver driver;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Nested
	class TestConnectPrinter {

		@Test
		void successToConnectTest() {

			PbCubeResponse response0 = new PbCubeResponse(true, "0", "Success to connect");
			PbCubeResponse response1 = new PbCubeResponse(true, "0", "Success to connect");
			PbCubeResponse response2 = new PbCubeResponse(true, "0", "Success to connect");
			PbCubeResponse response3 = new PbCubeResponse(true, "0", "Success to connect");
			PbCubeResponse response4 = new PbCubeResponse(true, "0", "Success to connect");
			PbCubeResponse response5 = new PbCubeResponse(true, "0", "Success to connect");

			when(mock.connectPrinter(0, null, 0, 0, 0, 0)).thenReturn(response0);
			when(mock.connectPrinter(1, null, 0, 0, 0, 0)).thenReturn(response1);
			when(mock.connectPrinter(2, null, 0, 0, 0, 0)).thenReturn(response2);
			when(mock.connectPrinter(3, null, 0, 0, 0, 0)).thenReturn(response3);
			when(mock.connectPrinter(4, null, 0, 0, 0, 0)).thenReturn(response4);
			when(mock.connectPrinter(5, null, 0, 0, 0, 0)).thenReturn(response5);
			assertAll(() -> assertEquals(response0, driver.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, driver.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, driver.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, driver.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, driver.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, driver.connectPrinter(5, null, 0, 0, 0, 0)));

		}

		@Test
		void noPrinterAvailableToConnectTest() {

			PbCubeResponse response0 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response1 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response2 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response3 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response4 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response5 = new PbCubeResponse(false, "71", "No printers available to connect");

			when(mock.connectPrinter(0, null, 0, 0, 0, 0)).thenReturn(response0);
			when(mock.connectPrinter(1, null, 0, 0, 0, 0)).thenReturn(response1);
			when(mock.connectPrinter(2, null, 0, 0, 0, 0)).thenReturn(response2);
			when(mock.connectPrinter(3, null, 0, 0, 0, 0)).thenReturn(response3);
			when(mock.connectPrinter(4, null, 0, 0, 0, 0)).thenReturn(response4);
			when(mock.connectPrinter(5, null, 0, 0, 0, 0)).thenReturn(response5);
			assertAll(() -> assertEquals(response0, driver.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, driver.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, driver.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, driver.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, driver.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, driver.connectPrinter(5, null, 0, 0, 0, 0)));

		}

		@Test
		void notSupportedPrinterTest() {
			PbCubeResponse response0 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response1 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response2 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response3 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response4 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response5 = new PbCubeResponse(false, "72", "Not supported printer");

			when(mock.connectPrinter(0, null, 0, 0, 0, 0)).thenReturn(response0);
			when(mock.connectPrinter(1, null, 0, 0, 0, 0)).thenReturn(response1);
			when(mock.connectPrinter(2, null, 0, 0, 0, 0)).thenReturn(response2);
			when(mock.connectPrinter(3, null, 0, 0, 0, 0)).thenReturn(response3);
			when(mock.connectPrinter(4, null, 0, 0, 0, 0)).thenReturn(response4);
			when(mock.connectPrinter(5, null, 0, 0, 0, 0)).thenReturn(response5);
			assertAll(() -> assertEquals(response0, driver.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, driver.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, driver.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, driver.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, driver.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, driver.connectPrinter(5, null, 0, 0, 0, 0)));
		}

		@Test
		void printerInErrorStateTest() {
			PbCubeResponse response0 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response1 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response2 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response3 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response4 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response5 = new PbCubeResponse(false, "73", "The printer is in an error status");

			when(mock.connectPrinter(0, null, 0, 0, 0, 0)).thenReturn(response0);
			when(mock.connectPrinter(1, null, 0, 0, 0, 0)).thenReturn(response1);
			when(mock.connectPrinter(2, null, 0, 0, 0, 0)).thenReturn(response2);
			when(mock.connectPrinter(3, null, 0, 0, 0, 0)).thenReturn(response3);
			when(mock.connectPrinter(4, null, 0, 0, 0, 0)).thenReturn(response4);
			when(mock.connectPrinter(5, null, 0, 0, 0, 0)).thenReturn(response5);
			assertAll(() -> assertEquals(response0, driver.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, driver.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, driver.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, driver.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, driver.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, driver.connectPrinter(5, null, 0, 0, 0, 0)));
		}
	}

	@Nested
	class TestDisconnectPrinter {
		@Test
		@DisplayName("TestTrueDisconnectPrinter")
		void testTrueDisconnectPrinter() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.disconnectPrinter()).thenReturn(response);

			assertEquals(response, driver.disconnectPrinter());

		}

		@Test
		@DisplayName("TestFalseDisconnectPrinter")
		void testFalseDisconnectPrinter() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.disconnectPrinter()).thenReturn(response);

			assertEquals(response, driver.disconnectPrinter());

		}

	}

	@Nested
	class TestCheckStatus {

		@Test
		@DisplayName("TestForNormal(No Error)")
		void normalTest() {
			PbCubeResponse response = new PbCubeResponse(true, "0", "Normal(No error)");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForNoPaper")
		void noPaperTest() {
			PbCubeResponse response = new PbCubeResponse(false, "1", "No Paper");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForCoverOpen")
		void coverOpenTest() {
			PbCubeResponse response = new PbCubeResponse(false, "2", "Cover Open");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForCutterJammed")
		void cutterJamTest() {
			PbCubeResponse response = new PbCubeResponse(false, "3", "Cutter jammed");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForTPHOverheat")
		void overheatTest() {
			PbCubeResponse response = new PbCubeResponse(false, "4", "TPH Overheat");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForAutoSensingFailure")
		void autoSensingTest() {
			PbCubeResponse response = new PbCubeResponse(false, "5", "Auto-sensing failure (Gap detection error)");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForRibbonEndError")
		void ribbonEndTest() {
			PbCubeResponse response = new PbCubeResponse(false, "6", "Ribbon end error");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForBoardOverHeat")
		void boardOverheatTest() {
			PbCubeResponse response = new PbCubeResponse(false, "11", "Board Overheat");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForMotorOverHeat")
		void motorOverheatTest() {
			PbCubeResponse response = new PbCubeResponse(false, "12", "Motor Overheat");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForWaitingForTheLabelToBeTaken")
		void labelTest() {
			PbCubeResponse response = new PbCubeResponse(false, "13", "Waiting for the label to be taken");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestForPauseStatus")
		void pauseStatusTest() {
			PbCubeResponse response = new PbCubeResponse(false, "30", "Pause status");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestRollNearEmptyStatus")
		void rollEmptyTest() {
			PbCubeResponse response = new PbCubeResponse(false, "31", "Roll near empty status");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}

		@Test
		@DisplayName("TestUnknownError")
		void unknownErrorTest() {
			PbCubeResponse response = new PbCubeResponse(false, "99", "Unknown error");
			when(mock.checkStatus()).thenReturn(response);

			assertEquals(response, driver.checkStatus());

		}
	}

	@Nested
	class TestGetScaleVersion {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetScaleVersion() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getScaleVersion()).thenReturn(response);

			assertEquals(response, driver.getScaleVersion());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetScaleVersion() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getScaleVersion()).thenReturn(response);

			assertEquals(response, driver.getScaleVersion());
		}

	}

	@Nested
	class TestGetScaleWeight {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetScaleWeight() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getScaleWeight()).thenReturn(response);

			assertEquals(response, driver.getScaleWeight());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetScaleWeight() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getScaleWeight()).thenReturn(response);

			assertEquals(response, driver.getScaleWeight());
		}

	}

	@Nested
	class TestGetScaleGravityInformation {

		@Test
		@DisplayName("TestForTrue")
		void testTrueScaleGravityInfo() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getScaleGravityInformation()).thenReturn(response);

			assertEquals(response, driver.getScaleGravityInformation());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseScaleGravityInfo() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getScaleGravityInformation()).thenReturn(response);

			assertEquals(response, driver.getScaleGravityInformation());
		}

	}

	@Nested
	class TestSetScaleUnit {

		@Test
		@DisplayName("TestForTrue")
		void testTrueSetScaleUnit() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.setScaleUnit()).thenReturn(response);

			assertEquals(response, driver.setScaleUnit());
		}

		@Test
		@DisplayName("TestForFalse")
		void TestFalseSetScaleUnit() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.setScaleUnit()).thenReturn(response);

			assertEquals(response, driver.setScaleUnit());
		}

	}

	@Nested
	class TestSetScaleZero {

		@Test
		@DisplayName("TestForTrue")
		void testTrueSetScaleZero() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.setScaleZero()).thenReturn(response);

			assertEquals(response, driver.setScaleZero());
		}

		@Test
		@DisplayName("TestForFalse")
		void TestFalseSetScaleZero() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.setScaleZero()).thenReturn(response);

			assertEquals(response, driver.setScaleZero());
		}

	}

	@Nested
	class TestGetScaleStatus {

		@Test
		@DisplayName("TestNormalStatus")
		void TestNormal() {
			PbCubeResponse response = new PbCubeResponse(true, "0x60", "Normal(No error)");
			when(mock.getScaleStatus()).thenReturn(response);

			assertEquals(response, driver.getScaleStatus());
		}

		@Test
		@DisplayName("TestMotionDetection")
		void TestMotion() {
			PbCubeResponse response = new PbCubeResponse(false, "0x61", "Motion Detection");
			when(mock.getScaleStatus()).thenReturn(response);

			assertEquals(response, driver.getScaleStatus());
		}

		@Test
		@DisplayName("TestCapacityOver")
		void TestCapcityOver() {
			PbCubeResponse response = new PbCubeResponse(false, "0x62", "Capacity Over");
			when(mock.getScaleStatus()).thenReturn(response);

			assertEquals(response, driver.getScaleStatus());
		}

		@Test
		@DisplayName("TestUnderZero")
		void TestUnderZero() {
			PbCubeResponse response = new PbCubeResponse(false, "0x64", "Under Zero");
			when(mock.getScaleStatus()).thenReturn(response);

			assertEquals(response, driver.getScaleStatus());
		}

		@Test
		@DisplayName("TestScaleFailure")
		void TestScaleFailure() {
			PbCubeResponse response = new PbCubeResponse(false, "0x7F", "Scale Failure(Not Responding)");
			when(mock.getScaleStatus()).thenReturn(response);

			assertEquals(response, driver.getScaleStatus());
		}

		@Test
		@DisplayName("TestUnknownError")
		void TestUnknownError() {
			PbCubeResponse response = new PbCubeResponse(false, "0xFF", "Unknown Error");
			when(mock.getScaleStatus()).thenReturn(response);

			assertEquals(response, driver.getScaleStatus());
		}
	}

	@Nested
	class TestGetPrinterMacAddress {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetPrinterMacAddress() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getPrinterMacAddress()).thenReturn(response);

			assertEquals(response, driver.getPrinterMacAddress());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetPrinterMacAddress() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getPrinterMacAddress()).thenReturn(response);

			assertEquals(response, driver.getPrinterMacAddress());
		}

	}

	@Nested
	class TestGetRollType {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetRollType() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getRollType()).thenReturn(response);

			assertEquals(response, driver.getRollType());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetRollType() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getRollType()).thenReturn(response);

			assertEquals(response, driver.getRollType());
		}

	}

	@Nested
	class TestSetMediaRecognition {

		@Test
		@DisplayName("TestForTrueParam0")
		void testTrueSetMediaRecognition0() {
			PbCubeResponse response = new PbCubeResponse(true, "0", null);
			when(mock.setMediaRecognitionMode(0)).thenReturn(response);

			assertEquals(response, driver.setMediaRecognitionMode(0));
		}

		@Test
		@DisplayName("TestForTrueParam1")
		void testTrueSetMediaRecognition1() {
			PbCubeResponse response = new PbCubeResponse(true, "0", null);
			when(mock.setMediaRecognitionMode(1)).thenReturn(response);

			assertEquals(response, driver.setMediaRecognitionMode(1));
		}

		@Test
		@DisplayName("TestForFalseParam0")
		void testFalseSetMediaRecognition0() {

			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.setMediaRecognitionMode(0)).thenReturn(response);

			assertEquals(response, driver.setMediaRecognitionMode(0));

		}

		@Test
		@DisplayName("TestForFalseParam1")
		void testFalseSetMediaRecognition1() {

			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.setMediaRecognitionMode(1)).thenReturn(response);

			assertEquals(response, driver.setMediaRecognitionMode(1));

		}

	}

	@Nested
	class TestgetPrinterInformation {

		@Test
		@DisplayName("TestForTrueParam0")
		void testTrueGetPrinterInfo0() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getPrinterInformation(0)).thenReturn(response);

			assertEquals(response, driver.getPrinterInformation(0));
		}

		@Test
		@DisplayName("TestForTrueParam2")
		void testTrueGetPrinterInfo2() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getPrinterInformation(2)).thenReturn(response);

			assertEquals(response, driver.getPrinterInformation(2));
		}

		@Test
		@DisplayName("TestForTrueParam4")
		void testTrueGetPrinterInfo4() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.getPrinterInformation(4)).thenReturn(response);

			assertEquals(response, driver.getPrinterInformation(4));
		}

		@Test
		@DisplayName("TestForTrueParam0")
		void testFalseGetPrinterInfo0() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getPrinterInformation(0)).thenReturn(response);

			assertEquals(response, driver.getPrinterInformation(0));
		}

		@Test
		@DisplayName("TestForFalseParam2")
		void testFalseGetPrinterInfo2() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getPrinterInformation(2)).thenReturn(response);

			assertEquals(response, driver.getPrinterInformation(2));
		}

		@Test
		@DisplayName("TestForFalseParam4")
		void testFalseGetPrinterInfo4() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getPrinterInformation(4)).thenReturn(response);

			assertEquals(response, driver.getPrinterInformation(4));
		}
	}
    @Nested
	class TestRebootPrinter {

		@Test
		@DisplayName("TestForTrue")
		void testTrueRebootPrinter() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.rebootPrinter()).thenReturn(response);

			assertEquals(response, driver.rebootPrinter());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseRebootPrinter() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.rebootPrinter()).thenReturn(response);

			assertEquals(response, driver.rebootPrinter());
		}
	}

	@Nested
	class TestGetPrintCount {

		@Test
		@DisplayName("TestForTrueParam0")
		void testTrueGetPrintCount0() {
			PbCubeResponse response = new PbCubeResponse(true, "0", null);
			when(mock.getPrintCount(0)).thenReturn(response);

			assertEquals(response, driver.getPrintCount(0));
		}

		@Test
		@DisplayName("TestForTrueParam1")
		void testTrueGetPrintCount1() {
			PbCubeResponse response = new PbCubeResponse(true, "1", null);
			when(mock.getPrintCount(1)).thenReturn(response);

			assertEquals(response, driver.getPrintCount(1));
		}

		@Test
		@DisplayName("TestFalseParam0")
		void testFalseGetPrintCount0() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getPrintCount(0)).thenReturn(response);

			assertEquals(response, driver.getPrintCount(0));
		}

		@Test
		@DisplayName("TestFalseParam1")
		void testFalseGetPrintCount1() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.getPrintCount(1)).thenReturn(response);

			assertEquals(response, driver.getPrintCount(1));
		}
	}

}