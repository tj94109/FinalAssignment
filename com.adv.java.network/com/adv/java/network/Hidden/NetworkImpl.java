package com.adv.java.network.Hidden;

import com.adv.java.network.NetworkDemo;
import java.io.*;
import java.net.*;
import java.util.*;
import java.io.IOException;

public class NetworkImpl implements NetworkDemo{


    public URLConnection connectUrl(String url) throws MalformedURLException {
        URL urlConnection = new URL(url);
        URLConnection connection = null;
        try{
            connection = urlConnection.openConnection();
            connection.connect();
            System.out.println("\ncom.adv.java.network is connecting to URL");

        }catch(IOException ex){
            ex.printStackTrace();
        }
        return connection;
   }
}

