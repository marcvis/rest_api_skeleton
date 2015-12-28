package com.marc.skeleton.services;

import com.marc.skeleton.models.SkeletonModel;
import com.marc.skeleton.services.SkeletonService;
import com.marc.skeleton.services.TestSkeletonService;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestSkeletonServiceTest {
    SkeletonService subject;
    @Before
    public void setup(){

        subject = new TestSkeletonService();
    }
    @Test
    public void saveSkeletonShouldBeRetrievable(){
        //Given
        SkeletonModel expectedModel = new SkeletonModel(42,"testModel","broken");
        subject.createSkeletonModel(expectedModel);
        //When
        SkeletonModel actualModel = subject.getSkeletonModel(42);
        //Then
        assertEquals(expectedModel, actualModel);

    }

}