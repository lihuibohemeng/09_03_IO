package com.lh.Io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/9/3
 * Time: 14:35
 * To change this template use File | Settings | File Templates.
 */
public class ByteArrayTest {

    public static void main(String[] args) {
         int a = 0;
         int b = 1;
         int c = 2;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(a);
        bout.write(b);
        bout.write(c);
        byte[] buff = bout.toByteArray();
        for(int i = 0; i <buff.length;i++){
            System.out.println(buff[i]);
        }


        ByteArrayInputStream bin = new ByteArrayInputStream(buff);
        while((b = bin.read())!= -1){
            System.out.println(b);
        }

    }
}
