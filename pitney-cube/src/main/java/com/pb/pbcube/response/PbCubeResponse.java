package com.pb.pbcube.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PbCubeResponse {

	private  boolean result;

	private  String value;

	private  String errorMessage;

	
}
