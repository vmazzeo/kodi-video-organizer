package it.ninjatech.kvo.async;

import it.ninjatech.kvo.async.job.AbstractImageLoaderAsyncJob;
import it.ninjatech.kvo.async.job.CacheRemoteImageAsyncJob;
import it.ninjatech.kvo.async.job.PersonAsyncJob;
import it.ninjatech.kvo.async.job.TvSerieLocalFanartAsyncJob;
import it.ninjatech.kvo.async.job.TvSerieLocalSeasonImageAsyncJob;
import it.ninjatech.kvo.async.job.TvSerieTileImagesAsyncJob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncManager {

	private static AsyncManager self;
	
	public static void init() {
		if (self == null) {
			self = new AsyncManager();
		}
	}
	
	public static AsyncManager getInstance() {
		return self;
	}
	
	public static void shutdown() {
		if (self != null) {
			try {
				self.executor.shutdownNow();
			}
			catch (Exception e) {}
			self = null;
		}
	}

	private final ExecutorService executor;
	private final AsyncHandler<AbstractImageLoaderAsyncJob> tvSerieImageLoaderHandler;
	private final AsyncHandler<PersonAsyncJob> personHandler;
	
	private AsyncManager() {
		this.executor = Executors.newFixedThreadPool(2);
		
		this.tvSerieImageLoaderHandler = new AsyncHandler<>();
		this.personHandler = new AsyncHandler<>();
		
		this.executor.submit(this.tvSerieImageLoaderHandler);
		this.executor.submit(this.personHandler);
	}
	
	public void submit(String id, TvSerieTileImagesAsyncJob job, AsyncJobListener listener) {
		System.out.printf("-> submit tile images %s\n", id);
		this.tvSerieImageLoaderHandler.submitJob(id, job, listener);
	}
	
	public void cancelTvSerieTileImagesAsyncJob(String id) {
		System.out.printf("-> cancel tile images %s\n", id);
		this.tvSerieImageLoaderHandler.removeJob(id);
	}
	
	public void submit(String id, TvSerieLocalFanartAsyncJob job, AsyncJobListener listener) {
		System.out.printf("-> submit local fanart %s\n", id);
		this.tvSerieImageLoaderHandler.submitJob(id, job, listener);
	}
	
	public void cancelTvSerieLocalFanartAsyncJob(String id) {
		System.out.printf("-> cancel local fanart %s\n", id);
		this.tvSerieImageLoaderHandler.removeJob(id);
	}
	
	public void submit(String id, TvSerieLocalSeasonImageAsyncJob job, AsyncJobListener listener) {
		System.out.printf("-> submit local season image %s\n", id);
		this.tvSerieImageLoaderHandler.submitJob(id, job, listener);
	}
	
	public void cancelTvSerieLocalSeasonImageAsyncJob(String id) {
		System.out.printf("-> cancel local season image %s\n", id);
		this.tvSerieImageLoaderHandler.removeJob(id);
	}
	
	public void submit(String id, CacheRemoteImageAsyncJob job, AsyncJobListener listener) {
		System.out.printf("-> submit cache-remote image %s\n", id);
		this.tvSerieImageLoaderHandler.submitJob(id, job, listener);
	}
	
	public void cancelTvSerieCacheRemoteImageAsyncJob(String id) {
		System.out.printf("-> cancel cache-remote image %s\n", id);
		this.tvSerieImageLoaderHandler.removeJob(id);
	}
	
	public void submit(String id, PersonAsyncJob job, AsyncJobListener listener) {
		System.out.printf("-> submit person %s\n", id);
		this.personHandler.submitJob(id, job, listener);
	}
	
	public void cancelPersonAsyncJob(String id) {
		System.out.printf("-> cancel person %s\n", id);
		this.personHandler.removeJob(id);
	}
	
}
