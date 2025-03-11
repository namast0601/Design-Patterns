package org.namast.demo.visitor_pattern;

public interface Visitor {

    void visit(BusinessBook book);

    void visit(DesignPatternBook book);

    void visit(JavaCoreBook book);
}
