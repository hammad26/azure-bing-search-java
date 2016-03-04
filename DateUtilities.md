# Introduction #

azure-bing-search-java contains a set of static date utilities to deal with the ISO date format that Bing uses.  Here are some examples:

# Details #

```
            //Populate an AzureSearchNewsResult anr above

            try {
			Calendar this_cal = AzureSearchDateUtils.toCalendar(anr.getDate());
			Date some_result_date = this_cal.getTime());
		} catch (ParseException e) {
			//"Could not parse " + anr.getDate());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
```


