package io.github.wkktoria.solid.interfacesegregation.bad;

class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("BasicPrinter doesn't support scanning");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("BasicPrinter doesn't support faxing");
    }
}
