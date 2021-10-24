package springmvcsearch.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploaderController {
	
	
	
	@RequestMapping("/uploadForm")
	public String showUploadForm() {
		
		return "uploadForm";
	}
	
	
	@RequestMapping(value ="/uploadimage", method= RequestMethod.POST)
	public String fileUpload(@RequestParam("addharCardFile") CommonsMultipartFile file, HttpSession s  ) {
		
		System.out.println("file upload handler ");
		System.out.println("File Name : "+file.getName());
		System.out.println("File Type : "+file.getContentType());
		System.out.println("File Size : "+file.getSize());
		System.out.println("File OrignalFileName : "+file.getOriginalFilename());
		System.out.println("File StorageDescription : "+file.getStorageDescription());
		// we have to save this file to server: 
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator
															+"resources"+File.separator
															+"images"+File.separator;
		System.out.println("Context Path : "+path);
		
		byte[] filedata = file.getBytes();
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(filedata);
			fos.close();
			System.out.println("File uploaded succefull");
			
		}catch(IOException io) {
			io.printStackTrace();
			System.out.println("File uploading error ");
		}
		
		
		
		
		return "fileSuccess";
	}
	
	
	
}
