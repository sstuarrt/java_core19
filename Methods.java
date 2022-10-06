package com.company.java_core.homework19.task1;

import java.io.*;

public class Methods implements Serializable {
    public static void serialize(File file, Serializable object) throws Exception{
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oob = new ObjectOutputStream(os);
        oob.writeObject(object);
        oob.close();
    }

    public static Serializable deserialize(File file) throws Exception{
        InputStream is = new FileInputStream(file);
        ObjectInputStream oib = new ObjectInputStream(is);
        Serializable object = (Serializable) oib.readObject();
        is.close();
        oib.close();
        return object;
    }
}
