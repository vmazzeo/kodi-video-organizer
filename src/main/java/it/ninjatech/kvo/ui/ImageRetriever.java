package it.ninjatech.kvo.ui;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;

public final class ImageRetriever {

	private enum ImageName {
		
		Apikey("apikey.jpg"),
		ArrowLeft("arrow_left.png"),
		ArrowRight("arrow_right.png"),
		Baloon("baloon.png"),
		ContentRating_TV14("TV-14.png"),
		ContentRating_TVG("TV-G.png"),
		ContentRating_TVMA("TV-MA.png"),
		ContentRating_TVPG("TV-PG.png"),
		ContentRating_TVY("TV-Y.png"),
		ContentRating_TVY7("TV-Y7.png"),
		ExceptionConsole("exception_console.png"),
		Folder("folder.png"),
		Folder_Movies("folder_movies.png"),
		Folder_TvSeries("folder_tvseries.png"),
		IMDb("imdb.png"),
		Loading("loading.gif"),
		Scrapers_Settings("scrapers_settings.png"),
		Star("star.png"),
		TvSerie("tvserie.png"),
		TvSerie_Tile_Poster("tvserie_tile_poster.png"),
		TheTVDB_Logo("thetvdb_logo.png");
		
		private final String value; 
		
		private ImageName(String name) {
			this.value = String.format("/images/%s", name);
		}
		
	}

	private static final int APIKEY_SIZE = 40;
	private static final int EXPLORER_TREE_ICON_SIZE = 16;
	private static final int EXPLORER_TREE_MENU_ICON_SIZE = 50;
	private static final int EXPLORER_TREE_TAB_ICON_SIZE = 32;
	private static final int MENU_BAR_BUTTON_SIZE = 40;
	private static final int THE_TV_DB_LOGO_SIZE = 300;
	private static final int WALL_ARROR_SIZE = 32;
	private static final int WALL_BALOON_SIZE = 30;
	private static final int WALL_CONTENT_RATING_SIZE = 20;
	private static final int WALL_IMDB_SIZE = 20;
	private static final int WALL_STAR_SIZE = 40;
	
	private static ImageIcon apikey;
	private static ImageIcon explorerTilePosterTvSerie;
	private static ImageIcon explorerTreeFolder;
	private static ImageIcon explorerTreeFolderMovies;
	private static ImageIcon explorerTreeFolderTvSeries;
	private static ImageIcon explorerTreeFolderMoviesMenu;
	private static ImageIcon explorerTreeFolderTvSeriesMenu;
	private static ImageIcon explorerTreeFolderTab;
	private static ImageIcon explorerTreeFolderMoviesTab;
	private static ImageIcon explorerTreeFolderTvSeriesTab;
	private static ImageIcon explorerTreeTvSerie;
	private static ImageIcon loading;
	private static ImageIcon theTvDbLogo;
	private static ImageIcon toolBarExceptionConsole;
	private static ImageIcon toolBarScrapersSettings;
	private static ImageIcon wallArrowLeft;
	private static ImageIcon wallArrowRight;
	private static ImageIcon wallBaloon;
	private static ImageIcon wallContentRatingTV14;
	private static ImageIcon wallContentRatingTVG;
	private static ImageIcon wallContentRatingTVMA;
	private static ImageIcon wallContentRatingTVPG;
	private static ImageIcon wallContentRatingTVY;
	private static ImageIcon wallContentRatingTVY7;
	private static ImageIcon wallIMDb;
	private static ImageIcon wallStar;
	
	public static ImageIcon retrieveApikey() {
		if (apikey == null) {
			apikey = retrieveAndScaleImage(ImageName.Apikey, APIKEY_SIZE);
		}
		
		return apikey;
	}
	
	public static ImageIcon retrieveExplorerTilePosterTvSerie() {
		if (explorerTilePosterTvSerie == null) {
			explorerTilePosterTvSerie = retrieveAndScaleImage(ImageName.TvSerie_Tile_Poster, Dimensions.getExplorerTilePosterSize());
		}
		
		return explorerTilePosterTvSerie;
	}
	
