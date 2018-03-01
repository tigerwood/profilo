// Copyright 2004-present Facebook. All Rights Reserved.

package com.facebook.profilo.provider.atrace;

import com.facebook.profilo.core.BaseTraceProvider;
import com.facebook.profilo.core.ProvidersRegistry;

public final class SystraceProvider extends BaseTraceProvider {

  public static final int PROVIDER_ATRACE = ProvidersRegistry.newProvider("other");

  @Override
  protected void enable() {
    Atrace.enableSystrace();
  }

  @Override
  protected void disable() {
    Atrace.restoreSystrace();
  }

  @Override
  protected int getSupportedProviders() {
    return PROVIDER_ATRACE;
  }
}