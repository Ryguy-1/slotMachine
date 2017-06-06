package slotMachine;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DisplayReal {
Random rand = new Random();
int realOne = 0;
int realTwo = 0;
int realThree = 0;
int shapes = 3;
int realOneX = 100;
int realTwoX = 333;
int realThreeX = 565;
	


public void spin(){
		
		
	realOne = rand.nextInt(shapes);
	realTwo = rand.nextInt(shapes);
	realThree = rand.nextInt(shapes);
	
	
	}
	
	public boolean isWinner(){
		
		return (realOne==realTwo && realTwo==realThree);
		
	}
	
	
	public void draw(Graphics g){
		g.setColor(Color.GRAY);
		g.fillRect(50, 50, 700, 300);
		
		drawRealOne(g);
		drawRealTwo(g);
		drawRealThree(g);
		
	}
	
	private void drawRealOne(Graphics g){
		
		if (realOne == 0){
			
			drawCircle(g, realOneX);
		}else if (realOne == 1){
			drawSquare(g, realOneX);
			
		}else if(realOne == 2){
			
			draw3DRect(g, realOneX);
			
		}
		
		
	}
	
	private void drawRealTwo(Graphics g){
		
		if (realTwo == 0){
			
			drawCircle(g, realTwoX);
			
		}else if (realTwo == 1){
			drawSquare(g, realTwoX);
			
		}else if (realTwo == 2){
			
			draw3DRect(g, realTwoX);
		}
		
		
	}
	
	private void drawRealThree(Graphics g){
		
		if (realThree == 0){
			
			drawCircle(g, realThreeX);
		}else if (realThree == 1){
			drawSquare(g, realThreeX);
			
		}else if (realThree == 2){
			
			
			draw3DRect(g, realThreeX);
			
		}
		
		
	}
	
	private void drawCircle(Graphics g, int x){
		
		g.setColor(Color.red);
		g.fillOval(x, 100, 150, 150);
		
	}
	
	private void drawSquare(Graphics g, int x){
		
		g.setColor(Color.BLUE);
		g.fillRect(x, 100, 150, 150);
		
	}
	
	private void draw3DRect(Graphics g, int x){
		
		g.setColor(Color.YELLOW);
		g.fill3DRect(x, 100, 150, 100, true);
		
		
	}
	
}






