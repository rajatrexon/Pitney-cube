package com.pb.pbcube.service;

import com.pb.pbcube.response.PbCubeResponse;

public interface PbCubeService {

	PbCubeResponse connectPrinter(int nInterface, String szPortName, int nBaudRate, int nDataBits, int nParity, int nStopBits); //working

	PbCubeResponse disconnectPrinter() ;//working

	PbCubeResponse checkStatus();//working

	PbCubeResponse getScaleVersion();//working

	PbCubeResponse getScaleWeight();//working

	PbCubeResponse getScaleGravityInformation();//working

	// void setScaleGravityConstant();//not implemented
	
	PbCubeResponse setScaleUnit();

	PbCubeResponse setScaleZero();//working

	PbCubeResponse getScaleStatus();//working

	PbCubeResponse getPrinterMacAddress();//working

	PbCubeResponse getRollType();//working

	 PbCubeResponse getPrintCount(int nOption);//Not working

	PbCubeResponse setMediaRecognitionMode(int nOption);//working but giving failed output

	// Response getPB_PrinterList();//not working

	PbCubeResponse getPrinterInformation(int nOption);//working

	PbCubeResponse rebootPrinter();//working

	// Response getPB_ProductNumber();//not working

	// Response getPB_SerialNumber();//not working

}