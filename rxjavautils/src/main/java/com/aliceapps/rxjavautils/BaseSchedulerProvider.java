package com.aliceapps.rxjavautils;

import io.reactivex.Scheduler;

/**
 * Public interface that allows to get different Schedulers for one place.
 * @author alice.apps
 * @version 16.09.2020
 */
public interface BaseSchedulerProvider {
    /**
     *
     * @return io thread
     */
    Scheduler io();

    /**
     *
     * @return main ui thread
     */
    Scheduler ui();

    /**
     *
     * @return computation thread
     */
    Scheduler computation();
}
