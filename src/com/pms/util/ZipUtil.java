package com.pms.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {
	private File zipFile;  
	static final int BUFFER = 8192;    
	
    public ZipUtil(String pathName) {  
        zipFile = new File(pathName);  
    } 
   public void compress(String srcPathName) {
	   if(!srcPathName.endsWith("/")){  
		   srcPathName+="/";  
	   }
	   
       File file = new File(srcPathName);
       File[] files = file.listFiles();
       if (!file.exists())    
           throw new RuntimeException(srcPathName + "不存在！");         
        
        try {    
            FileOutputStream fileOutputStream = new FileOutputStream(zipFile);    
            CheckedOutputStream cos = new CheckedOutputStream(fileOutputStream,    
                    new CRC32());    
            ZipOutputStream out = new ZipOutputStream(cos);    
            String basedir = "";    
            for (int i=0;i<files.length;i++){ 
            	compress(files[i], out, basedir); 
            }
            out.close();    
        } catch (Exception e) {    
            throw new RuntimeException(e);    
        }    
    }    
   
    private void compress(File file, ZipOutputStream out, String basedir) {    
        /* 判断是目录还是文件 */   
        if (file.isDirectory()) {    
            System.out.println("压缩目录：" + basedir + file.getName());    
            this.compressDirectory(file, out, basedir);    
        } else {    
            System.out.println("压缩文件：" + basedir + file.getName());    
            this.compressFile(file, out, basedir);    
        }    
    } 
    
    /** 压缩一个目录 */   
    private void compressDirectory(File dir, ZipOutputStream out, String basedir) {    
        if (!dir.exists())    
            return;    
   
        File[] files = dir.listFiles();    
        for (int i = 0; i < files.length; i++) {    
            /* 递归 */   
            compress(files[i], out, basedir + dir.getName() + "/");    
        }    
    }    
   
    /** 压缩一个文件 */   
    private void compressFile(File file, ZipOutputStream out, String basedir) {    
        if (!file.exists()) {    
            return;    
        }    
        try {    
            BufferedInputStream bis = new BufferedInputStream(    
                    new FileInputStream(file));    
            ZipEntry entry = new ZipEntry(basedir + file.getName());    
            out.putNextEntry(entry);    
            int count;    
            byte data[] = new byte[BUFFER];    
            while ((count = bis.read(data, 0, BUFFER)) != -1) {    
                out.write(data, 0, count);    
            }    
            bis.close();    
        } catch (Exception e) {    
            throw new RuntimeException(e);    
        }    
    }

}