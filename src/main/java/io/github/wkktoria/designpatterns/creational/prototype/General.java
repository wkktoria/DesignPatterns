package io.github.wkktoria.designpatterns.creational.prototype;

/**
 * Doesn't support cloning.
 */
class General extends GameUnit {
    private UnitState state = UnitState.IDLE;

    void boostMorale() {
        this.state = UnitState.MORAL_BOOST;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }

    @Override
    public String toString() {
        return "General [state=" + state + "] @ " + this.getPosition();
    }
}
