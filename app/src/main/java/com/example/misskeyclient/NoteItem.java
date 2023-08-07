package com.example.misskeyclient;

public class NoteItem
{
	private long id;            // ユニークなID
	private String userName;    // ユーザー名
	private String screenName;  // スクリーン名 @hogeの部分
	private String note;        // ノート本文

	public NoteItem( String userName, String screenName, String note )
	{
		this.userName = userName;
		this.screenName = screenName;
		this.note = note;

	}

	public NoteItem( NoteItem item )
	{
		this( item.getUserName(), item.getScreenName(), item.getNote() );
	}

	public long getId()
	{
		return id;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName( String userName )
	{
		this.userName = userName;
	}

	public String getScreenName()
	{
		return screenName;
	}

	public void setScreenName( String screenName )
	{
		this.screenName = screenName;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote( String note )
	{
		this.note = note;
	}
}
