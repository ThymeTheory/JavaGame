package com.ThymeTheory.Rayne.level.tile.spawn_level;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.graphics.Sprite;
import com.ThymeTheory.Rayne.level.tile.Tile;

public class SpawnWallTile extends Tile {

	public SpawnWallTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
		
		
	}	
	public boolean solid() {
		return true;		
	}
	public boolean Psolid() {
		return true;		
	}

}
