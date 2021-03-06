package com.flightstats.flex.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class ConnectionFlight {
    Integer elapsedTime;
    Integer score;
    List<ScheduledFlight> scheduledFlight;
}