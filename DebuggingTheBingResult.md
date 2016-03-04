# Introduction #

For performance and Android compatibility reasons, we don't buffer the HTTP response that Bing returns.  Instead, it goes directly to the parser, which builds a tree based off of it.

If you want to see the raw result, do something like this

# Details #
```
AzureSearchWebQuery aq = new AzureSearchWebQuery();
aq.setAppid(AzureAppid.AZURE_APPID);
aq.setQuery("Oklahoma Sooners");
		
aq.setProcessHTTPResults(false);
aq.doQuery();
		 
		
//Really all we're doing here is dumping the InputStream to a file.
//There are other ways that might be cleaner depending on what tools you have available.
java.util.Scanner s;
String debugResult;
try {
	s = new java.util.Scanner(aq.getResEntity().getContent()).useDelimiter("\\A");
	debugResult =  s.hasNext() ? s.next() : "";
} catch (IllegalStateException e) {
	e.printStackTrace();
	return;
} catch (IOException e) {
	e.printStackTrace();
	return;
} catch (NullPointerException e){
	e.printStackTrace();
	return;
}

//  You now have the result in the string debugResult.  You could, for instance, 		
//   System.out.print(debugResult);
		 

//Or, to verify that the query will be valid, then re-run it normally,
if (debugResult.startsWith("<feed")){
	aq.setProcessHTTPResults(true);
	aq.doQuery();
}else{
        //throw an exception or something
	System.out.println("Did not get a valid XML result back.");
        System.out.print(debugResult);
}

```