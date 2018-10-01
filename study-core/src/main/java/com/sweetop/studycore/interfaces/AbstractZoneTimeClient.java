package com.sweetop.studycore.interfaces;

import java.time.ZonedDateTime;

public interface AbstractZoneTimeClient extends TimeClient {
    ZonedDateTime getZonedDateTime(String zoneString);
}