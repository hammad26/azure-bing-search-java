This jar should be compatible with most projects, including Android.


If your project uses Maven for dependency management, you're pretty well made.


## Install the jar to your local repo ##

Use the `mvn install:install-file` command to install the jar, then include it with
```
<dependency>
    	<groupId>net.billylieurance.azuresearch</groupId>
    	<artifactId>azure-bing-search-java</artifactId>
    	<version>0.12.0</version>
</dependency>
```


The JAR depends on HTTPClient and HTTPCore.  Here's a Maven snippit you can add:

```
<dependency>
	<groupId>org.apache.httpcomponents</groupId>
	<artifactId>httpclient</artifactId>
	<version>4.2.1</version>
</dependency>
<dependency>
	<groupId>org.apache.httpcomponents</groupId>
	<artifactId>httpcore</artifactId>
	<version>4.2.1</version>
</dependency>
```

## Use my repository ##

I'm hosting a publicly-accessible Maven repo for this jar.  **Note** that this is not guaranteed to be reliable.  Use at your discretion.

```
<repository>
	<releases>
		<enabled>true</enabled>
		<updatePolicy>always</updatePolicy>
		<checksumPolicy>fail</checksumPolicy>
	</releases>
	<id>net.billylieurance</id>
	<name>BillyLieuranceNet</name>
	<url>http://www.billylieurance.net/maven2</url>
	<layout>default</layout>
</repository>

```

Then just the jar you'd like.

```
<dependency>
    	<groupId>net.billylieurance.azuresearch</groupId>
    	<artifactId>azure-bing-search-java</artifactId>
    	<version>0.12.0</version>
</dependency>
```

Dependencies will be solved automatically.


## Otherwise ##

Or, you can go get the dependencies from http://hc.apache.org/.  You'll need HTTPClient, HTTPCore, and whatever they rely on.