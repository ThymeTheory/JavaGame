package com.ThymeTheory.Rayne.level.tile.spawn_level;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.graphics.Sprite;
import com.ThymeTheory.Rayne.level.tile.Tile;

public class SpawnGrassTile extends Tile {

	public SpawnGrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
		
		
	}	

}
