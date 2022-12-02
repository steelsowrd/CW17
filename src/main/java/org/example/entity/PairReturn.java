package org.example.entity;

public class PairReturn<F,S> {
    private F firstReturn;
    private S secondReturn;

    public F getFirstReturn() {
        return firstReturn;
    }

    public void setFirstReturn(F firstReturn) {
        this.firstReturn = firstReturn;
    }

    public S getSecondReturn() {
        return secondReturn;
    }

    public void setSecondReturn(S secondReturn) {
        this.secondReturn = secondReturn;
    }
}
