package ru.vsu.cs.cg.model;

import ru.vsu.cs.cg.math.Vector2;
import ru.vsu.cs.cg.math.Vector3;

import java.util.ArrayList;

public class Model {

    public ArrayList<Vector3> vertices = new ArrayList<Vector3>();
    public ArrayList<Vector2> textureVertices = new ArrayList<Vector2>();
    public ArrayList<Vector3> normals = new ArrayList<Vector3>();
    public ArrayList<Polygon> polygons = new ArrayList<Polygon>();
}