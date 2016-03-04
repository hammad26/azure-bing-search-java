
```

public void init(){
     AzureSearchNewsQuery aq = new AzureSearchNewsQuery();
     aq.setAppid(AZURE_APPID);
     aq.setQuery("Oklahoma Sooners");

     showPage(1);
}

public void showPage(int page){
     aq.setPage(page);
     aq.doQuery();
     AzureSearchResultSet<AzureSearchNewsResult> ars = aq.getQueryResult();
     for (AzureSearchNewsResult anr : ars){
          //some kind of processing on the anr object here
          formatPage(anr);
     }
}

public void showNextPage(){
     aq.nextPage(page);
     aq.doQuery();
     AzureSearchResultSet<AzureSearchNewsResult> ars = aq.getQueryResult();
     for (AzureSearchNewsResult anr : ars){
          //some kind of processing on the anr object here
          formatPage(anr);
     }
}

		
```