package com.marc.skeleton.services;

import com.marc.skeleton.models.SkeletonModel;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author marc.vis
 */
@Component
public class TestSkeletonModel implements SkeletonService {

    private Map<Integer, SkeletonModel> store = new ConcurrentHashMap<Integer, SkeletonModel>();
    private static final SkeletonModel DEFAULT_SKELETON_MODEL = new SkeletonModel(1,"Model","Default");

    public SkeletonModel getSkeletonModel(Integer id) {
        SkeletonModel model = store.get(id);
        return model != null ? model : DEFAULT_SKELETON_MODEL;
    }

    public void createSkeletonModel(SkeletonModel skeletonModel) {
        store.put(skeletonModel.getId(), skeletonModel);
    }
}
