package com.sap.util;

public interface Constants {

    interface ResponseMessages {
        String RESOURCE_RENDERED_SUCCESSFULLY = "resource rendered successfully.";
        String CONTINUE_MESSAGE = "continue for addition resource.";
        String SWITCHING_PROTOCOLS_MESSAGE = "switching protocols for client.";
        String PROCESSING_MESSAGE = "processing request.";
        String CHECKPOINT_MESSAGE = " checkpoint.";
        String OK_MESSAGE = RESOURCE_RENDERED_SUCCESSFULLY;
        String CREATED_MESSAGE = "resource created successfully.";
        String ACCEPTED_MESSAGE = "request accepted.";
        String NON_AUTHORITATIVE_INFORMATION_MESSAGE = " nonAuthoritativeInformation.";
        String NO_CONTENT_MESSAGE = "no resource required.";
        String RESET_CONTENT_MESSAGE = " resetContent.";
        String PARTIAL_CONTENT_MESSAGE = " partialContent.";
        String MULTI_STATUS_MESSAGE = " multiStatus.";
        String ALREADY_REPORTED_MESSAGE = " alreadyReported.";
        String IM_USED_MESSAGE = " imUsed.";
        String MULTIPLE_CHOICES_MESSAGE = " multipleChoices.";
        String MOVED_PERMANENTLY_MESSAGE = " movedPermanently.";
        String FOUND_MESSAGE = " found.";
        String SEE_OTHER_MESSAGE = " seeOther.";
        String NOT_MODIFIED_MESSAGE = " notModified.";
        String TEMPORARY_REDIRECT_MESSAGE = " temporaryRedirect.";
        String PERMANENT_REDIRECT_MESSAGE = " permanentRedirect.";
        String BAD_REQUEST_MESSAGE = "Bad request.";
        String UNAUTHORIZED_MESSAGE = "Unauthorized request Product not logged in.";
        String PAYMENT_REQUIRED_MESSAGE = " paymentRequired.";
        String FORBIDDEN_MESSAGE = "resource forbidden.";
        String NOT_FOUND_MESSAGE = "resource notFound.";
        String METHOD_NOT_ALLOWED_MESSAGE = "method not allowed for resource.";
        String NOT_ACCEPTABLE_MESSAGE = " notAcceptable.";
        String PROXY_AUTHENTICATION_REQUIRED_MESSAGE = " proxyAuthenticationRequired.";
        String REQUEST_TIMEOUT_MESSAGE = " requestTimeout.";
        String CONFLICT_MESSAGE = " conflict.";
        String GONE_MESSAGE = " gone.";
        String LENGTH_REQUIRED_MESSAGE = " lengthRequired.";
        String PRECONDITION_FAILED_MESSAGE = " preconditionFailed.";
        String PAYLOAD_TOO_LARGE_MESSAGE = " payloadTooLarge.";
        String URI_TOO_LONG_MESSAGE = " uriTooLong.";
        String UNSUPPORTED_MEDIA_TYPE_MESSAGE = " unsupportedMediaType.";
        String REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE = " requestedRangeNotSatisfiable.";
        String EXPECTATION_FAILED_MESSAGE = " expectationFailed.";
        String I_AM_A_TEAPOT_MESSAGE = " iAmATeapot.";
        String UNPROCESSABLE_ENTITY_MESSAGE = " unprocessableEntity.";
        String LOCKED_MESSAGE = " locked.";
        String FAILED_DEPENDENCY_MESSAGE = " failedDependency.";
        String UPGRADE_REQUIRED_MESSAGE = " upgradeRequired.";
        String PRECONDITION_REQUIRED_MESSAGE = " preconditionRequired.";
        String TOO_MANY_REQUESTS_MESSAGE = "too many requests for resource.";
        String REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE = " requestHeaderFieldsTooLarge.";
        String UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE = " unavailableForLegalReasons.";
        String INTERNAL_SERVER_ERROR_MESSAGE = " internalServerError.";
        String NOT_IMPLEMENTED_MESSAGE = " notImplemented.";
        String BAD_GATEWAY_MESSAGE = " badGateway.";
        String SERVICE_UNAVAILABLE_MESSAGE = " serviceUnavailable.";
        String GATEWAY_TIMEOUT_MESSAGE = " gatewayTimeout.";
        String HTTP_VERSION_NOT_SUPPORTED_MESSAGE = " httpVersionNotSupported.";
        String VARIANT_ALSO_NEGOTIATES_MESSAGE = " variantAlsoNegotiates.";
        String INSUFFICIENT_STORAGE_MESSAGE = " insufficientStorage.";
        String LOOP_DETECTED_MESSAGE = " loopDetected.";
        String BANDWIDTH_LIMIT_EXCEEDED_MESSAGE = " bandwidthLimitExceeded.";
        String NOT_EXTENDED_MESSAGE = " notExtended.";
        String NETWORK_AUTHENTICATION_REQUIRED_MESSAGE = " networkAuthenticationRequired.";
        String USER_DELETED = "Product Deleted Successfully";
    }

    interface ErrorMessages {
        String USER_NOT_FOUND = "Product not found";
        String USER_ALREADY_EXISTS = "Product already exists";
    }
}
