package com.hcl.library.Model;

public interface Borrowable {
    boolean isAvailable();
    void borrow();
    void giveBack();
}