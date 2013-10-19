package com.ThymeTheory.Rayne.level;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.level.tile.Tile;

public class Level {
	
	public int MapSize = 75;
	public static int tilesize = 16;
	
	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;
	
	public static Level spawn = new SpawnLevel("/levels/Spawn.png");
	
	
	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}
	
	public Level (String path) {
		loadLevel(path);
		generateLevel();
		
	}

	protected void generateLevel() {
		
		
	}
	
	protected void loadLevel(String path) {		
		
	}
	
	public void update() {
	}
	
	//private void time() {		
	//}
	
	public void render(int xScroll, int yScroll, Screen screen) {
		screen.setOffset(xScroll, yScroll);
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + tilesize) >> 4;
		int y0 = yScroll >>4;
		int y1 = (yScroll + screen.height + tilesize) >> 4;
		
		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
				
			}
		}
		
	}
	
	
	//add FF in front of all colours when
		// Putting them in the code,
		//  0xFF(colour code) = Alpha Channel & RGB
		
		  // Grass 0xFF00FF00
		  // Stone 0xFF808080
		  // Log 0xFF7F3300
		  // Water 0xFF0000FF
		  // Sand 0xFFFFFF00
	
	public Tile getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
		if (tiles[x + y * width] == Tile.col_s_floor) return Tile.S_floor;
		if (tiles[x + y * width] == Tile.col_s_brick) return Tile.S_bricks;
		if (tiles[x + y * width] == Tile.col_s_wall) return Tile.S_wall;
		if (tiles[x + y * width] == Tile.col_s_water) return Tile.S_water;
		if (tiles[x + y * width] == Tile.col_s_grass) return Tile.S_grass;
		if (tiles[x + y * width] == Tile.col_s_stone) return Tile.S_stone;

		/*if (tiles[x + y * width] == 0xFF00FF00) return Tile.grass;
		if (tiles[x + y * width] == 0xFFFFFF00) return Tile.sand;
		if (tiles[x + y * width] == 0xFF7F3300) return Tile.log;
		if (tiles[x + y * width] == 0xFF808080) return Tile.stone;
		if (tiles[x + y * width] == 0xFF0000FF) return Tile.water;		
		if (tiles[x + y * width] == 0xFF404040) return Tile.rock;
		if (tiles[x + y * width] == 0xFF7F0000) return Tile.Atree;
		if (tiles[x + y * width] == 0xFF007F0E) return Tile.Ptree;
		if (tiles[x + y * width] == 0xFF3A8800) return Tile.cactus;
		if (tiles[x + y * width] == 0xFF00137F) return Tile.croc;		
		if (tiles[x + y * width] == 0xFF4FD5FF) return Tile.grass_sand1;	
		if (tiles[x + y * width] == 0xFF51A2FF) return Tile.grass_sand2;		
		if (tiles[x + y * width] == 0xFF84C3FF) return Tile.grass_sand3;		
		if (tiles[x + y * width] == 0xFF3FA2FF) return Tile.grass_sand4;		
		if (tiles[x + y * width] == 0xFFE554FF) return Tile.grass_sand5;		
		if (tiles[x + y * width] == 0xFFFF77E8) return Tile.grass_sand6;		
		if (tiles[x + y * width] == 0xFFF199FF) return Tile.grass_sand7;		
		if (tiles[x + y * width] == 0xFFFFB7E0) return Tile.grass_sand8;		
		if (tiles[x + y * width] == 0xFFFF0000) return Tile.Rflower;
		if (tiles[x + y * width] == 0xFFFF6A00) return Tile.Oflower;
		if (tiles[x + y * width] == 0xFF7F006E) return Tile.Pflower;*/


		return Tile.voidTile;
		
	}
		
}


