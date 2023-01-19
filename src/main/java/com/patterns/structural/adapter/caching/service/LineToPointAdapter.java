package com.patterns.structural.adapter.caching.service;

import com.patterns.structural.adapter.caching.model.Line;
import com.patterns.structural.adapter.caching.model.Point;

import java.util.*;
import java.util.function.Consumer;


/**
 * convert Lines to Points
 */
public class LineToPointAdapter implements Iterable<Point> {

    /**
     * Adapter creates temporary objects, so we cache them in order not to create duplicate objects
     */
    private static int count = 0;
    private static Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;

    public LineToPointAdapter(Line line)
    {
        hash = line.hashCode();
        if(cache.get(hash) != null) return; // we already have points, so we don't generate them again

        ArrayList<Point> points = new ArrayList<>();

        System.out.println(
                String.format("%d: Generating points for line [%d,%d]-[%d,%d] (with caching)",
                        ++count, line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY())
        );

        int left = Math.min(line.getStart().getX(), line.getEnd().getX());
        int right = Math.max(line.getStart().getX(), line.getEnd().getX());
        int top = Math.min(line.getStart().getY(), line.getEnd().getY());
        int bottom = Math.max(line.getStart().getY(), line.getEnd().getY());
        int dx = right - left;
        int dy = line.getEnd().getY() - line.getStart().getY();


        if (dx == 0) {
            for (int y = top; y <= bottom ; y++) {
                points.add(new Point(left, y));
            }
        }

        else if (dy == 0) {
            for (int x = left; x <= right ; x++) {
                points.add(new Point(x, top));
            }
        }

        cache.put(hash, points);

    }

    @Override
    public Iterator<Point> iterator() {
        return cache.get(hash).iterator();
    }


    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hash).spliterator();
    }
}
