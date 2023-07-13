package com.rqgenrate;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.*;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args){
		try{
			File file = new File("qr-3.jpg");
			String content = "JPG 3rd QR";
			ByteArrayOutputStream out = QRCode.from(content).to(ImageType.JPG).stream();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(out.toByteArray());
			fos.close();
			System.out.println("Success");

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
