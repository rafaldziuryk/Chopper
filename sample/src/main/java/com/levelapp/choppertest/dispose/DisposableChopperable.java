package com.levelapp.choppertest.dispose;

import com.levelapp.annotation.Lifecycle;
import com.levelapp.annotation.chopperable.Chopperable;

/**
 * Created by rafaldziuryk on 28.12.16.
 */

public class DisposableChopperable implements Chopperable<Disposable, Object> {

  @Override
  public void chopp(Disposable target, Object enclosed, Lifecycle lifecycle) {
    if (target != null){
      target.dispose();
    }
  }
}