
package sim;

import java.awt.Color;
import java.awt.Graphics;


public class World {
    private final int SIZE = 600;
    private final Color bg = Color.GRAY;
    // array of blobs
    private Blob[] blobs = new Blob[5000];
    
    public World() {
        for (int i = 0; i<5000; i++) {
            blobs[i] = new Blob();
        }
    }
    
    public void draw(Graphics g) {
        
        // for each loop, enhance for loop
        for (Blob blob : blobs) {
            blob.draw(g);
        }
        
    }
    
}
