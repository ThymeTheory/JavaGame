package com.ThymeTheory.Rayne.level.tile.spawn_level;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.graphics.Sprite;
import com.ThymeTheory.Rayne.level.tile.Tile;

public class SpawnBricksTile extends Tile {

	public SpawnBricksTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);	
		
	}	
	public boolean solid() {
		return true;		
	}
}
