package com.nfeeds.process.upstream.service;

import org.springframework.stereotype.Service;

@Service
public class UpstreamService {

    private final RouterInRemoteCallService routerIn;

    public UpstreamService(RouterInRemoteCallService routerIn) {
        this.routerIn = routerIn;
    }

    // services implementation ...
}
