package com.adv.java.iostream;

import java.io.IOException;
import java.net.URLConnection;

public interface IoStreamDemo{
 static IoStreamDemo newInstance(){

  return new com.adv.java.iostream.Hidden.IoStreamImpl();
 }
 void readWebData(URLConnection connection) throws IOException;

}
