package com.project.agit.common.ping;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0006"}, d2 = {"Lcom/project/agit/common/ping/PingController;", "", "()V", "ping", "", "Companion", "agit-common"})
@org.springframework.web.bind.annotation.RestController
public class PingController {
    @org.jetbrains.annotations.NotNull
    public static final com.project.agit.common.ping.PingController.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PING_API_PATH = "/api/ping";
    
    public PingController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/api/ping"})
    public java.lang.String ping() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/project/agit/common/ping/PingController$Companion;", "", "()V", "PING_API_PATH", "", "agit-common"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}