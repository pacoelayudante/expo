package abi34_0_0.host.exp.exponent.modules.api.screens;

import abi34_0_0.com.facebook.react.ReactPackage;
import abi34_0_0.com.facebook.react.bridge.NativeModule;
import abi34_0_0.com.facebook.react.bridge.ReactApplicationContext;
import abi34_0_0.com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RNScreensPackage implements ReactPackage {
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Arrays.<ViewManager>asList(
            new ScreenContainerViewManager(),
            new ScreenViewManager()
    );
  }
}
