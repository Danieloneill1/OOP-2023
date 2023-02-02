package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX = 1;
    float playerY = 2;
    float playerWidth = 20;
	float h = 20;
	float bugwidth;
	float bugy,halfPlayer;
	float bugx, halfBug;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		smooth();
		
		playerX = width * 0.5f;//f to change to float..Like (float)0.5
		playerY = height - 100;
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;

	void resetBug()
	{
		bugy = 50;
		bugwidth= 50;
		bugx = random(halfBug,width-halfBug);
	}

	
	public void draw()
	{	
		strokeWeight(2);
		stroke(c, 255, 255);
		c = (c + 1f) % 255;
		line(x1, y1, x2, y2);

		x1 += x1dir;
		x2 += x2dir;
		y1 += y1dir;
		y2 += y2dir;
		
		if (x1 < 0 || x1 > width)
		{
			x1dir = - x1dir;
		}
		if (y1 < 0 || y1 > height)
		{
			y1dir = - y1dir;
		}

		if (x2 < 0 || x2 > width)
		{
			x2dir = - x2dir;
		}
		if (y2 < 0 || y2 > height)
		{
			y2dir = - y2dir;
		}

        drawPlayer(playerX, playerY, playerWidth, h);
	}

    void drawPlayer(float x, float y, float w, float h)
    {
		rectMode(CENTER);
		rect(x, y, w, w);
		line(x,y - halfPlayer, y - halfPlayer * 2, y);
        strokeWeight(2);
		stroke(c, 255, 255);
		c = (c + 1f) % 255;
    }

	public void keyPressed()
	{
		if(keyCode == LEFT)
		{
			playerX--;
		}

		if(keyCode == RIGHT)
		{
			playerX++;
		}
	}
}
