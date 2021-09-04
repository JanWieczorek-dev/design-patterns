package com.wieczorek.jan.visitor.pattern;

public interface Visitable {
    public double accept(Visitor visitor);
}
