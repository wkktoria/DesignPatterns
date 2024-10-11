package io.github.wkktoria.designpatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry1 == eagerRegistry2);

        LazyRegistryWithDcl lazyRegistryWithDcl1 = LazyRegistryWithDcl.getInstance();
        LazyRegistryWithDcl lazyRegistryWithDcl2 = LazyRegistryWithDcl.getInstance();
        System.out.println(lazyRegistryWithDcl1 == lazyRegistryWithDcl2);

        LazyRegistryWithIodh lazyRegistryWithIodh1 = LazyRegistryWithIodh.getInstance();
        LazyRegistryWithIodh lazyRegistryWithIodh2 = LazyRegistryWithIodh.getInstance();
        System.out.println(lazyRegistryWithIodh1 == lazyRegistryWithIodh2);

        EnumRegistry enumRegistry1 = EnumRegistry.INSTANCE;
        EnumRegistry enumRegistry2 = EnumRegistry.INSTANCE;
        System.out.println(enumRegistry1 == enumRegistry2);
    }
}
