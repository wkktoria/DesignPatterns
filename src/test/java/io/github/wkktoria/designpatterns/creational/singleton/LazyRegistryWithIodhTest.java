package io.github.wkktoria.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyRegistryWithIodhTest {
    @Test
    void getInstanceReturnsTheSameInstanceEveryTime() {
        LazyRegistryWithIodh r1 = LazyRegistryWithIodh.getInstance();
        LazyRegistryWithIodh r2 = LazyRegistryWithIodh.getInstance();
        assertEquals(r1, r2);
        assertSame(r1, r2);
    }
}