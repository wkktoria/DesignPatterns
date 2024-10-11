package io.github.wkktoria.designpatterns.creational.singleton;

/**
 * This class used eager initialization of singleton instance.
 */
class EagerRegistry {
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
    }

    static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
