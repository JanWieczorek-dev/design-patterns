package com.wieczorek.jan.visitor.pattern;

public class TaxVisitor implements Visitor{

    public TaxVisitor(){

    }


    @Override
    public double visit(Alcohol alcoholItem) {
        System.out.println("Alcohol item - price with tax");
        return Math.round(alcoholItem.getPrice()*1.18*100.0)/100.0;
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item - price with tax");
        return Math.round(tobaccoItem.getPrice()*1.56*100.0)/100.0;
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item - price with tax");
        return Math.round(necessityItem.getPrice()*1.02*100.0)/100.0;
    }
}

