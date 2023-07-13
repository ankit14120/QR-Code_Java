package com.rqread;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.io.*;

public class qrRead {
	public static void main(String[] args){
		try{
			File file = new File("Picture-1.jpg");
			Result result =new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file)))));

			if(file != null){
				System.out.println(result.getText());
				System.out.println("Done");

			}else
				System.out.println("fail to read");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
