package com.example.misskeyclient;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder
{
	private TextView note;
	private TextView screenName;
	private TextView userName;
	private ImageView icon;

	public NoteViewHolder( View v )
	{
		super( v );
		this.userName = v.findViewById( R.id.userName );
		this.screenName = v.findViewById( R.id.screenName );
		this.note = v.findViewById( R.id.noteText );
		this.icon = v.findViewById( R.id.icon );
	}

	public void setText( NoteItem item )
	{
		this.userName.setText( item.getUserName() );
		this.screenName.setText( item.getScreenName() );
		this.note.setText( item.getNote() );
	}
}
