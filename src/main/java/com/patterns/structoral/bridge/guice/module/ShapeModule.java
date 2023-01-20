package com.patterns.structoral.bridge.guice.module;

import com.google.inject.AbstractModule;
import com.patterns.structoral.bridge.guice.contract.Renderer;
import com.patterns.structoral.bridge.guice.service.VectorRenderer;

public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
