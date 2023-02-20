package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class audio1 extends PApplet
{

	Minim minim;
	AudioInput al;
	AudioPlayer ap;//microphone 
	AudioBuffer ab;


	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{

	}
}
