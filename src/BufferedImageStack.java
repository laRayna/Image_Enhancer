
import java.awt.image.BufferedImage;


public class BufferedImageStack {
	
	BufferedImage [] fin= new BufferedImage[2];
	int size= 0;
	
	public BufferedImageStack() {
		fin = null;
	}
	public BufferedImageStack(BufferedImage someBufferedImage) {
		fin[0] = someBufferedImage;
		
	}
	public void push(BufferedImage someBufferedImage) {
		
		
	}
	public void pop() {
		
		for(int i = 0;i <fin.length; i++) {
			if(fin[i]== null) {
				fin[i-1]=null;
			}
		}
		fin[fin.length-1]=null;
		
		size--;
		
	}
	
	public boolean isEmpty() {
		if(fin == null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public BufferedImage get(int index) {
		return fin[index];
		
	}
	public int getSize() {
		return size;
		
	}
	public int getArraySize() {
		return fin.length;
	}

}
