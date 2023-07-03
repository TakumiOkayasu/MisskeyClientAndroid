package com.example.misskeyclient;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * TimeLine上で表示されるNoteのView
 **/
public class TimeLineNote extends RecyclerView.ViewHolder
{
	private View view;
	private TextView screenName;
	private TextView userName;
	private ImageView icon;
	private TextView noteText;
	public TimeLineNote( @NonNull View itemView )
	{
		super( itemView );
		this.view = itemView;
		this.screenName = itemView.findViewById( R.id.screenName );
		this.userName = itemView.findViewById( R.id.userName );
		this.noteText = itemView.findViewById( R.id.noteText );
		this.icon = itemView.findViewById( R.id.icon );
	}
}
