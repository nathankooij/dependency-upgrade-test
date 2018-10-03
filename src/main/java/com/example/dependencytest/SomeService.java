package com.example.dependencytest;

import com.google.common.collect.ImmutableList;

/**
 * This is some service that runs some models.
 */
public interface SomeService {
    /**
     * XXX: Fix something.
     * @return gets models
     */
    ImmutableList<SomeModel> getModels();
}
