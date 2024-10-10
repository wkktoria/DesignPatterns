package io.github.wkktoria.designpatterns.creational.prototype;

class Swordsman extends GameUnit {
    private UnitState state = UnitState.IDLE;

    void attack() {
        this.state = UnitState.ATTACKING;
    }

    @Override
    protected void reset() {
        this.state = UnitState.IDLE;
    }

    @Override
    public String toString() {
        return "Swordsman [state = " + state + "] @ " + this.getPosition();
    }
}
