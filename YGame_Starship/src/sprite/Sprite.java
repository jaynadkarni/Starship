package sprite;

import java.awt.Image;

public class Sprite {

	private boolean visible, dying;
	private Image image;
	int x, y, dx;
	
	public Sprite() {
		visible = true;
	}
	
	public void die() {
		visible = false;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	protected void setVisible(boolean b) {
		visible = b;
	}
	
	public void setImage(Image img) {
		image = img;
	}
	
	public Image getImage() {
		return image;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setDying(boolean b) {
		dying = b;
	}
	
	public boolean isDying() {
		return dying;
	}
	
	
	
}
