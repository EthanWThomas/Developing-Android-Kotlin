package com.example.android.trackmysleepquality.sleepquality;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SleepQualityFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SleepQualityFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SleepQualityFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SleepQualityFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SleepQualityFragmentArgs __result = new SleepQualityFragmentArgs();
    bundle.setClassLoader(SleepQualityFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("sleepNightKey")) {
      long sleepNightKey;
      sleepNightKey = bundle.getLong("sleepNightKey");
      __result.arguments.put("sleepNightKey", sleepNightKey);
    } else {
      throw new IllegalArgumentException("Required argument \"sleepNightKey\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SleepQualityFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    SleepQualityFragmentArgs __result = new SleepQualityFragmentArgs();
    if (savedStateHandle.contains("sleepNightKey")) {
      long sleepNightKey;
      sleepNightKey = savedStateHandle.get("sleepNightKey");
      __result.arguments.put("sleepNightKey", sleepNightKey);
    } else {
      throw new IllegalArgumentException("Required argument \"sleepNightKey\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getSleepNightKey() {
    return (long) arguments.get("sleepNightKey");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("sleepNightKey")) {
      long sleepNightKey = (long) arguments.get("sleepNightKey");
      __result.putLong("sleepNightKey", sleepNightKey);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("sleepNightKey")) {
      long sleepNightKey = (long) arguments.get("sleepNightKey");
      __result.set("sleepNightKey", sleepNightKey);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SleepQualityFragmentArgs that = (SleepQualityFragmentArgs) object;
    if (arguments.containsKey("sleepNightKey") != that.arguments.containsKey("sleepNightKey")) {
      return false;
    }
    if (getSleepNightKey() != that.getSleepNightKey()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getSleepNightKey() ^ (getSleepNightKey() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "SleepQualityFragmentArgs{"
        + "sleepNightKey=" + getSleepNightKey()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull SleepQualityFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
    }

    @NonNull
    public SleepQualityFragmentArgs build() {
      SleepQualityFragmentArgs result = new SleepQualityFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSleepNightKey(long sleepNightKey) {
      this.arguments.put("sleepNightKey", sleepNightKey);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getSleepNightKey() {
      return (long) arguments.get("sleepNightKey");
    }
  }
}
