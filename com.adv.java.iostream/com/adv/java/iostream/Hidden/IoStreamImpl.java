package com.adv.java.iostream.Hidden;

import com.adv.java.iostream.IoStreamDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URLConnection;
import java.util.Scanner;

public class IoStreamImpl implements IoStreamDemo{

  public void readWebData(URLConnection connection) throws IOException {
      Scanner in = new Scanner(connection.getInputStream(), "UTF-8");
      FileWriter fw = new FileWriter("file.xml");
      while(in.hasNextLine()){
          String line = in.nextLine();
          fw.write(line);
      }
      fw.close();
      System.out.println("\ncom.adv.java.iostream is reading Web Data and writing to file.xml");
 }
}

