package com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube;

import com.google.gson.annotations.SerializedName;

public class ItemsItem{

	@SerializedName("snippet")
	private Snippet snippet;

	@SerializedName("kind")
	private String kind;

	@SerializedName("etag")
	private String etag;

	@SerializedName("id")
	private Id id;

	public void setSnippet(Snippet snippet){
		this.snippet = snippet;
	}

	public Snippet getSnippet(){
		return snippet;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setEtag(String etag){
		this.etag = etag;
	}

	public String getEtag(){
		return etag;
	}

	public void setId(Id id){
		this.id = id;
	}

	public Id getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"snippet = '" + snippet + '\'' + 
			",kind = '" + kind + '\'' + 
			",etag = '" + etag + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}