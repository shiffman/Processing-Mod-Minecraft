package com.processing.minecraft;

import java.io.*;
import processing.core.PApplet;


 public class Sketch extends PApplet {

		public static void main(String[] args) {
			PApplet.main(new String[] {"com.processing.minecraft.Sketch"});
		}

		public void settings() {
			size(200, 200);
		}
	
		public void setup() {
			background(0);
			thread("startMineCraft");
		}
	
		public void draw() {
			fill(255, 50);
			ellipse(random(width), random(height), 16, 16);
		}
		
		public void startMineCraft() {
			try {
				String line;
				String cmd = "./gradlew runClient";
	
				Process p = Runtime.getRuntime().exec(cmd);
				BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while ((line = input.readLine()) != null) {
					System.out.println(line);
				}
				input.close();
			}
			catch (Exception err) {
				err.printStackTrace();
			}
		}
		

}
