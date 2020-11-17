
package sim;

import java.awt.Color;
import java.awt.Graphics;


public class World {
    private final int SIZE = 600;
    private final Color bg = Color.GRAY;
    // array of blobs
    private Blob[] blobs = new Blob[10];
    
    public World() {
        for (int i = 0; i<blobs.length; i++) {
            blobs[i] = new Blob();
        }
    }
    
    public void draw(Graphics g) {
        
        // for each loop, enhance for loop
        for (Blob blob : blobs) {
            if (blob.getHp() <= 0) continue;
            blob.move();
            blob.draw(g);
            blob.collideWoldBounds(this);
            for (Blob b2: blobs) {
                blob.collide(blob);
            }    
            
        }
        
    }

    public int getSIZE() {
        return SIZE;
    }
    
    
    
    
}
