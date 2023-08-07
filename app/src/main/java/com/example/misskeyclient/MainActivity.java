package com.example.misskeyclient;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity
{
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		final ArrayList< NoteItem > noteList = new ArrayList< NoteItem >();
		noteList.add( new NoteItem( "test1", "@test1", "これはテストです" ) );
		noteList.add( new NoteItem( "test2", "@test2", "これはテストです" ) );
		noteList.add( new NoteItem( "test3", "@test3", "これはテストです" ) );
		noteList.add( new NoteItem( "test4", "@test4", "これはテストです" ) );
		noteList.add( new NoteItem( "test5", "@test5", "これはテストですこれはテストですこれはテストですこれはテストです\nこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストですこれはテストです" ) );

		RecyclerView recyclerView = findViewById( R.id.recyclerView );
		recyclerView.setHasFixedSize( true );

		LinearLayoutManager mgr = new LinearLayoutManager( this );
		mgr.setOrientation( LinearLayoutManager.VERTICAL );

		recyclerView.setLayoutManager( mgr );
		RecyclerView.Adapter adapter = new NoteAdapter( noteList );
		recyclerView.setAdapter( adapter );
	}
}