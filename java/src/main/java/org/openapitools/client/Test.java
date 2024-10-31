package org.openapitools.client;

import org.openapitools.client.api.ConstraintsServiceApi;
import org.openapitools.client.api.FlagsServiceApi;
import org.openapitools.client.api.SegmentsServiceApi;
import org.openapitools.client.model.*;

public class Test {
    public static void main(String[] args) throws ApiException {
        ApiClient client = new ApiClient();
        client.setBasePath("ffp_endpoint");
        client.setApiKey("sci_token=");

        //create segment
        SegmentsServiceApi segmentsServiceApi = new SegmentsServiceApi(client);
        SegmentCreateRequest segmentCreateRequest = SegmentCreateRequest.builder()
            .name("sci_segment_01")
                .matchType(SegmentMatchType.ALL_MATCH_TYPE)
            .description("This is a segment for testing purposes.")
            .build();
        Segment sciSegment01 = segmentsServiceApi.segmentsServiceCreate("sci", segmentCreateRequest);
        // create constraints
        ConstraintsServiceApi constraintsServiceApi = new ConstraintsServiceApi(client);
        ConstraintCreateRequest constraintCreateRequest = ConstraintCreateRequest.builder()
                .value("1")
                .operator("IS ONE OF")
            .description("This is a constraint for testing purposes.")
            .build();
        constraintsServiceApi.constraintsServiceCreate("sci", sciSegment01.getKey(), constraintCreateRequest);

        // create flag
        FlagsServiceApi api = new FlagsServiceApi(client);
        FlagCreateRequest request = FlagCreateRequest.builder()
            .name("sci_flag_01")
            .description("This is a flag for testing purposes.")
                .enabled(true)
            .build();
        api.flagsServiceCreate("sci", request);

        // Custom logic here
    }
}
