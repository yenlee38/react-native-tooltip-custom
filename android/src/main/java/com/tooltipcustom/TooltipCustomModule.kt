package com.tooltipcustom

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = TooltipCustomModule.NAME)
class TooltipCustomModule(reactContext: ReactApplicationContext) :
  NativeTooltipCustomSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

    override fun compare(a: Double, b: Double): Boolean {
    return a > b
  }

  override fun checkCameraPermission(promise: Promise) {
    val activity = currentActivity ?: run {
      promise.reject("NO_ACTIVITY", "No activity available")
      return
    }

    val result = ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA)
    promise.resolve(result == PackageManager.PERMISSION_GRANTED)
}

  companion object {
    const val NAME = "TooltipCustom"
  }
}
