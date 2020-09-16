package com.aliceapps.rxjavautils;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Implementation of BaseSchedulerProvider. Can be used for testing
 * @author alice.apps
 * @version 16.09.2020
 */
public class TrampolineSchedulerProvider  implements BaseSchedulerProvider {

    /**
     *
     * @return trampoline scheduler
     */
    @Override
    public Scheduler io() {
        return Schedulers.trampoline();
    }

    /**
     *
     * @return trampoline scheduler
     */
    @Override
    public Scheduler ui() {
        return Schedulers.trampoline();
    }

    /**
     *
     * @return trampoline scheduler
     */
    @Override
    public Scheduler computation() {
        return Schedulers.trampoline();
    }
}