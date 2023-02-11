package com.pb.pbcube;


import com.pb.pbcube.response.PbCubeResponse;
import com.pb.pbcube.service.PbCubeService;
import com.pb.pbcube.service.PbCubeServiceImpl;
//Controller
public class PbCubeDriver extends PbCubeServiceImpl  {
	

    PbCubeService pb = new PbCubeServiceImpl();
	
	@Override
	public PbCubeResponse connectPrinter(int nInterface ,String szPortName,int nBaudRate,int nDataBits,int nParity,int nStopBits) {
		return pb.connectPrinter(nInterface, szPortName, nBaudRate, nDataBits, nParity, nStopBits);
		 
		
	}
     
	@Override
	public PbCubeResponse disconnectPrinter() {
		return pb.disconnectPrinter() ;
	}

	@Override
	public PbCubeResponse checkStatus() {
	    return	pb.checkStatus();
	}

	@Override
	public PbCubeResponse getScaleVersion() {
		return pb.getScaleVersion();
	}

	@Override
	public PbCubeResponse getScaleWeight() {
		return pb.getScaleWeight();
	}

	@Override
	public PbCubeResponse getScaleGravityInformation() {
		return pb.getScaleGravityInformation();
	}

	@Override
	public PbCubeResponse setScaleUnit() {
		return pb.setScaleUnit();
	}

	@Override
	public PbCubeResponse setScaleZero() {
		return pb.setScaleZero();
	}

	@Override
	public PbCubeResponse getScaleStatus() {
		return pb.getScaleStatus();
	}

	@Override
	public PbCubeResponse getPrinterMacAddress() {
		return pb.getPrinterMacAddress();
	}

	@Override
	public PbCubeResponse getRollType() {
		return pb.getRollType();
	}

	@Override
	public PbCubeResponse getPrintCount(int nOption) {
		return pb.getPrintCount(nOption);
	}

	@Override
	public PbCubeResponse setMediaRecognitionMode(int nOption) {
		return pb.setMediaRecognitionMode(nOption);
	}

	@Override
	public PbCubeResponse getPrinterInformation(int nOption) {
		return pb.getPrinterInformation(nOption);
	}

	@Override
	public PbCubeResponse rebootPrinter() {
		return pb.rebootPrinter();
	}
	
	

}
