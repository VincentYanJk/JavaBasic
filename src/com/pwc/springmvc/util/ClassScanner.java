package com.pwc.springmvc.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class ClassScanner {

public static Map<String, Class<?>> scannerClass(String basePackage){
	
	 Map<String, Class<?>> results = new HashMap<String, Class<?>>();
	 //com.pwc.springmvc.controller
	String filePath= basePackage.replace(".", "/");
	
	try {
		Enumeration<URL> dirs = Thread.currentThread().getContextClassLoader().getResources(filePath);
		
		//  /C:/yanjikun_work/Eclipse_WorkSpace/JavaBasic/bin/com/pwc/springmvc/controller
		String rootPath = Thread.currentThread().getContextClassLoader().getResource(filePath).getPath();
		
		//System.out.println(rootPath);
		if(rootPath!=null) {
			rootPath = rootPath.substring(rootPath.lastIndexOf(filePath));
		}
		
		while (dirs.hasMoreElements()) {
			URL url = (URL) dirs.nextElement();
			//  /C:/yanjikun_work/Eclipse_WorkSpace/JavaBasic/bin/com/pwc/springmvc/controller
			//System.out.println(url);
			if(url.getProtocol().equals("file")) {
				File file  =new File(url.getPath().substring(1));
				
				scannerFiles(file,rootPath,results);
			}
			
		}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
	
	
	return results;
	
}

private static void scannerFiles(File floder,String rootPath,Map<String,Class<?>> classes) {
	
	File[] files = floder.listFiles();
	
	
	for (int i = 0; files!=null&&i < files.length ; i++) {
		File file = files[i];
		if(file.isDirectory()) {
			
			scannerFiles(file,rootPath+file.getName()+"/",classes);
		}else {
			String path = file.getAbsolutePath();
			if(path.endsWith(".class")) {
				
				path = path.replace("\\", "/");
				
				String className = rootPath + path.substring(path.lastIndexOf("/"), path.indexOf(".class"));
				
				className = className.replace("/", ".");
				
				System.out.println(className);
		try {
			classes.put(className, Class.forName(className));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
				
			}
			
		}
		
		
	}
	
	
}
public static void  main(String[] args) {
	
	
	ClassScanner.scannerClass("com.pwc.springmvc.controller");
	
}

}
