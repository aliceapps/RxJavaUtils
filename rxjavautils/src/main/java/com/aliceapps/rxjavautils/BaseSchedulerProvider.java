package com.aliceapps.rxjavautils;

import io.reactivex.Scheduler;

public interface BaseSchedulerProvider {
    Scheduler io();
    Scheduler ui();
    Scheduler computation();
}
