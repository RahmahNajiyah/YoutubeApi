package com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube;

import com.google.gson.annotations.SerializedName;

public class Snippet{

	@SerializedName("publishedAt")
	private String publishedAt;

	@SerializedName("description")
	private String description;

	@SerializedName("title")
	private String title;

	@SerializedName("thumbnails")
	private Thumbnails thumbnails;

	@SerializedName("channelId")
	private String channelId;

	@SerializedName("channelTitle")
	private String channelTitle;

	@SerializedName("liveBroadcastContent")
	private String liveBroadcastContent;

	public void setPublishedAt(String publishedAt){
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt(){
		return publishedAt;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setThumbnails(Thumbnails thumbnails){
		this.thumbnails = thumbnails;
	}

	public Thumbnails getThumbnails(){
		return thumbnails;
	}

	public void setChannelId(String channelId){
		this.channelId = channelId;
	}

	public String getChannelId(){
		return channelId;
	}

	public void setChannelTitle(String channelTitle){
		this.channelTitle = channelTitle;
	}

	public String getChannelTitle(){
		return channelTitle;
	}

	public void setLiveBroadcastContent(String liveBroadcastContent){
		this.liveBroadcastContent = liveBroadcastContent;
	}

	public String getLiveBroadcastContent(){
		return liveBroadcastContent;
	}

	@Override
 	public String toString(){
		return 
			"Snippet{" + 
			"publishedAt = '" + publishedAt + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",thumbnails = '" + thumbnails + '\'' + 
			",channelId = '" + channelId + '\'' + 
			",channelTitle = '" + channelTitle + '\'' + 
			",liveBroadcastContent = '" + liveBroadcastContent + '\'' + 
			"}";
		}
}