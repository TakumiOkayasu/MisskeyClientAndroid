package com.example.misskeyclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter< NoteViewHolder >
{
	private List< NoteItem > notes;

	public NoteAdapter( List< NoteItem > notes )
	{
		this.notes = notes;
	}

	@NonNull
	@Override
	public NoteViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType )
	{
		View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.note, parent, false );
		return new NoteViewHolder( v );
	}

	@Override
	public void onBindViewHolder( @NonNull NoteViewHolder holder, int position )
	{
		holder.setText( notes.get( position ) );
	}

	@Override
	public long getItemId( int position )
	{
		return notes.get( position ).getId();
	}

	@Override
	public int getItemCount()
	{
		return notes.size();
	}
}
