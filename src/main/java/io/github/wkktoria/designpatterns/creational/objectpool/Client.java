package io.github.wkktoria.designpatterns.creational.objectpool;

import javafx.geometry.Point2D;

class Client {
    /**
     * Creates the pool with 5 objects.
     */
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(
            () -> new Bitmap("logo.bmp"), 5);

    public static void main(String[] args) {
        // Get objects from pool and use them as regular objects:
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10, 10));

        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(-10, -10));

        b1.draw();
        b2.draw();

        // Release objects when done:
        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }
}
