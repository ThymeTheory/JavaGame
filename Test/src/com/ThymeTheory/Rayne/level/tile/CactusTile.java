package com.ThymeTheory.Rayne.level.tile;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.graphics.Sprite;

public class CactusTile extends Tile {
	
	public CactusTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
		
		
	}	
	public boolean solid() {
		return true;		
	}

}
