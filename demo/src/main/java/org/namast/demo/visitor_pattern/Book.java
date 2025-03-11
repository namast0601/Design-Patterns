package org.namast.demo.visitor_pattern;

public interface Book {
    void accept(Visitor v);
}