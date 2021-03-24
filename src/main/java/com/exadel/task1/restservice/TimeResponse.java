package com.exadel.task1.restservice;

public class TimeResponse {
    private final Long requestId;
    private final String currentTime;

    public TimeResponse(Long requestId, String currentTime) {
        this.requestId = requestId;
        this.currentTime = currentTime;
    }

    public Long getRequestId() {
        return requestId;
    }

    public String getCurrentTime() {
        return currentTime;
    }
}
