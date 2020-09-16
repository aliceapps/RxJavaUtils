package com.aliceapps.rxjavautils;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Implementation of BaseSchedulerProvider. Should be used in project code
 * @author alice.apps
 * @version 16.09.2020
 */

public class MainSchedulerProvider implements BaseSchedulerProvider {
    /**
     *
     * @return io thread
     */
    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    /**
     *
     * @return AndroidSchedulers.mainThread()
     */
    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }

    /**
     *
     * @return computation thread
     */
    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }
}
