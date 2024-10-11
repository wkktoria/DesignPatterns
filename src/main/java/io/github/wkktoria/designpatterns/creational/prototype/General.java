package io.github.wkktoria.designpatterns.creational.prototype;

/**
 * Doesn't support cloning.
 */
public class General extends GameUnit {
    private UnitState state = UnitState.IDLE;

    public void boostMorale() {
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
