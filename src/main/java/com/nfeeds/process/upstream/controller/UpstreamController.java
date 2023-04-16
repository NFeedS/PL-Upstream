package com.nfeeds.process.upstream.controller;

import com.nfeeds.process.upstream.service.UpstreamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/upstream")
public class UpstreamController {

    private final UpstreamService upstreamService;

    public UpstreamController(UpstreamService upstreamService) {
        this.upstreamService = upstreamService;
    }

    // endpoints implementation ...
}
