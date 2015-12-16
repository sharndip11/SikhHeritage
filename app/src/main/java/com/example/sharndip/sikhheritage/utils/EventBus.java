package com.example.sharndip.sikhheritage.utils;

import com.squareup.otto.Bus;

/**
 * Created by Sharndip on 16/12/2015.
 */
public class EventBus extends Bus{
    private static final EventBus bus = new EventBus();

    public static Bus  getInstance() { return bus; }

    private EventBus() {}
}
