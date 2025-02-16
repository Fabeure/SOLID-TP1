package com.directi.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        IReader fileReader = new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IWriter fileWriter = new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        Encoder base64Encoder = new Base64Encoder();
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter, base64Encoder);
        fileEncodingModule.encode();

        IReader networkReader = new NetworkReader("http://myfirstappwith.appspot.com/index.html");
        IWriter databaseWriter = new DatabaseWriter(new MyDatabase());
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter, base64Encoder);
        networkEncodingModule.encode();
    }
}