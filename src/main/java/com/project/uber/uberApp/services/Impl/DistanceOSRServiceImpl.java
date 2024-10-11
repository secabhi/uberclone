package com.project.uber.uberApp.services.Impl;

import com.project.uber.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceOSRServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point des) {
        return 0;
    }
}
