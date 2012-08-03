package net.billylieurance.azuresearch;

/*
Copyright 2012 William Lieurance

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

public abstract class AbstractAzureSearchResult {

	


	public String getId() {
		return _id;
	}
	public void setId(String _id) {
		this._id = _id;
	}
	public String getTitle() {
		return _title;
	}
	public void setTitle(String _title) {
		this._title = _title;
	}
	public String getUrl() {
		return _url;
	}
	public void setUrl(String _url) {
		this._url = _url;
	}

	public String getDescription() {
		return _description;
	}
	public void setDescription(String _description) {
		this._description = _description;
	}

	
	protected String _id;
	protected String _title;
	protected String _url;
	protected String _description;

	
	
}