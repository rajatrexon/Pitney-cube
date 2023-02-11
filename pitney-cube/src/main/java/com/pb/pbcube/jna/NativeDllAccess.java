package com.pb.pbcube.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
//Class Accessing dll file using jna
public interface NativeDllAccess extends Library {

	NativeDllAccess INSTANCE =  Native.load(("PrinterandScaleAPI_x64"),
			NativeDllAccess.class);
	

	 int ConnectPrinterEx(int nInterface, String szPortName, int nBaudRate, int nDataBits, int nParity, int nStopBits);

	boolean DisconnectPrinter();

	int CheckStatus();

	boolean GetScaleVersion(byte[] pszVersion);

	int GetScaleWeight(byte[] pszWeight);

	boolean GetScaleGravityInformation(byte[] pszInfo);

	boolean SetScaleGravityConstant();
	

	
	boolean SetScaleUnit();

	boolean SetScaleZero();

	int GetScaleStatus();

	boolean GetPrinterMacAddress(byte[] pszAddress);

	boolean GetRollType(byte[] pszType);

	int GetPrintCount(int nOption);

	int SetMediaRecognitionMode(int nOption);

	long GetPB_PrinterList(byte[] pszPrtList);

	boolean GetPrinterInformation(int nOption, byte[] pszInfo);

	boolean RebootPrinter();

	long GetPB_ProductNumber(StringBuilder number);

	long GetPB_SerialNumber(StringBuilder number);

}
