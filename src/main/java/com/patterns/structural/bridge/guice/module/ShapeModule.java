package com.patterns.structural.bridge.guice.module;

import com.google.inject.AbstractModule;
import com.patterns.structural.bridge.guice.contract.Renderer;
import com.patterns.structural.bridge.guice.service.VectorRenderer;

public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
