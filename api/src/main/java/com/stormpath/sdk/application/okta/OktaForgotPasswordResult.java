package com.stormpath.sdk.application.okta;

import com.stormpath.sdk.resource.Resource;

/**
 *
 */
public interface OktaForgotPasswordResult extends Resource {

    String getStatus();
    String getFactorResult();
    String getRelayState();
    String getFactorType();
    String getRecoveryType();

}
