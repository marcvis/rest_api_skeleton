package com.marc.skeleton.services;

import com.marc.skeleton.models.SkeletonModel;

public interface SkeletonService {

    SkeletonModel getSkeletonModel(Integer id);
    void createSkeletonModel(SkeletonModel skeletonModel);

}
