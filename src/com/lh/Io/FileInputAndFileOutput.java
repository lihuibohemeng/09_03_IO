package com.lh.Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/9/3
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class FileInputAndFileOutput {
    public static void main(String[] args) {
        File file  = new File("F:\\1.txt");
//        向文件中写入 Hello World 字符串
        try{
            byte[] buf = "Hello".getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(buf);
            fileOutputStream.close();
        }catch(Exception e){
              e.printStackTrace();
        }
//        读取文件中的内容
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte buff [] = new byte[1024];
            int len =  fileInputStream.read(buff);
            String str = new String(buff,0,len);
            System.out.println(str);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
