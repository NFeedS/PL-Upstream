package com.nfeeds.process.upstream.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RouterInRemoteCallService {
    @Value("${nfeeds.bl.routerin.url}")
    private String baseUrl;

    // remote calls implementation ...
}