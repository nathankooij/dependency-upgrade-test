package com.example.dependencytest;

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.google.common.collect.ImmutableList;
import java.util.stream.IntStream;

public class SomeServiceImpl implements SomeService {
    @Override
    public ImmutableList<SomeModel> getModels() {
        return IntStream.range(0, 10)
                .mapToObj(SomeModel::new)
                .collect(toImmutableList());
    }
}
