package com.ThymeTheory.Rayne.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import com.ThymeTheory.Rayne.Game;

//import com.ThymeTheory.Rayne.level.tile.Tile;

public class SpawnLevel extends Level {
	
	
	
	public SpawnLevel (String path) {
		super(path);	
	}
	
static String BGmusic = "/Audio/Forest.au";
	
	public static void sound(String path){
		try {
			
			AudioInputStream audio = AudioSystem.getAudioInputStream(Game.class.getResource(path));
			Clip clip = AudioSystem.getClip();
			clip.open(audio);
			FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			volume.setValue(-15.0f);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
	        
			} catch (Exception e) {
			System.out.println("might wanna check " + path + "\n");
			e.printStackTrace();}
		}
		
	
	protected void loadLevel(String path) {	
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = width = image.getWidth();
			int h = height = image.getHeight();			
			tiles = new int[w * h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
			sound(BGmusic);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("EXCEPTION! could not load level file!");
		}
	}
	
	
	
	
	protected void generateLevel() {
		
		
			
		}
	}

