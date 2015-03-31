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
    private SkeletonService skeletonService;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody SkeletonModel skeletonModel,
                       HttpServletRequest request, HttpServletResponse response) {

        skeletonService.createSkeletonModel(skeletonModel);
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public SkeletonModel get(@PathVariable Integer id,
                                    HttpServletRequest request, HttpServletResponse response) {

        SkeletonModel skeletonModel = skeletonService.getSkeletonModel(id);
        response.setStatus(HttpServletResponse.SC_OK);
        return skeletonModel;
    }

    @RequestMapping(method=RequestMethod.PUT)
    public void update(@RequestBody SkeletonModel skeletonModel,
                                HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable Integer id,
                       HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    }

}
