package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * This class demonstrates singleton pattern using double-checked locking.
 * This is also a lazy initialization singleton.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Double-checked_locking">Double-checked locking</a>
 */
public class LazyRegistryWithDcl {
    /**
     * The instance.
     * The volatile modifier guarantees that any thread that reads a field
     * will see the most recently written value.
     */
    private static volatile LazyRegistryWithDcl instance;

    /**
     * Private constructor to prevent instantiation outside this class and prevent subclassing.
     */
    private LazyRegistryWithDcl() {
    }

    /**
     * This method implements the double-checked locking.
     *
     * @return instance of {@link LazyRegistryWithDcl}
     */
    public static LazyRegistryWithDcl getInstance() {
        if (instance == null) {
            synchronized (LazyRegistryWithDcl.class) {
                if (instance == null) {
                    instance = new LazyRegistryWithDcl();
                }
            }
        }
        return instance;
    }
}
