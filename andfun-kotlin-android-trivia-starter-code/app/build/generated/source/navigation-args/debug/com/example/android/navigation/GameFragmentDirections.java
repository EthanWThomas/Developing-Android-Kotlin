package com.example.android.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static ActionGameFragmentToGameWonFragment actionGameFragmentToGameWonFragment(
      int numQuestion, int numCorrect) {
    return new ActionGameFragmentToGameWonFragment(numQuestion, numCorrect);
  }

  @NonNull
  public static NavDirections actionGameFragmentToGameOverFragment2() {
    return new ActionOnlyNavDirections(R.id.action_gameFragment_to_gameOverFragment2);
  }

  public static class ActionGameFragmentToGameWonFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGameFragmentToGameWonFragment(int numQuestion, int numCorrect) {
      this.arguments.put("numQuestion", numQuestion);
      this.arguments.put("numCorrect", numCorrect);
    }

    @NonNull
    public ActionGameFragmentToGameWonFragment setNumQuestion(int numQuestion) {
      this.arguments.put("numQuestion", numQuestion);
      return this;
    }

    @NonNull
    public ActionGameFragmentToGameWonFragment setNumCorrect(int numCorrect) {
      this.arguments.put("numCorrect", numCorrect);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("numQuestion")) {
        int numQuestion = (int) arguments.get("numQuestion");
        __result.putInt("numQuestion", numQuestion);
      }
      if (arguments.containsKey("numCorrect")) {
        int numCorrect = (int) arguments.get("numCorrect");
        __result.putInt("numCorrect", numCorrect);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_gameFragment_to_gameWonFragment;
    }

    @SuppressWarnings("unchecked")
    public int getNumQuestion() {
      return (int) arguments.get("numQuestion");
    }

    @SuppressWarnings("unchecked")
    public int getNumCorrect() {
      return (int) arguments.get("numCorrect");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGameFragmentToGameWonFragment that = (ActionGameFragmentToGameWonFragment) object;
      if (arguments.containsKey("numQuestion") != that.arguments.containsKey("numQuestion")) {
        return false;
      }
      if (getNumQuestion() != that.getNumQuestion()) {
        return false;
      }
      if (arguments.containsKey("numCorrect") != that.arguments.containsKey("numCorrect")) {
        return false;
      }
      if (getNumCorrect() != that.getNumCorrect()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getNumQuestion();
      result = 31 * result + getNumCorrect();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGameFragmentToGameWonFragment(actionId=" + getActionId() + "){"
          + "numQuestion=" + getNumQuestion()
          + ", numCorrect=" + getNumCorrect()
          + "}";
    }
  }
}
