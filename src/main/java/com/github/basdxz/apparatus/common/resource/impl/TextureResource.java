package com.github.basdxz.apparatus.common.resource.impl;

import com.github.basdxz.apparatus.common.resource.IResourceType;
import com.github.basdxz.apparatus.common.resource.ITextureResource;
import lombok.*;
import lombok.experimental.*;

import static com.github.basdxz.apparatus.common.resource.impl.ResourceType.TEXTURE;

@Getter
@AllArgsConstructor
@Accessors(fluent = true, chain = true)
public class TextureResource implements ITextureResource {
    protected final String domain;
    protected final String location;

    @Override
    public IResourceType type() {
        return TEXTURE;
    }
}
