package com.pb.pbcube.service;

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

import com.pb.pbcube.jna.NativeDllAccess;
import com.pb.pbcube.response.PbCubeResponse;

class PbCubeServiceImplTest {

	@Mock
	NativeDllAccess mock = NativeDllAccess.INSTANCE;

	@InjectMocks
	PbCubeServiceImpl service;

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

			when(mock.ConnectPrinterEx(0, null, 0, 0, 0, 0)).thenReturn(0);
			when(mock.ConnectPrinterEx(1, null, 0, 0, 0, 0)).thenReturn(0);
			when(mock.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(0);
			when(mock.ConnectPrinterEx(3, null, 0, 0, 0, 0)).thenReturn(0);
			when(mock.ConnectPrinterEx(4, null, 0, 0, 0, 0)).thenReturn(0);
			when(mock.ConnectPrinterEx(5, null, 0, 0, 0, 0)).thenReturn(0);
			assertAll(() -> assertEquals(response0, service.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, service.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, service.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, service.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, service.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, service.connectPrinter(5, null, 0, 0, 0, 0)));

		}

		@Test
		void noPrinterAvailableToConnectTest() {

			PbCubeResponse response0 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response1 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response2 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response3 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response4 = new PbCubeResponse(false, "71", "No printers available to connect");
			PbCubeResponse response5 = new PbCubeResponse(false, "71", "No printers available to connect");

			when(mock.ConnectPrinterEx(0, null, 0, 0, 0, 0)).thenReturn(71);
			when(mock.ConnectPrinterEx(1, null, 0, 0, 0, 0)).thenReturn(71);
			when(mock.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(71);
			when(mock.ConnectPrinterEx(3, null, 0, 0, 0, 0)).thenReturn(71);
			when(mock.ConnectPrinterEx(4, null, 0, 0, 0, 0)).thenReturn(71);
			when(mock.ConnectPrinterEx(5, null, 0, 0, 0, 0)).thenReturn(71);
			assertAll(() -> assertEquals(response0, service.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, service.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, service.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, service.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, service.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, service.connectPrinter(5, null, 0, 0, 0, 0)));

		}

		@Test
		void notSupportedPrinterTest() {
			PbCubeResponse response0 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response1 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response2 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response3 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response4 = new PbCubeResponse(false, "72", "Not supported printer");
			PbCubeResponse response5 = new PbCubeResponse(false, "72", "Not supported printer");

			when(mock.ConnectPrinterEx(0, null, 0, 0, 0, 0)).thenReturn(72);
			when(mock.ConnectPrinterEx(1, null, 0, 0, 0, 0)).thenReturn(72);
			when(mock.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(72);
			when(mock.ConnectPrinterEx(3, null, 0, 0, 0, 0)).thenReturn(72);
			when(mock.ConnectPrinterEx(4, null, 0, 0, 0, 0)).thenReturn(72);
			when(mock.ConnectPrinterEx(5, null, 0, 0, 0, 0)).thenReturn(72);
			assertAll(() -> assertEquals(response0, service.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, service.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, service.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, service.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, service.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, service.connectPrinter(5, null, 0, 0, 0, 0)));
		}

		@Test
		void printerInErrorStateTest() {
			PbCubeResponse response0 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response1 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response2 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response3 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response4 = new PbCubeResponse(false, "73", "The printer is in an error status");
			PbCubeResponse response5 = new PbCubeResponse(false, "73", "The printer is in an error status");

			when(mock.ConnectPrinterEx(0, null, 0, 0, 0, 0)).thenReturn(73);
			when(mock.ConnectPrinterEx(1, null, 0, 0, 0, 0)).thenReturn(73);
			when(mock.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(73);
			when(mock.ConnectPrinterEx(3, null, 0, 0, 0, 0)).thenReturn(73);
			when(mock.ConnectPrinterEx(4, null, 0, 0, 0, 0)).thenReturn(73);
			when(mock.ConnectPrinterEx(5, null, 0, 0, 0, 0)).thenReturn(73);
			assertAll(() -> assertEquals(response0, service.connectPrinter(0, null, 0, 0, 0, 0)),
					() -> assertEquals(response1, service.connectPrinter(1, null, 0, 0, 0, 0)),
					() -> assertEquals(response2, service.connectPrinter(2, null, 0, 0, 0, 0)),
					() -> assertEquals(response3, service.connectPrinter(3, null, 0, 0, 0, 0)),
					() -> assertEquals(response4, service.connectPrinter(4, null, 0, 0, 0, 0)),
					() -> assertEquals(response5, service.connectPrinter(5, null, 0, 0, 0, 0)));
		}
	}

	@Nested
	class TestDisconnectPrinter {
		@Test
		@DisplayName("TestTrueDisconnectPrinter")
		void testTrueDisconnectPrinter() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.DisconnectPrinter()).thenReturn(true);

			assertEquals(response, service.disconnectPrinter());

		}

		@Test
		@DisplayName("TestFalseDisconnectPrinter")
		void testFalseDisconnectPrinter() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.DisconnectPrinter()).thenReturn(false);

