package io.github.wkktoria.solid.interfacesegregation.good;

class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
