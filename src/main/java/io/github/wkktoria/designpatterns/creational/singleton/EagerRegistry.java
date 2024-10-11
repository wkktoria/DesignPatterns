package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * This class used eager initialization of singleton instance.
 */
public class EagerRegistry {
    /**
     * The single instance. Eagerly initialized singleton.
     */
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    /**
     * By making constructor private, it prevents object instantiation outside of this class
     * and this will also prevent inheritance.
     */
    private EagerRegistry() {
    }

    /**
     * This method returns the singleton instance.
     *
     * @return instance of {@link EagerRegistry}
     */
    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