			assertEquals(response, service.disconnectPrinter());

		}

	}

	@Nested
	class TestCheckStatus {

		@Test
		@DisplayName("TestForNormal(No Error)")
		void normalTest() {
			PbCubeResponse response = new PbCubeResponse(true, "0", "Normal(No error)");
			when(mock.CheckStatus()).thenReturn(0);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForNoPaper")
		void noPaperTest() {
			PbCubeResponse response = new PbCubeResponse(false, "1", "No Paper");
			when(mock.CheckStatus()).thenReturn(1);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForCoverOpen")
		void coverOpenTest() {
			PbCubeResponse response = new PbCubeResponse(false, "2", "Cover Open");
			when(mock.CheckStatus()).thenReturn(2);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForCutterJammed")
		void cutterJamTest() {
			PbCubeResponse response = new PbCubeResponse(false, "3", "Cutter jammed");
			when(mock.CheckStatus()).thenReturn(3);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForTPHOverheat")
		void overheatTest() {
			PbCubeResponse response = new PbCubeResponse(false, "4", "TPH Overheat");
			when(mock.CheckStatus()).thenReturn(4);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForAutoSensingFailure")
		void autoSensingTest() {
			PbCubeResponse response = new PbCubeResponse(false, "5", "Auto-sensing failure (Gap detection error)");
			when(mock.CheckStatus()).thenReturn(5);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForRibbonEndError")
		void ribbonEndTest() {
			PbCubeResponse response = new PbCubeResponse(false, "6", "Ribbon end error");
			when(mock.CheckStatus()).thenReturn(6);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForBoardOverHeat")
		void boardOverheatTest() {
			PbCubeResponse response = new PbCubeResponse(false, "11", "Board Overheat");
			when(mock.CheckStatus()).thenReturn(11);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForMotorOverHeat")
		void motorOverheatTest() {
			PbCubeResponse response = new PbCubeResponse(false, "12", "Motor Overheat");
			when(mock.CheckStatus()).thenReturn(12);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForWaitingForTheLabelToBeTaken")
		void labelTest() {
			PbCubeResponse response = new PbCubeResponse(false, "13", "Waiting for the label to be taken");
			when(mock.CheckStatus()).thenReturn(13);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestForPauseStatus")
		void pauseStatusTest() {
			PbCubeResponse response = new PbCubeResponse(false, "30", "Pause status");
			when(mock.CheckStatus()).thenReturn(30);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestRollNearEmptyStatus")
		void rollEmptyTest() {
			PbCubeResponse response = new PbCubeResponse(false, "31", "Roll near empty status");
			when(mock.CheckStatus()).thenReturn(31);

			assertEquals(response, service.checkStatus());

		}

		@Test
		@DisplayName("TestUnknownError")
		void unknownErrorTest() {
			PbCubeResponse response = new PbCubeResponse(false, "99", "Unknown error");
			when(mock.CheckStatus()).thenReturn(99);

			assertEquals(response, service.checkStatus());

		}
	}

	@Nested
	class TestGetScaleVersion {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetScaleVersion() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetScaleVersion(new byte[48])).thenReturn(true);

			assertEquals(response, service.getScaleVersion());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetScaleVersion() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetScaleVersion(new byte[48])).thenReturn(false);

			assertEquals(response, service.getScaleVersion());
		}

	}

	@Nested
	class TestGetScaleWeight {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetScaleWeight() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetScaleWeight(new byte[48])).thenReturn(1);

			assertEquals(response, service.getScaleWeight());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetScaleWeight() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetScaleWeight(new byte[48])).thenReturn(0);

			assertEquals(response, service.getScaleWeight());
		}

	}

	@Nested
	class TestGetScaleGravityInformation {

		@Test
		@DisplayName("TestForTrue")
		void testTrueScaleGravityInfo() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetScaleGravityInformation(new byte[48])).thenReturn(true);

			assertEquals(response, service.getScaleGravityInformation());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseScaleGravityInfo() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetScaleGravityInformation(new byte[48])).thenReturn(false);

			assertEquals(response, service.getScaleGravityInformation());
		}

	}

	@Nested
	class TestSetScaleUnit {

		@Test
		@DisplayName("TestForTrue")
		void testTrueSetScaleUnit() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.SetScaleUnit()).thenReturn(true);

			assertEquals(response, service.setScaleUnit());
		}

		@Test
		@DisplayName("TestForFalse")
		void TestFalseSetScaleUnit() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.SetScaleUnit()).thenReturn(false);

			assertEquals(response, service.setScaleUnit());
		}

	}

	@Nested
	class TestSetScaleZero {

		@Test
		@DisplayName("TestForTrue")
		void testTrueSetScaleZero() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.SetScaleZero()).thenReturn(true);

			assertEquals(response, service.setScaleZero());
		}

		@Test
		@DisplayName("TestForFalse")
		void TestFalseSetScaleZero() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.SetScaleZero()).thenReturn(false);

			assertEquals(response, service.setScaleZero());
		}

	}

	@Nested
	class TestGetScaleStatus {

		@Test
		@DisplayName("TestNormalStatus")
		void TestNormal() {
			PbCubeResponse response = new PbCubeResponse(true, "0x60", "Normal(No error)");
			when(mock.GetScaleStatus()).thenReturn(0x60);

			assertEquals(response, service.getScaleStatus());
		}

		@Test
		@DisplayName("TestMotionDetection")
		void TestMotion() {
			PbCubeResponse response = new PbCubeResponse(false, "0x61", "Motion Detection");
			when(mock.GetScaleStatus()).thenReturn(0x61);

			assertEquals(response, service.getScaleStatus());
		}

		@Test
		@DisplayName("TestCapacityOver")
		void TestCapcityOver() {
			PbCubeResponse response = new PbCubeResponse(false, "0x62", "Capacity Over");
			when(mock.GetScaleStatus()).thenReturn(0x62);

			assertEquals(response, service.getScaleStatus());
		}

		@Test
		@DisplayName("TestUnderZero")
		void TestUnderZero() {
			PbCubeResponse response = new PbCubeResponse(false, "0x64", "Under Zero");
			when(mock.GetScaleStatus()).thenReturn(0x64);

			assertEquals(response, service.getScaleStatus());
		}

		@Test
		@DisplayName("TestScaleFailure")
		void TestScaleFailure() {
			PbCubeResponse response = new PbCubeResponse(false, "0x7F", "Scale Failure(Not Responding)");
			when(mock.GetScaleStatus()).thenReturn(0x7F);

			assertEquals(response, service.getScaleStatus());
		}

		@Test
		@DisplayName("TestUnknownError")
		void TestUnknownError() {
			PbCubeResponse response = new PbCubeResponse(false, "0xFF", "Unknown Error");
			when(mock.GetScaleStatus()).thenReturn(0xFF);

			assertEquals(response, service.getScaleStatus());
		}
	}

	@Nested
	class TestGetPrinterMacAddress {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetPrinterMacAddress() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetPrinterMacAddress(new byte[48])).thenReturn(true);

			assertEquals(response, service.getPrinterMacAddress());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetPrinterMacAddress() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetPrinterMacAddress(new byte[48])).thenReturn(false);

			assertEquals(response, service.getPrinterMacAddress());
		}

	}

	@Nested
	class TestGetRollType {

		@Test
		@DisplayName("TestForTrue")
		void testTrueGetRollType() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetRollType(new byte[48])).thenReturn(true);

			assertEquals(response, service.getRollType());
		}

		@Test
		@DisplayName("TestForFalse")
		void testFalseGetRollType() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetRollType(new byte[48])).thenReturn(false);

			assertEquals(response, service.getRollType());
		}

	}

	@Nested
	class TestSetMediaRecognition {

		@Test
		@DisplayName("TestTrueFor0Param")
		void testSetMediaRecognition0Success() {
			PbCubeResponse response = new PbCubeResponse(true, "0", null);
			when(mock.SetMediaRecognitionMode(0)).thenReturn(0);

			assertEquals(response, service.setMediaRecognitionMode(0));
		}

		@Test
		@DisplayName("TestTrueFor1Param")
		void testTrueSetMediaRecognition1() {
			PbCubeResponse response = new PbCubeResponse(true, "0", null);
			when(mock.SetMediaRecognitionMode(1)).thenReturn(0);

			assertEquals(response, service.setMediaRecognitionMode(1));
		}

		@Test
		@DisplayName("TestFalseForParam0")
		void testFalseSetMediaRecognition0() {

			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.SetMediaRecognitionMode(0)).thenReturn(1);

			assertEquals(response, service.setMediaRecognitionMode(0));

		}

		@Test
		@DisplayName("TestFalseForParam1")
		void testFalseSetMediaRecognition1() {

			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.SetMediaRecognitionMode(1)).thenReturn(1);

			assertEquals(response, service.setMediaRecognitionMode(1));

		}

	}

	@Nested
	class TestgetPrinterInformation {

		@Test
		@DisplayName("TestTrueForParam0")
		void testTrueGetPrinterInfo0() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetPrinterInformation(0, new byte[20])).thenReturn(true);

			assertEquals(response, service.getPrinterInformation(0));
		}

		@Test
		@DisplayName("TestTrueForParam2")
		void testTrueGetPrinterInfo2() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetPrinterInformation(2, new byte[20])).thenReturn(true);

			assertEquals(response, service.getPrinterInformation(2));
		}

		@Test
		@DisplayName("TestTrueForParam4")
		void testTrueGetPrinterInfo4() {
			PbCubeResponse response = new PbCubeResponse(true, "", null);
			when(mock.GetPrinterInformation(4, new byte[20])).thenReturn(true);

			assertEquals(response, service.getPrinterInformation(4));
		}

		@Test
		@DisplayName("TestFalseForParam0")
		void testFalseGetPrinterInfo0() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetPrinterInformation(0, new byte[20])).thenReturn(false);

			assertEquals(response, service.getPrinterInformation(0));
		}

		@Test
		@DisplayName("TestFalseForParam2")
		void testFalseGetPrinterInfo2() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetPrinterInformation(2, new byte[20])).thenReturn(false);

			assertEquals(response, service.getPrinterInformation(2));
		}

		@Test
		@DisplayName("TestFalseForParam4")
		void testFalseGetPrinterInfo4() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetPrinterInformation(4, new byte[20])).thenReturn(false);

			assertEquals(response, service.getPrinterInformation(4));
		}
	}
     
	@Nested
	class TestRebootPrinter {

		@Test
		void testTrueRebootPrinter() {
			PbCubeResponse response = new PbCubeResponse(true, null, null);
			when(mock.RebootPrinter()).thenReturn(true);

			assertEquals(response, service.rebootPrinter());
		}

		@Test
		void testFalseRebootPrinter() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.RebootPrinter()).thenReturn(false);

			assertEquals(response, service.rebootPrinter());
		}
	}

	@Nested
	class TestGetPrintCount {

		@Test
		void testTrueGetPrintCount0() {
			PbCubeResponse response = new PbCubeResponse(true, "0", null);
			when(mock.GetPrintCount(0)).thenReturn(1);

			assertEquals(response, service.getPrintCount(0));
		}

		@Test
		void testTrueGetPrintCount1() {
			PbCubeResponse response = new PbCubeResponse(true, "1", null);
			when(mock.GetPrintCount(1)).thenReturn(1);

			assertEquals(response, service.getPrintCount(1));
		}

		@Test
		void testFalseGetPrintCount0() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetPrintCount(0)).thenReturn(0);

			assertEquals(response, service.getPrintCount(0));
		}

		@Test
		void testFalseGetPrintCount1() {
			PbCubeResponse response = new PbCubeResponse(false, null, null);
			when(mock.GetPrintCount(1)).thenReturn(0);

			assertEquals(response, service.getPrintCount(1));
		}
	}

}
