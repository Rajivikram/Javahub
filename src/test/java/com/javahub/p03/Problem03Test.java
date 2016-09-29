package com.javahub.p03;

import org.junit.Test;

/**
 * Created by RAJRA on 9/27/2016.
 */
public class Problem03Test {
    private static final String value = "rAjivikram";

    @Test
    public void testnumberSeriesByAlaphabets() {
        new Problem03().numberSeriesByAlaphabets(value.toLowerCase());
    }
}
