package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class audio1 extends PApplet
{

	Minim minim;
	AudioInput ai;
	AudioPlayer ap;//microphone 
	AudioBuffer ab;//audio buffer like an array


	public void settings()
	{
		size(1024, 500);//1024 samples per sec
	}

	int frameSize = 1024;

	public void setup() {
		colorMode(HSB);
		background(0);

		minim = new Minim(this);//create new object

		ai = minim.getLineIn(minim.MONO, frameSize, 44100, 16);
		ab = ai.mix;//left and right chanel

		smooth();
	}
	
	public void draw()
	{
		background(0);
		stroke(255);

		float half = height / 2;
		float cgap = 255 / (float)ab.size();//255 colours
		float average = 0;

		for(int i = 0; i < ab.size(); i++)
		{
			abs (average = average + i);
		}

		average = average/ab.size();

		for(int i = 0; i < ab.size(); i++)//iterate through each frame
		{
			stroke(cgap * i, 255, 255);
			line(i, half, i, half + ab.get(i)*half);//ab.get like ab[i]
		}
	}
}
