package com.example.demo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TrackTest 
{
	Track track = new Track(1, "B", "C", "D", "",100);
	
	/*
	@Before
	public void setUp()
	{
		track = new Track("A", "B", "C", "D");
	}
	*/
	
	@Test
	public void testGetArtist()
	{
		assertThat(track.getArtist(), is("A"));
	}
	
	@Test
	public void testGetTitle()
	{
		assertThat(track.getTitle(), is("B"));
	}
	
	@Test
	public void testGetGenre()
	{
		assertThat(track.getGenre(), is("C"));
	}
	
	@Test
	public void testGetThumbnailUrl()
	{
		assertThat(track.getThumbnailUrl(), is("D"));
	}
}