package it.ninjatech.kvo.async.job;

import it.ninjatech.kvo.model.TvSerieImageProvider;
import it.ninjatech.kvo.model.TvSerieSeason;

import java.awt.Dimension;

public class TvSerieSeasonImageAsyncJob extends TvSerieCacheRemoteImageAsyncJob {

	private static final long serialVersionUID = -4778866702647242373L;

	private final TvSerieSeason season;
	
	public TvSerieSeasonImageAsyncJob(TvSerieSeason season, TvSerieImageProvider provider, Dimension size) {
		// TODO fix
		super(season.getId(), provider, /*season.getImage().getPath()*/null, size);
		
		this.season = season;
	}

	public TvSerieSeason getSeason() {
		return this.season;
	}
	
}
