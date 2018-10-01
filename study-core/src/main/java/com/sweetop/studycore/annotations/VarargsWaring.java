package com.sweetop.studycore.annotations;


import java.util.ArrayList;
import java.util.List;

public class VarargsWaring {

    @SafeVarargs
    private final List<String> useVarargs(List<String>... args) {
        return args.length > 0 ? args[0] : null;
    }

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        System.out.println(new VarargsWaring().useVarargs(list));
    }
}
