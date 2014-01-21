package com.ThymeTheory.Rayne.level.tile;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.graphics.Sprite;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnBricksTile;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnFloorTile;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnGrassTile;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnStoneTile;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnTreeTile;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnWallTile;
import com.ThymeTheory.Rayne.level.tile.spawn_level.SpawnWaterTile;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	//Map Tiles
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile sand = new SandTile(Sprite.sand);
	public static Tile log = new LogTile(Sprite.log);
	public static Tile stone = new StoneTile(Sprite.stone);
	public static Tile water = new WaterTile(Sprite.water);	
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile Atree = new AtreeTile(Sprite.Atree);
	public static Tile Ptree = new PtreeTile(Sprite.Ptree);
	public static Tile cactus = new CactusTile(Sprite.cactus);
	public static Tile croc = new CrocTile(Sprite.croc);
	public static Tile grass_sand1 = new GS1Tile(Sprite.grass_sand1);
	public static Tile grass_sand2 = new GS2Tile(Sprite.grass_sand2);
	public static Tile grass_sand3 = new GS3Tile(Sprite.grass_sand3);
	public static Tile grass_sand4 = new GS4Tile(Sprite.grass_sand4);
	public static Tile grass_sand5 = new GS5Tile(Sprite.grass_sand5);
	public static Tile grass_sand6 = new GS6Tile(Sprite.grass_sand6);
	public static Tile grass_sand7 = new GS7Tile(Sprite.grass_sand7);
	public static Tile grass_sand8 = new GS8Tile(Sprite.grass_sand8);
	public static Tile Rflower = new Red_FlowerTile(Sprite.Rflower);
	public static Tile Oflower = new Orange_FlowerTile(Sprite.Oflower);
	public static Tile Pflower = new Purple_FlowerTile(Sprite.Pflower);
	
	//Spawn tiles
	
	public static Tile S_grass = new SpawnGrassTile(Sprite.spawn_grass);
	public static Tile S_floor = new SpawnFloorTile(Sprite.spawn_woodfloor);
	public static Tile S_stone = new SpawnStoneTile(Sprite.spawn_stone);
	public static Tile S_wall = new SpawnWallTile(Sprite.spawn_stonewall);
	public static Tile S_water = new SpawnWaterTile(Sprite.spawn_water);
	public static Tile S_bricks = new SpawnBricksTile(Sprite.spawn_colorwall);
	
	
	public static Tile S_tree1 = new SpawnTreeTile(Sprite.spawn_tree1);
	public static Tile S_tree2 = new SpawnTreeTile(Sprite.spawn_tree2);
	public static Tile S_tree3 = new SpawnTreeTile(Sprite.spawn_tree3);
	public static Tile S_tree4 = new SpawnTreeTile(Sprite.spawn_tree4);



public static Tile voidTile = new VoidTile(Sprite.spawn_water);
	
	
	
	public final static int col_s_grass = 0xFF00FF00;
	public final static int col_s_brick = 0xFFFF5214;
	public final static int col_s_wall = 0xFF808080;
	public final static int col_s_water = 0xFF0D05FF;
	public final static int col_s_floor = 0xFF7F0000;
	public final static int col_s_stone = 0xFF003800;
	
	public final static int col_s_tree1 = 0xFF86FF84;
	public final static int col_s_tree2 = 0xFF44FF3A;
	public final static int col_s_tree3 = 0xFF0E7206;
	public final static int col_s_tree4 = 0xFF041E01;

	
	
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;		
	}
	
	public void render(int x, int y, Screen screen) {		
	}
	
	public boolean solid() {
		return false;		
	}
	
	public boolean Psolid() {
		return false;		
	}

}
