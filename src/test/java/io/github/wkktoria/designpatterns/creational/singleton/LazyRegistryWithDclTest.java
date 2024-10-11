package io.github.wkktoria.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyRegistryWithDclTest {
    @Test
    void getInstanceReturnsTheSameInstanceEveryTime() {
        LazyRegistryWithDcl r1 = LazyRegistryWithDcl.getInstance();
        LazyRegistryWithDcl r2 = LazyRegistryWithDcl.getInstance();
        assertEquals(r1, r2);
        assertSame(r1, r2);
    }
}