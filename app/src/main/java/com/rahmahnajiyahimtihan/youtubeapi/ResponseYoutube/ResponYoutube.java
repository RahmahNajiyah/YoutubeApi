package com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponYoutube{

	@SerializedName("regionCode")
	private String regionCode;

	@SerializedName("kind")
	private String kind;

	@SerializedName("nextPageToken")
	private String nextPageToken;

	@SerializedName("pageInfo")
	private PageInfo pageInfo;

	@SerializedName("etag")
	private String etag;

	@SerializedName("items")
	private List<ItemsItem> items;

	public void setRegionCode(String regionCode){
		this.regionCode = regionCode;
	}

	public String getRegionCode(){
		return regionCode;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getKind(){
		return kind;
	}

	public void setNextPageToken(String nextPageToken){
		this.nextPageToken = nextPageToken;
	}

	public String getNextPageToken(){
		return nextPageToken;
	}

	public void setPageInfo(PageInfo pageInfo){
		this.pageInfo = pageInfo;
	}

	public PageInfo getPageInfo(){
		return pageInfo;
	}

	public void setEtag(String etag){
		this.etag = etag;
	}

	public String getEtag(){
		return etag;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"ResponYoutube{" + 
			"regionCode = '" + regionCode + '\'' + 
			",kind = '" + kind + '\'' + 
			",nextPageToken = '" + nextPageToken + '\'' + 
			",pageInfo = '" + pageInfo + '\'' + 
			",etag = '" + etag + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}