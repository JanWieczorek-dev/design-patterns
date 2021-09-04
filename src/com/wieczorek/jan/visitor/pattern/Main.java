package com.wieczorek.jan.visitor.pattern;

public class Main {
    public static void main(String[] args) {

        TaxVisitor ourTaxVisitor = new TaxVisitor();
        Alcohol tokajWine = new Alcohol(1.01);
        Necessity showerGel = new Necessity(3.03);
        Tobacco cigarettes = new Tobacco(6.0);

        System.out.println(tokajWine.getPrice());
        System.out.println(tokajWine.accept(ourTaxVisitor));

    }
}
