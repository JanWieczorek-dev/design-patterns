package com.wieczorek.jan.visitor.pattern;

public interface Visitor {

    public double visit(Alcohol alcoholItem);
    public double visit(Tobacco tobaccoItem);
    public double visit(Necessity necessityItem);

}
