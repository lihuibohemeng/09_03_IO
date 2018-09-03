package com.lh.Io;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/9/3
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class ObjectInputAndOutPut {
    public static void main(String[] args)throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        People people = new People(1,"liu");
        objectOutputStream.writeObject(people);
        people = new People(2,"liu");
        objectOutputStream.writeObject(people);
        people = new People(3,"liu");
        objectOutputStream.writeObject(people);
//        关闭输出流
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("F:\\1.txt");
       ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try{
            while(true){
            People p2 = (People)objectInputStream.readObject();
                System.out.println(p2);
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(EOFException e){
            System.out.println("读取结束");
        }
    }
}
class People implements Serializable {
    int id;
    String name;
    public People(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "id:"+id+"name:"+name;
    }
}
