package com.ThymeTheory.entity.projectile;

import com.ThymeTheory.Rayne.graphics.Screen;
import com.ThymeTheory.Rayne.graphics.Sprite;
import com.ThymeTheory.entity.particle.Particle;


public class WizardProjectile extends Projectile {
	
	public static final int FIRE_RATE = 8; //  Higher is Slower :)
	
	public WizardProjectile (int x, int y, double dir) {
		super(x, y, dir);
		range = random.nextInt(50) + 100;
		speed = 2;
		damage = 20;
		sprite = Sprite.wizard;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}
	
	public void update() {
		if (level.tileCollision(x, y, nx, ny, 6)) {
				Particle p = new Particle((int)x, (int)y, 50, 50 );
				level.add(p);
		remove();
		}
		move();
	}
	
	protected void move() {
		x += nx;
		y += ny;
		
		
		if (distance() > range) remove();
	}
	
	private double distance() {
		double dist = 0;
		dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (yOrigin - y)));
		return dist;
	}

	public void render(Screen screen) {
		screen.renderProjectile((int)x - 8 , (int)y - 2, this);
	}

}

