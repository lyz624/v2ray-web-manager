package com.jhl.utils;

import com.google.common.collect.Interner;
import com.google.common.collect.Interners;

public class SynchronizedInternerUtils {

    private final static Interner<Object> STRING_WEAK_POLL = Interners.newWeakInterner();

    /**
     * weakReference pool
     * @return same reference
     */
    public static Interner getInterner() {
        return STRING_WEAK_POLL;
    }
}
