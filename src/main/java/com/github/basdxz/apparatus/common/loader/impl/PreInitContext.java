package com.github.basdxz.apparatus.common.loader.impl;

import com.github.basdxz.apparatus.common.loader.IEntityLoader;
import com.github.basdxz.apparatus.common.loader.IEntityLoaderRegistry;
import com.github.basdxz.apparatus.common.loader.IPreInitContext;
import com.github.basdxz.apparatus.common.parathing.IEntity;
import com.github.basdxz.apparatus.common.registry.IEntityID;
import lombok.*;

public class PreInitContext extends LoadingContext implements IPreInitContext<IEntity> {
    public PreInitContext(@NonNull IEntityLoaderRegistry loaderRegistry, @NonNull IEntityLoader<IEntity> loader) {
        super(loaderRegistry, loader);
    }

    @Override
    public void register(@NonNull IEntity paraThing) {
        loaderRegistry.register(this, paraThing);
    }

    @Override
    public IEntityID newParaID(@NonNull String paraName) {
        return registry().newParaID(paraName);
    }
}
