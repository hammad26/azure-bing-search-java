# Introduction #

Tragically, for most query types, the total number of results is not returned.  However, for Composite, it is.  You can get the total number of results like this.

Requires v0.9.0 or higher.


# Code #

```
AzureSearchCompositeQuery aq = new AzureSearchCompositeQuery();
aq.setAppid(AzureAppid.AZURE_APPID);
aq.setQuery("Oklahoma Sooners");
aq.setSources(new AZURESEARCH_QUERYTYPE[] {
     AZURESEARCH_QUERYTYPE.WEB, 
     AZURESEARCH_QUERYTYPE.NEWS, 
     AZURESEARCH_QUERYTYPE.IMAGE, 
     AZURESEARCH_QUERYTYPE.VIDEO
});
aq.doQuery();
ars = aq.getQueryResult();

Long numberOfWebResults = ars.getWebTotal();
Long numberOfImageResults = ars.getImageTotal();

```