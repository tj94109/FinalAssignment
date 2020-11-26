
//compile iostream
javac com.adv.java.iostream/module-info.java \
	com.adv.java.iostream/com/adv/java/iostream/IoStreamDemo.java \
	com.adv.java.iostream/com/adv/java/iostream/Hidden/IoStreamImpl.java
//compile xml
javac com.adv.java.xml/module-info.java \
	com.adv.java.xml/com/adv/java/xml/XmlDemo.java \
	com.adv.java.xml/com/adv/java/xml/Hidden/XmlImpl.java
	

//compile network
javac com.adv.java.network/module-info.java \
	com.adv.java.network/com/adv/java/network/NetworkDemo.java \
	com.adv.java.network/com/adv/java/network/Hidden/NetworkImpl.java

//compile application
javac --module-path com.adv.java.application:com.adv.java.xml:com.adv.java.iostream:com.adv.java.network \
	com.adv.java.application/module-info.java \
	com.adv.java.application/com/adv/java/application/FinalApplication.java 

//run application
java --module-path com.adv.java.application:com.adv.java.iostream:com.adv.java.xml:com.adv.java.network \
	--module com.adv.java.application/com.adv.java.application.FinalApplication



