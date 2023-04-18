package com.sap.dtos.response;

import com.sap.util.Constants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
public class DemoApplicationResponse<T> {

    private final T results;
    private final String message;

    public DemoApplicationResponse(T results, String message) {
        this.results = results;
        this.message = message;
    }

    /**
     * @param results
     * @param message
     * @return <T> ResponseEntity<DemoApplicationResponse<T>>
     */
    private static <T> DemoApplicationResponse<T> generateResponseBuilder(T results, String message) {
        return new DemoApplicationResponse<>(results, message);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> continueResponse() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.CONTINUE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> continueResponse(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> continueResponse(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.CONTINUE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> continueResponse(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    continueResponse(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> switchingProtocols() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.SWITCHING_PROTOCOLS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> switchingProtocols(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> switchingProtocols(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.SWITCHING_PROTOCOLS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> switchingProtocols(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    switchingProtocols(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> processing() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PROCESSING_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> processing(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> processing(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PROCESSING_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> processing(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> processing(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> checkpoint() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.CHECKPOINT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> checkpoint(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> checkpoint(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.CHECKPOINT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> checkpoint(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> checkpoint(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> ok() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.OK_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.OK);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> ok(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.OK);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> ok(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.OK_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.OK);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> ok(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.OK);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> ok(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.OK);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> created() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.CREATED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> created(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> created(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.CREATED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> created(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> created(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> accepted() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.ACCEPTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> accepted(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> accepted(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.ACCEPTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> accepted(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> accepted(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> nonAuthoritativeInformation() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NON_AUTHORITATIVE_INFORMATION_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> nonAuthoritativeInformation(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> nonAuthoritativeInformation(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NON_AUTHORITATIVE_INFORMATION_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> nonAuthoritativeInformation(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    nonAuthoritativeInformation(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> noContent() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NO_CONTENT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> noContent(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> noContent(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NO_CONTENT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> noContent(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> noContent(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> resetContent() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.RESET_CONTENT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> resetContent(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> resetContent(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.RESET_CONTENT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> resetContent(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> resetContent(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> partialContent() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PARTIAL_CONTENT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> partialContent(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> partialContent(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PARTIAL_CONTENT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> partialContent(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> partialContent(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multiStatus() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.MULTI_STATUS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multiStatus(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multiStatus(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.MULTI_STATUS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multiStatus(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multiStatus(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> alreadyReported() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.ALREADY_REPORTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> alreadyReported(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> alreadyReported(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.ALREADY_REPORTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> alreadyReported(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    alreadyReported(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> imUsed() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.IM_USED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> imUsed(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> imUsed(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.IM_USED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> imUsed(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> imUsed(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multipleChoices() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.MULTIPLE_CHOICES_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multipleChoices(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multipleChoices(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.MULTIPLE_CHOICES_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> multipleChoices(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    multipleChoices(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> movedPermanently() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.MOVED_PERMANENTLY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> movedPermanently(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> movedPermanently(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.MOVED_PERMANENTLY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> movedPermanently(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    movedPermanently(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> found() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.FOUND_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> found(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> found(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.FOUND_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> found(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> found(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> seeOther() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.SEE_OTHER_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> seeOther(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> seeOther(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.SEE_OTHER_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> seeOther(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> seeOther(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notModified() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_MODIFIED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notModified(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notModified(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_MODIFIED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notModified(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notModified(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> temporaryRedirect() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.TEMPORARY_REDIRECT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> temporaryRedirect(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> temporaryRedirect(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.TEMPORARY_REDIRECT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> temporaryRedirect(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    temporaryRedirect(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> permanentRedirect() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PERMANENT_REDIRECT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> permanentRedirect(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> permanentRedirect(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PERMANENT_REDIRECT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> permanentRedirect(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    permanentRedirect(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badRequest() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badRequest(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badRequest(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badRequest(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badRequest(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unauthorized() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.UNAUTHORIZED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unauthorized(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unauthorized(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.UNAUTHORIZED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unauthorized(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unauthorized(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> paymentRequired() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PAYMENT_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> paymentRequired(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> paymentRequired(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PAYMENT_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> paymentRequired(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    paymentRequired(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> forbidden() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.FORBIDDEN_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> forbidden(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> forbidden(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.FORBIDDEN_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> forbidden(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> forbidden(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notFound() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_FOUND_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notFound(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notFound(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_FOUND_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notFound(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notFound(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> methodNotAllowed() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.METHOD_NOT_ALLOWED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> methodNotAllowed(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> methodNotAllowed(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.METHOD_NOT_ALLOWED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> methodNotAllowed(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    methodNotAllowed(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notAcceptable() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_ACCEPTABLE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notAcceptable(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notAcceptable(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_ACCEPTABLE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notAcceptable(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notAcceptable(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> proxyAuthenticationRequired() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PROXY_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> proxyAuthenticationRequired(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> proxyAuthenticationRequired(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PROXY_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> proxyAuthenticationRequired(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    proxyAuthenticationRequired(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestTimeout() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUEST_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestTimeout(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestTimeout(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUEST_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestTimeout(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestTimeout(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> conflict() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.CONFLICT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> conflict(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> conflict(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.CONFLICT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> conflict(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> conflict(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gone() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.GONE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gone(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gone(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.GONE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gone(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gone(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> lengthRequired() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.LENGTH_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> lengthRequired(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> lengthRequired(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.LENGTH_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> lengthRequired(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> lengthRequired(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionFailed() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PRECONDITION_FAILED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionFailed(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionFailed(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PRECONDITION_FAILED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionFailed(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    preconditionFailed(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> payloadTooLarge() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PAYLOAD_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> payloadTooLarge(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> payloadTooLarge(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PAYLOAD_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> payloadTooLarge(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    payloadTooLarge(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> uriTooLong() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.URI_TOO_LONG_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> uriTooLong(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> uriTooLong(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.URI_TOO_LONG_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> uriTooLong(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> uriTooLong(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unsupportedMediaType() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.UNSUPPORTED_MEDIA_TYPE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unsupportedMediaType(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unsupportedMediaType(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.UNSUPPORTED_MEDIA_TYPE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unsupportedMediaType(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    unsupportedMediaType(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestedRangeNotSatisfiable() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestedRangeNotSatisfiable(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestedRangeNotSatisfiable(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestedRangeNotSatisfiable(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    requestedRangeNotSatisfiable(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> expectationFailed() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.EXPECTATION_FAILED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> expectationFailed(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> expectationFailed(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.EXPECTATION_FAILED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> expectationFailed(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    expectationFailed(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> iAmATeapot() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.I_AM_A_TEAPOT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> iAmATeapot(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> iAmATeapot(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.I_AM_A_TEAPOT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> iAmATeapot(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> iAmATeapot(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unprocessableEntity() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.UNPROCESSABLE_ENTITY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unprocessableEntity(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unprocessableEntity(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.UNPROCESSABLE_ENTITY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unprocessableEntity(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    unprocessableEntity(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> locked() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.LOCKED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> locked(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> locked(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.LOCKED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> locked(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> locked(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> failedDependency() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.FAILED_DEPENDENCY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> failedDependency(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> failedDependency(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.FAILED_DEPENDENCY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> failedDependency(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    failedDependency(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> upgradeRequired() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.UPGRADE_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> upgradeRequired(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> upgradeRequired(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.UPGRADE_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> upgradeRequired(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    upgradeRequired(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionRequired() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.PRECONDITION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionRequired(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionRequired(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.PRECONDITION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> preconditionRequired(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    preconditionRequired(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> tooManyRequests() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.TOO_MANY_REQUESTS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> tooManyRequests(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> tooManyRequests(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.TOO_MANY_REQUESTS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> tooManyRequests(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    tooManyRequests(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestHeaderFieldsTooLarge() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestHeaderFieldsTooLarge(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestHeaderFieldsTooLarge(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> requestHeaderFieldsTooLarge(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    requestHeaderFieldsTooLarge(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unavailableForLegalReasons() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unavailableForLegalReasons(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unavailableForLegalReasons(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> unavailableForLegalReasons(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    unavailableForLegalReasons(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> internalServerError() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.INTERNAL_SERVER_ERROR_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> internalServerError(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> internalServerError(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.INTERNAL_SERVER_ERROR_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> internalServerError(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    internalServerError(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notImplemented() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_IMPLEMENTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notImplemented(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notImplemented(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_IMPLEMENTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notImplemented(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notImplemented(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badGateway() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.BAD_GATEWAY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badGateway(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badGateway(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.BAD_GATEWAY_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badGateway(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> badGateway(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> serviceUnavailable() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.SERVICE_UNAVAILABLE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> serviceUnavailable(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> serviceUnavailable(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.SERVICE_UNAVAILABLE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> serviceUnavailable(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    serviceUnavailable(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gatewayTimeout() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.GATEWAY_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gatewayTimeout(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gatewayTimeout(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.GATEWAY_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gatewayTimeout(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> gatewayTimeout(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> httpVersionNotSupported() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.HTTP_VERSION_NOT_SUPPORTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> httpVersionNotSupported(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> httpVersionNotSupported(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.HTTP_VERSION_NOT_SUPPORTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> httpVersionNotSupported(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    httpVersionNotSupported(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> variantAlsoNegotiates() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.VARIANT_ALSO_NEGOTIATES_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> variantAlsoNegotiates(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> variantAlsoNegotiates(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.VARIANT_ALSO_NEGOTIATES_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> variantAlsoNegotiates(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    variantAlsoNegotiates(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> insufficientStorage() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.INSUFFICIENT_STORAGE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> insufficientStorage(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> insufficientStorage(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.INSUFFICIENT_STORAGE_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> insufficientStorage(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    insufficientStorage(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> loopDetected() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.LOOP_DETECTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> loopDetected(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> loopDetected(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.LOOP_DETECTED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> loopDetected(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> loopDetected(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> bandwidthLimitExceeded() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.BANDWIDTH_LIMIT_EXCEEDED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> bandwidthLimitExceeded(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> bandwidthLimitExceeded(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.BANDWIDTH_LIMIT_EXCEEDED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> bandwidthLimitExceeded(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    bandwidthLimitExceeded(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notExtended() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_EXTENDED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notExtended(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notExtended(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_EXTENDED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notExtended(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> notExtended(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> networkAuthenticationRequired() {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, Constants.ResponseMessages.NETWORK_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> networkAuthenticationRequired(String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> networkAuthenticationRequired(T results) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, Constants.ResponseMessages.NETWORK_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>> networkAuthenticationRequired(T results, String message) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<DemoApplicationResponse<T>>
    networkAuthenticationRequired(T results, String message, HttpHeaders headers) {
        DemoApplicationResponse<T> DemoApplicationResponse =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(DemoApplicationResponse, headers, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public String getMessage() {
        return message;
    }

    public T getResults() {
        return results;
    }
}
