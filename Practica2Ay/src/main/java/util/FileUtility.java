/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class FileUtility {
       public static void writeObjectfile(Serializable object,String name)throws Exception{
        try(FileOutputStream fout=new FileOutputStream(name);
                ObjectOutputStream oos=new ObjectOutputStream(fout) 
                ){
            oos.writeObject(object);
        }
    }
        public static Object readFileDeserilize(String filename)throws Exception{
        Object obj = null;
        try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(filename)) ){
          obj = in.readObject();
        }finally{
        return obj;
    }
    }
}
