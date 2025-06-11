package com.example.norush.exception;

import com.example.norush.common.exception.ExceptionType;
import com.example.norush.common.exception.Status;

public enum AuthExceptionType implements ExceptionType {

    INVALID_TOKEN(Status.BAD_REQUEST, 1001, "토큰이 유효하지 않습니다"),
    INVALID_PASSWORD(Status.UNAUTHORIZED, 1002, "비밀번호가 일치하지 않습니다"),
    UNAUTHORIZED(Status.UNAUTHORIZED, 1003, "로그인한 정보가 없습니다"),
    SIGNATURE_NOT_FOUND(Status.BAD_REQUEST, 1004, "서명을 확인하지 못했습니다"),
    MALFORMED_TOKEN(Status.BAD_REQUEST, 1005, "토큰 형식이 잘못되었습니다"),
    EXPIRED_TOKEN(Status.BAD_REQUEST, 1006, "이미 만료된 토큰입니다"),
    UNSUPPORTED_TOKEN(Status.BAD_REQUEST, 1007, "지원하지 않는 토큰입니다"),
    INVALID_SIGNATURE(Status.BAD_REQUEST, 1008, "잘못된 서명입니다"),
    UNSUPPORTED_LOGIN_PROVIDER(Status.BAD_REQUEST, 1009, "지원하지 않는 로그인 제공자입니다"),
    INVALID_EMAIL(Status.BAD_REQUEST, 1010, "이미 사용중인 이메일입니다"),
    ALREADY_JOINED_NORMAL_USER(Status.BAD_REQUEST, 1011, "일반회원으로 이미 가입하여 소셜로그인으로 가입할 수 없습니다"),
    PASSWORD_CONFIRM_MISMATCH(Status.BAD_REQUEST, 1012, "비밀번호 확인이 일치하지 않습니다")
    ;

    private final Status status;
    private final int exceptionCode;
    private final String message;

    AuthExceptionType(Status status, int exceptionCode, String message) {
        this.status = status;
        this.exceptionCode = exceptionCode;
        this.message = message;
    }

    @Override
    public Status status() {
        return status;
    }

    @Override
    public int exceptionCode() {
        return exceptionCode;
    }

    @Override
    public String message() {
        return message;
    }
}
