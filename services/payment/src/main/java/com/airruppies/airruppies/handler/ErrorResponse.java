package com.airruppies.airruppies.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}