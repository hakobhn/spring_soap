package com.company.service;

import org.example.uploadfile.mtom.service.UploadService;
import org.example.uploadfile.mtom.types.InputRequest;
import org.example.uploadfile.mtom.types.UploadResponse;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Service
public class UploadServicelEndpoint implements UploadService {

	@Override
	public UploadResponse upload(InputRequest request) {
		UploadResponse response = new UploadResponse();
		/* DataHandler – The object which contains the File Data */
		DataHandler handler = request.getFile();
		try {

			/* Creating an InputStream from the DataHandler */
			InputStream is = handler.getInputStream();
			String fileName = "/" + request.getFilePath() + "/"
					+ request.getFileType();

			/* Creating an Output stream and writing to the target file */
			OutputStream os = new FileOutputStream(new File(fileName));
			byte[] b = new byte[100000];
			int bytesRead = 0;
			while ((bytesRead = is.read(b)) != -1) {
				os.write(b, 0, bytesRead);
			}
			response.setResponse("File Uploaded Successfully..");
		/*	os.flush();
			os.close();
			is.close();*/

		} catch (Exception e) {
			System.out.println("Exception in webservice : "
					+ e.getLocalizedMessage());

			response.setResponse("File Uploaded Failed..");
		}

		return response;
	}

}
