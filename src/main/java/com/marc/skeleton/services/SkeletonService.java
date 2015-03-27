package com.marc.skeleton.services;

import com.marc.skeleton.models.SkeletonModel;

/**
 * @author marc.vis
 */
public interface SkeletonService {

    SkeletonModel getSkeletonModel(Integer id);
    void createSkeletonModel(SkeletonModel skeletonModel);

}
