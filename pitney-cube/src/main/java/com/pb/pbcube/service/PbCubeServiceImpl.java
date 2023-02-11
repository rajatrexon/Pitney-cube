package com.pb.pbcube.service;

import java.nio.charset.StandardCharsets;

import com.pb.pbcube.jna.NativeDllAccess;
import com.pb.pbcube.response.PbCubeResponse;

public  class PbCubeServiceImpl implements PbCubeService {

	NativeDllAccess cubeDLL = NativeDllAccess.INSTANCE;

	
	

	@Override
	public PbCubeResponse connectPrinter(int nInterface, String szPortName, int nBaudRate, int nDataBits, int nParity,
			int nStopBits) {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		int connectPrinter = cubeDLL.ConnectPrinterEx(nInterface, szPortName, nBaudRate, nDataBits, nParity, nStopBits);
		switch (connectPrinter) { 
		case 0:
			response.setResult(true);
			response.setValue("0");
			response.setErrorMessage("Success to connect");

			break;
		case 71:
			response.setErrorMessage("No printers available to connect");
			response.setValue("71");

			break;
		case 72:
			response.setErrorMessage("Not supported printer");
			response.setValue("72");
			break;
		case 73:
			response.setErrorMessage("The printer is in an error status");
			response.setValue("73");
			break;
		default:
			response.setErrorMessage("Unknown Error");
			break;

		}
		return response;
	}

	@Override
	public PbCubeResponse disconnectPrinter() {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		boolean disconnect = cubeDLL.DisconnectPrinter();

		response.setResult(disconnect);

		return response;
	}

	@Override
	public PbCubeResponse checkStatus() {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		int status = cubeDLL.CheckStatus();

		switch (status) {
		case 0:
			response.setErrorMessage("Normal(No error)");
			response.setResult(true);
			response.setValue("0");
			break;
		case 1:
			response.setErrorMessage("No Paper");
			response.setValue("1");
			break;
		case 2:
			response.setErrorMessage("Cover Open");
			response.setValue("2");
			break;
		case 3:
			response.setErrorMessage("Cutter jammed");
			response.setValue("3");
			break;
		case 4:
			response.setErrorMessage("TPH Overheat");
			response.setValue("4");
			break;
		case 5:
			response.setErrorMessage("Auto-sensing failure (Gap detection error)");
			response.setValue("5");
			break;
		case 6:
			response.setErrorMessage("Ribbon end error");
			response.setValue("6");
			break;
		case 11:
			response.setErrorMessage("Board Overheat");
			response.setValue("11");
			break;
		case 12:
			response.setErrorMessage("Motor Overheat");
			response.setValue("12");
			break;
		case 13:
			response.setErrorMessage("Waiting for the label to be taken");
			response.setValue("13");
			break;
		case 30:
			response.setErrorMessage("Pause status");
			response.setValue("30");
			break;
		case 31:
			response.setErrorMessage("Roll near empty status");
			response.setValue("31");
			break;
		case 99:
			response.setErrorMessage("Unknown error");
			response.setValue("99");
			break;

		}

		return response;
	}

	@Override
	public PbCubeResponse getScaleVersion() {
		byte[] pszVersion = new byte[48];
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.GetScaleVersion(pszVersion)) {
			response.setResult(true);
			String str = new String(pszVersion, StandardCharsets.UTF_8);
			response.setValue(str.trim());
		}

		return response;
	}

	@Override
	public PbCubeResponse getScaleWeight() {
		byte[] pszWeight = new byte[48];
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		int scaleWeight = cubeDLL.GetScaleWeight(pszWeight);
		if (scaleWeight == 1) {
			response.setResult(true);
			String str = new String(pszWeight, StandardCharsets.UTF_8);
			response.setValue(str.trim());
		}

		return response;
	}

	@Override
	public PbCubeResponse getScaleGravityInformation() {
		byte[] pszInfo = new byte[48];
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.GetScaleGravityInformation(pszInfo)) {
			response.setResult(true);
			String str = new String(pszInfo, StandardCharsets.UTF_8);
			response.setValue(str.trim());
		}
		return response;
	}

	@Override
	public PbCubeResponse setScaleUnit() {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.SetScaleUnit()) {
			response.setResult(true);
		}
		return response;
	}

	@Override
	public PbCubeResponse setScaleZero() {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.SetScaleZero()) {
			response.setResult(true);
		}
		return response;
	}

	@Override
	public PbCubeResponse getScaleStatus() {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		int status = cubeDLL.GetScaleStatus();
		switch (status) {
		case 0x60:
			response.setResult(true);
			response.setValue("0x60");
			response.setErrorMessage("Normal(No error)");
			break;
		case 0x61:
			response.setValue("0x61");
			response.setErrorMessage("Motion Detection");
			break;
		case 0x62:
			response.setValue("0x62");
			response.setErrorMessage("Capacity Over");
			break;
		case 0x64:
			response.setValue("0x64");
			response.setErrorMessage("Under Zero");
			break;
		case 0x7F:
			response.setValue("0x7F");
			response.setErrorMessage("Scale Failure(Not Responding)");
			break;
		case 0xFF:
			response.setValue("0xFF");
			response.setErrorMessage("Unknown Error");
			break;
		}
		return response;
	}

	@Override
	public PbCubeResponse getPrinterMacAddress() {
		byte[] pszAddress = new byte[48];
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		boolean macAddress = cubeDLL.GetPrinterMacAddress(pszAddress);
		if (macAddress) {
			String str = new String(pszAddress, StandardCharsets.UTF_8);
			response.setValue(str.trim());
			response.setResult(true);
		}
		return response;
	}

	@Override
	public PbCubeResponse getRollType() {
		byte[] pszType = new byte[48];
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.GetRollType(pszType)) {
			String str = new String(pszType, StandardCharsets.UTF_8);
			response.setResult(true);
			response.setValue(str.trim());
		}
		return response;
	}

	@Override
	public PbCubeResponse setMediaRecognitionMode(int nOption) {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		int setMediaRecognitionMode = cubeDLL.SetMediaRecognitionMode(nOption);

		if (setMediaRecognitionMode == 0) {
			response.setResult(true);
			response.setValue("0");
		}
		return response;
	}

	@Override
	public PbCubeResponse getPrinterInformation(int nOption) {

		byte[] pszInfo = new byte[20];
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.GetPrinterInformation(nOption, pszInfo)) {
			String str = new String(pszInfo, StandardCharsets.UTF_8);
			
			response.setResult(true);
			response.setValue(str.trim());
			
		}
		return response;
	}

	@Override
	public PbCubeResponse rebootPrinter() {
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		if (cubeDLL.RebootPrinter()) {
			response.setResult(true);
		}
		return response;
	}

	@Override
	public PbCubeResponse getPrintCount(int nOption) {
		
		PbCubeResponse response = new PbCubeResponse(false, null, null);
		int printCount = cubeDLL.GetPrintCount(nOption);
		if (printCount == 1) {
			String s = Integer.toString(nOption);
			response.setResult(true);
			response.setValue(s);
		}
		return response;
	}

}
