package com.airruppies.airruppiesapp.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}
