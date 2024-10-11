package io.github.wkktoria.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EagerRegistryTest {
    @Test
    void getInstanceReturnsTheSameInstanceEveryTime() {
        EagerRegistry r1 = EagerRegistry.getInstance();
        EagerRegistry r2 = EagerRegistry.getInstance();
        assertEquals(r1, r2);
        assertSame(r1, r2);
    }
}