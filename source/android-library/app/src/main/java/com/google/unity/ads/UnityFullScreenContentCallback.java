package com.google.unity.ads;

import com.google.android.gms.ads.AdError;

/** A common interface for Full-screen formats. */
public interface UnityFullScreenContentCallback {

  void onAdFailedToShowFullScreenContent(AdError error);

  void onAdShowedFullScreenContent();

  void onAdImpression();

  void onAdDismissedFullScreenContent();
}