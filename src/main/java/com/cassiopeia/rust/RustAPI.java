package com.cassiopeia.rust;

import java.util.HashMap;

public class RustAPI {

    public static native void initialize(HashMap<Object, Object> tempMap);

    public static native void startTimeFetch();

    public static native void calculateHistoryDownSync();

    public static native void commonSelect();

    public static native void trackSold();

    public static native void maxWinCalculate();


}
