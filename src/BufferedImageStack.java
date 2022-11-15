
import java.awt.image.BufferedImage;


public class BufferedImageStack {
	
	BufferedImage [] fin= new BufferedImage[2];
	int size= fin.length;
	
	public BufferedImageStack() {
		fin = null;
	}
	public BufferedImageStack(BufferedImage someBufferedImage) {
		fin[0] = someBufferedImage;
		
	}
	public void push(BufferedImage someBufferedImage) {
		if(fin[0]==null) {
			fin[0] = someBufferedImage;
		}
		else if(fin[1]==null) {
			fin[1]= someBufferedImage;
		}
		else {

			BufferedImage[] newer = new BufferedImage[size +1];
			for(int i= 0; i<size+1;i++) {
				while
			}
			
		}
		
	}
	public void pop() {
		
	}
	
	public boolean isEmpty() {
		
	}
	public BufferedImageStack get(int index) {
		
	}
	public int getSize() {
		
	}
	public int getArraySize() {
		
	}

}
