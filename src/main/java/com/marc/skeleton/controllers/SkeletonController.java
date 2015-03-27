package com.marc.skeleton.controllers;

import com.marc.skeleton.models.SkeletonModel;
import com.marc.skeleton.services.SkeletonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/skeleton")
public class SkeletonController {

    @Resource
    private SkeletonService attributionService;

    @RequestMapping(method= RequestMethod.POST)
    public void create(@RequestBody SkeletonModel skeletonModel,
                       HttpServletRequest request, HttpServletResponse response) {

        attributionService.createSkeletonModel(skeletonModel);
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
    }

    @RequestMapping(method=RequestMethod.GET)
    public SkeletonModel get(@PathVariable Integer id,
                                    HttpServletRequest request, HttpServletResponse response) {

        SkeletonModel skeletonModel = attributionService.getSkeletonModel(id);
        response.setStatus(HttpServletResponse.SC_OK);
        return skeletonModel;
    }

}
