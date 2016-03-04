# Introduction #

JSON is useful, sometimes.  Here's how you can pull it out of the result, if you've specified it as the format.


# Details #
```
AzureSearchWebQuery aq = new AzureSearchWebQuery();
aq.setAppid(AzureAppid.AZURE_APPID);
aq.setFormat(AZURESEARCH_FORMAT.JSON);
aq.setQuery("Oklahoma Sooners");
aq.doQuery();

//Note that now, there is no aq.getRawResult() or aq.getQueryResult().
// They'll come back as null.

HttpEntity he = aq.getResEntity();
try {
     InputStream is = he.getContent();
     InputStreamReader isr = new InputStreamReader(is);
     StringBuilder sb=new StringBuilder();
     BufferedReader br = new BufferedReader(isr);
     String read = br.readLine();

     while(read != null) {
          sb.append(read);
          read = br.readLine();
     }

     String JSONString = sb.toString();
			

} catch (IllegalStateException e) {
     //Do something with the exception
} catch (IOException e) {
     //Do something with the exception
}
```