package com.github.basdxz.apparatus.adapter.resource.impl;

import com.github.basdxz.apparatus.adapter.resource.ResourceProviderAdapter;
import com.github.basdxz.apparatus.common.domain.ILocation;
import com.github.basdxz.apparatus.common.domain.IResourceContainer;
import com.github.basdxz.apparatus.common.resource.ITextureResource;
import lombok.*;
import net.minecraft.client.renderer.texture.TextureMap;


@RequiredArgsConstructor
public class BlockIconResourceProvider extends ResourceProviderAdapter<ITextureResource> {
    protected final static String BLOCK_ICON_PREFIX = "textures/blocks";

    @NonNull
    protected final TextureMap textureMap;

    @Override
    protected boolean isSupported(@NonNull IResourceContainer<?> container) {
        return false;
    }

    @Override
    protected Class<ITextureResource> resourceClass() {
        return ITextureResource.class;
    }

    @Override
    protected ITextureResource newResource(@NonNull ILocation<ITextureResource> location) {
        return null;
    }
}