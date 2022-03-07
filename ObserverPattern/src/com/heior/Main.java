package com.heior;

import com.heior.domain.Subject;
import com.heior.domain.impl.BinObserver;
import com.heior.domain.impl.HexObserver;
import com.heior.domain.impl.OctObserver;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        HexObserver hexObserver = new HexObserver(subject);
        OctObserver octObserver = new OctObserver(subject);
        BinObserver binObserver = new BinObserver(subject);
        System.out.println("first states is " + 10);
        subject.setState(10);
        System.out.println("second states is " + 15);
        subject.setState(15);
    }
}