	public static ImageIcon retrieveExplorerTreeFolder() {
		if (explorerTreeFolder == null) {
			explorerTreeFolder = retrieveAndScaleImage(ImageName.Folder, EXPLORER_TREE_ICON_SIZE);
		}
		
		return explorerTreeFolder;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderMovies() {
		if (explorerTreeFolderMovies == null) {
			explorerTreeFolderMovies = retrieveAndScaleImage(ImageName.Folder_Movies, EXPLORER_TREE_ICON_SIZE);
		}
		
		return explorerTreeFolderMovies;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderTvSeries() {
		if (explorerTreeFolderTvSeries == null) {
			explorerTreeFolderTvSeries = retrieveAndScaleImage(ImageName.Folder_TvSeries, EXPLORER_TREE_ICON_SIZE);
		}
		
		return explorerTreeFolderTvSeries;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderMoviesMenu() {
		if (explorerTreeFolderMoviesMenu == null) {
			explorerTreeFolderMoviesMenu = retrieveAndScaleImage(ImageName.Folder_Movies, EXPLORER_TREE_MENU_ICON_SIZE);
		}
		
		return explorerTreeFolderMoviesMenu;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderTvSeriesMenu() {
		if (explorerTreeFolderTvSeriesMenu == null) {
			explorerTreeFolderTvSeriesMenu = retrieveAndScaleImage(ImageName.Folder_TvSeries, EXPLORER_TREE_MENU_ICON_SIZE);
		}
		
		return explorerTreeFolderTvSeriesMenu;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderTab() {
		if (explorerTreeFolderTab == null) {
			explorerTreeFolderTab = retrieveAndScaleImage(ImageName.Folder, EXPLORER_TREE_TAB_ICON_SIZE);
		}
		
		return explorerTreeFolderTab;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderMoviesTab() {
		if (explorerTreeFolderMoviesTab == null) {
			explorerTreeFolderMoviesTab = retrieveAndScaleImage(ImageName.Folder_Movies, EXPLORER_TREE_TAB_ICON_SIZE);
		}
		
		return explorerTreeFolderMoviesTab;
	}
	
	public static ImageIcon retrieveExplorerTreeFolderTvSeriesTab() {
		if (explorerTreeFolderTvSeriesTab == null) {
			explorerTreeFolderTvSeriesTab = retrieveAndScaleImage(ImageName.Folder_TvSeries, EXPLORER_TREE_TAB_ICON_SIZE);
		}
		
		return explorerTreeFolderTvSeriesTab;
	}
	
	public static ImageIcon retrieveExplorerTreeTvSerie() {
		if (explorerTreeTvSerie == null) {
			explorerTreeTvSerie = retrieveAndScaleImage(ImageName.TvSerie, EXPLORER_TREE_ICON_SIZE);
		}
		
		return explorerTreeTvSerie;
	}
	
	public static ImageIcon retrieveLoading() {
		if (loading == null) {
			loading = retrieveImage(ImageName.Loading);
		}
		
		return loading;
	}
	
	public static ImageIcon retrieveTheTvDbLogo() {
		if (theTvDbLogo == null) {
			theTvDbLogo = retrieveAndScaleImageByWidth(ImageName.TheTVDB_Logo, THE_TV_DB_LOGO_SIZE);
		}
		
		return theTvDbLogo;
	}
	
	public static ImageIcon retrieveToolBarExceptionConsole() {
		if (toolBarExceptionConsole == null) {
			toolBarExceptionConsole = retrieveAndScaleImage(ImageName.ExceptionConsole, MENU_BAR_BUTTON_SIZE);
		}
		
		return toolBarExceptionConsole;
	}
	
	public static ImageIcon retrieveToolBarScrapersSettings() {
		if (toolBarScrapersSettings == null) {
			toolBarScrapersSettings = retrieveAndScaleImage(ImageName.Scrapers_Settings, MENU_BAR_BUTTON_SIZE);
		}
		
		return toolBarScrapersSettings;
	}
	
	public static ImageIcon retrieveWallArrowLeft() {
		if (wallArrowLeft == null) {
			wallArrowLeft = retrieveAndScaleImage(ImageName.ArrowLeft, WALL_ARROR_SIZE);
		}
		
		return wallArrowLeft;
	}
	
	public static ImageIcon retrieveWallArrowRight() {
		if (wallArrowRight == null) {
			wallArrowRight = retrieveAndScaleImage(ImageName.ArrowRight, WALL_ARROR_SIZE);
		}
		
		return wallArrowRight;
	}
	
	public static ImageIcon retrieveWallBaloon() {
		if (wallBaloon == null) {
			wallBaloon = retrieveAndScaleImage(ImageName.Baloon, WALL_BALOON_SIZE);
		}
		
		return wallBaloon;
	}
	
	public static ImageIcon retrieveWallContentRatingTV14() {
		if (wallContentRatingTV14 == null) {
			wallContentRatingTV14 = retrieveAndScaleImage(ImageName.ContentRating_TV14, WALL_CONTENT_RATING_SIZE);
		}
		
		return wallContentRatingTV14;
	}
	
	public static ImageIcon retrieveWallContentRatingTVG() {
		if (wallContentRatingTVG == null) {
			wallContentRatingTVG = retrieveAndScaleImage(ImageName.ContentRating_TVG, WALL_CONTENT_RATING_SIZE);
		}
		
		return wallContentRatingTVG;
	}
	
	public static ImageIcon retrieveWallContentRatingTVMA() {
		if (wallContentRatingTVMA == null) {
			wallContentRatingTVMA = retrieveAndScaleImage(ImageName.ContentRating_TVMA, WALL_CONTENT_RATING_SIZE);
		}
		
		return wallContentRatingTVMA;
	}
	
	public static ImageIcon retrieveWallContentRatingTVPG() {
		if (wallContentRatingTVPG == null) {
			wallContentRatingTVPG = retrieveAndScaleImage(ImageName.ContentRating_TVPG, WALL_CONTENT_RATING_SIZE);
		}
		
		return wallContentRatingTVPG;
	}
	
	public static ImageIcon retrieveWallContentRatingTVY() {
		if (wallContentRatingTVY == null) {
			wallContentRatingTVY = retrieveAndScaleImage(ImageName.ContentRating_TVY, WALL_CONTENT_RATING_SIZE);
		}
		
		return wallContentRatingTVY;
	}
	
	public static ImageIcon retrieveWallContentRatingTVY7() {
		if (wallContentRatingTVY7 == null) {
			wallContentRatingTVY7 = retrieveAndScaleImage(ImageName.ContentRating_TVY7, WALL_CONTENT_RATING_SIZE);
		}
		
		return wallContentRatingTVY7;
	}
	
	public static ImageIcon retrieveWallIMDb() {
		if (wallIMDb == null) {
			wallIMDb = retrieveAndScaleImageByHeight(ImageName.IMDb, WALL_IMDB_SIZE);
		}
		
		return wallIMDb;
	}
	
	public static ImageIcon retrieveWallStar() {
		if (wallStar == null) {
			wallStar = retrieveAndScaleImage(ImageName.Star, WALL_STAR_SIZE);
		}
		
		return wallStar;
	}
	
	private static ImageIcon retrieveImage(ImageName imageName) {
		return new ImageIcon(ImageRetriever.class.getResource(imageName.value));
	}
	
	private static ImageIcon retrieveAndScaleImage(ImageName imageName, int size) {
		ImageIcon result = null;

		result = retrieveImage(imageName);

		double scaleFactor = (double)size / (double)result.getIconWidth();

		if (scaleFactor != 0d) {
			result = new ImageIcon(result.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH));
		}

		return result;
	}
	
	private static ImageIcon retrieveAndScaleImageByWidth(ImageName imageName, int width) {
		ImageIcon result = null;

		result = retrieveImage(imageName);

		double scaleFactor = (double)width / (double)result.getIconWidth();
		double height = scaleFactor * (double)result.getIconHeight();

		if (scaleFactor != 0d) {
			result = new ImageIcon(result.getImage().getScaledInstance(width, (int)height, Image.SCALE_SMOOTH));
		}

		return result;
	}
	
	private static ImageIcon retrieveAndScaleImageByHeight(ImageName imageName, int height) {
		ImageIcon result = null;

		result = retrieveImage(imageName);

		double scaleFactor = (double)height / (double)result.getIconHeight();
		double width = scaleFactor * (double)result.getIconWidth();

		if (scaleFactor != 0d) {
			result = new ImageIcon(result.getImage().getScaledInstance((int)width, height, Image.SCALE_SMOOTH));
		}

		return result;
	}
	
	private static ImageIcon retrieveAndScaleImage(ImageName imageName, Dimension size) {
		ImageIcon result = null;

		result = new ImageIcon(retrieveImage(imageName).getImage().getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH));

		return result;
	}
	
	private ImageRetriever() {}
	
}
